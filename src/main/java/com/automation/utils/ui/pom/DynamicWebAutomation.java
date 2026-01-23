package com.automation.utils.ui.pom;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DynamicWebAutomation extends AbstractUIAutomation {

    private static ExtentReports extent;
    private static ExtentTest test;

    public DynamicWebAutomation(String browser) {
        openBrowser(browser);
        setupExtentReports();
    }

    @Override
    public void executeAutomation(List<Map<String, String>> actionSequence, String featureName) {

//        String featureName = actionSequence.get(0).get("featureName");

        test = extent.createTest("Feature: " + featureName)
                .assignCategory("UI API Testing")
                .assignAuthor("Automation Team");
        for (Map<String, String> action : actionSequence) {
            String actionType = action.get("action");
            String xpath = action.get("xpath");
            String value = action.get("value");
            String pass = action.get("password");
            String mainWindowHandle = driver.getWindowHandle();

            try {
                switch (actionType.toLowerCase()) {
                    case "open":
                        openWebsite(value);
//                        validate("URL", value, driver.getTitle());
                        break;
                    case "click":
                        clickElement(xpath);
                        logStep(Status.PASS, actionType, "Clicked element: " + xpath);
                        break;
                    case "text":
                        enterText(xpath, value);
                        logStep(Status.PASS, actionType, "Entered text: '" + value + "' into " + xpath);
                        break;
                    case "scroll":
                        scrollToElement(xpath);
                        logStep(Status.PASS, actionType, "Scrolled to element: " + xpath);
                        break;
                    case "otp":
                        getOtpFromEmail(value, pass, xpath);
                        logStep(Status.PASS, actionType, "Scrolled to element: " + xpath);
                        break;
                    case "window":
                        switchToPopupWindow(driver, mainWindowHandle, 10);
                    case "main":
                        switchToMain();
                    case "validate":
                        if (!validate(xpath, value)) {
                            logStep(Status.FAIL, actionType, "Validation failed! Expected: " + value +
                                    " | Found: " + driver.findElement(By.xpath(xpath)).getText());

//                            throw new AssertionError("Title validation failed!");
                        } else {
                            logStep(Status.PASS, actionType, "Title validation failed! Expected: " + value +
                                    " | Found: " + driver.findElement(By.xpath(xpath)).getText());
                        }
                        break;
                    default:
                        logStep(Status.WARNING, actionType, "Unknown action: " + actionType);
                }
                System.out.println("Step Executed: " + actionType + " | Locator: " + xpath + " | Value: " + value);
            } catch (Exception e) {
                System.err.println("Failed Step: " + actionType + " | Locator: " + xpath + " | Value: " + value);
                e.printStackTrace();
            }

        }

        extent.flush();
//        closeBrowser();
    }

    private void validate(String validationType, String expected, String actual) {
        if (expected.equalsIgnoreCase(actual)) {
            logStep(Status.PASS, validationType, validationType + " validation successful: " + expected);
        } else {
            logStep(Status.FAIL, validationType, validationType + " validation failed! Expected: " + expected + " | Found: " + actual);
            extent.flush();
//        throw new AssertionError(validationType + " validation failed!");
        }
    }

    private void logStep(Status status, String actionType, String message) {
        test.log(status, "**Action:** " + actionType + "<br>**Details:** " + message);
        System.out.println(status + ": " + message);
    }

    private static void setupExtentReports() {

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(new File("C:\\Users\\pc\\IdeaProjects\\AutomationTesting\\UITestReport.html"));
        htmlReporter.config().setDocumentTitle("UI Test Report");
        htmlReporter.config().setReportName("UI Message Processing");
        htmlReporter.config().setTheme(Theme.STANDARD);

        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Environment", "Local");
        extent.setSystemInfo("Tester", "Automation Team");

    }

    @Override
    public void openBrowser(String browserType) {
            if ("chrome".equalsIgnoreCase(browserType)) {
                File file = new File("C:\\Users\\pc\\IdeaProjects\\AutomationTesting\\AdBlock.crx");
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--ignore-certificate-errors");
                options.setExperimentalOption("excludeSwitches", java.util.Arrays.asList("enable-automation"));
                options.addExtensions(file);
                options.addArguments("--disable-popup-blocking");
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-notifications");
                options.addArguments("--no-default-browser-check");
                options.addArguments("--disable-save-password-bubble");  // Disable save password prompt
                options.addArguments("--disable-password-generation");   // Disable password generation
                options.addArguments("--disable-infobars");             // Remove infobar messages
                driver = new ChromeDriver(options);
                try { Thread.sleep(5000); } catch (InterruptedException e) {}

//                 Get current window handles and close unwanted tabs
                for (String handle : driver.getWindowHandles()) {
                    driver.switchTo().window(handle);
                    if (!driver.getCurrentUrl().contains("getadblock.com")) {
                        driver.close();
                    }
                }
            } else if ("firefox".equalsIgnoreCase(browserType)) {
                driver = new FirefoxDriver();
            } else if ("edge".equalsIgnoreCase(browserType)) {
                driver = new EdgeDriver();
            } else {
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }

    public void switchToPopupWindow(WebDriver driver, String mainWindowHandle, long timeoutSeconds) {
        new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds))
                .until(d -> d.getWindowHandles().size() > 1);

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                driver.manage().window().maximize();
                return;
            }
        }
        throw new RuntimeException("Popup window did not appear");
    }

    private void switchToMain() {
        driver.switchTo().window(mainWindowHandle);
    }




}
