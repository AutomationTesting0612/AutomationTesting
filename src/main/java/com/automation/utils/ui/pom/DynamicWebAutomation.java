package com.automation.utils.ui.pom;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Map;

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
            String expectedTitle = action.get("validateTitle");
            String title = action.get("validateTitle");
            String browsertype = action.get("browser");




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
                    case "title":
                        if (!validateTitle(expectedTitle)) {
                            logStep(Status.FAIL, actionType, "Title validation failed! Expected: " + expectedTitle +
                                    " | Found: " + driver.getTitle());
                            extent.flush();
//                            throw new AssertionError("Title validation failed!");
                        } else {
                            logStep(Status.PASS, actionType, "Title validation successful: " + expectedTitle);
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


        closeBrowser();
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
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--ignore-certificate-errors");
                driver = new ChromeDriver();
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




}
