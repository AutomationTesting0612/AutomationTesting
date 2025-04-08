package com.automation.utils.ui.pom;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.mail.*;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public abstract class  AbstractUIAutomation {

    protected static WebDriver driver;
    protected String mainWindowHandle;

    public abstract void openBrowser(String browserType);
//    {
//        if (driver == null) {
//            if ("chrome".equalsIgnoreCase(browserType)) {
//            driver = new ChromeDriver();
//                WebDriverManager.chromedriver().setup();
//                ChromeOptions options = new ChromeOptions();
////            options.addArguments("--start-maximized");
//            options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
                //           options.addArguments("--headless");
//           options.addArguments("--remote-allow-origins=*");
//           options.addArguments("--ignore-ssl-errors=ye");
//                options.addArguments("--ignore-certificate-errors");
//
//           options.addArguments("--no-sandbox");
//           options.addArguments("--disable-dev-shm-usage");
//           options.addArguments("start-maximized");
//                driver = new ChromeDriver();
//            } else if ("firefox".equalsIgnoreCase(browserType)) {
//                driver = new FirefoxDriver();
//            } else if ("edge".equalsIgnoreCase(browserType)) {
//                driver = new EdgeDriver();
//            } else {
//                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
//            }
//
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//            driver.manage().window().maximize();
//        }



//    }

    // Open a website dynamically
    public void openWebsite(String url) {
        driver.get(url);
        handleAlert();
    }

    // Perform login dynamically using provided XPath
    public void performLogin(Map<String, String> loginDetails) {
        try {
            WebElement usernameField = driver.findElement(By.xpath(loginDetails.get("usernameXpath")));
            WebElement passwordField = driver.findElement(By.xpath(loginDetails.get("passwordXpath")));
            WebElement loginButton = driver.findElement(By.xpath(loginDetails.get("loginButtonXpath")));

            usernameField.sendKeys(loginDetails.get("username"));
            passwordField.sendKeys(loginDetails.get("password"));
            loginButton.click();
            performRandomClicks();
        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }

    // Generic click action
    public void clickElement(String xpath) {
        try {
            WebElement element = driver.findElement(By.xpath(xpath));
            element.click();
            handleAlert();
            performRandomClicks();
        } catch (Exception e) {
            System.out.println("Click action failed: " + e.getMessage());
        }
    }

    // Generic input action
    public void enterText(String xpath, String text) {
        try {
            WebElement element = driver.findElement(By.xpath(xpath));
            element.sendKeys(text);
            handleAlert();
//            performRandomClicks(10);
        } catch (Exception e) {
            System.out.println("Typing action failed: " + e.getMessage());
        }
    }


    // Generic scroll action
    public void scrollToElement(String xpath) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = driver.findElement(By.xpath(xpath));
            JavascriptExecutor js = (JavascriptExecutor) driver;

            // Scroll until the element is fully visible
            while (!isElementInViewport(element)) {
                js.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'nearest'});", element);
                Thread.sleep(500); // Small delay to allow the scroll action to complete
            }

            wait.until(ExpectedConditions.elementToBeClickable(element));

            // Click using JavaScript in case WebDriver fails
            try {
                element.click();
            } catch (Exception e) {
                js.executeScript("arguments[0].click();", element);
            }


            handleAlert();
            performRandomClicks();
        } catch (Exception e) {
            System.out.println("Scrolling action failed: " + e.getMessage());
        }
    }

    /**
     * Check if an element is inside the visible viewport
     */
    private boolean isElementInViewport(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return (Boolean) js.executeScript(
                "var rect = arguments[0].getBoundingClientRect(); " +
                        "return (rect.top >= 0 && rect.left >= 0 && rect.bottom <= window.innerHeight && rect.right <= window.innerWidth);",
                element
        );
    }


    public boolean handleAlert() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
            wait.until(ExpectedConditions.alertIsPresent());

            Alert alert = driver.switchTo().alert();
            System.out.println("Alert Found: " + alert.getText());
            alert.accept(); // Accepts the alert (Click "OK")
            return true;
        } catch (NoAlertPresentException | TimeoutException e) {
            System.out.println("No alert present.");
            return false;
        }
    }

//    public void handleRadio(String xpath) {
//       WebElement radioButton = driver.findElement(By.xpath(xpath));
//       radioButton.click();
//    }

    public void performRandomClicks() throws InterruptedException {
        Random random = new Random();
        JavascriptExecutor js = (JavascriptExecutor) driver;


        // Get page width and height

        // Generate random (x, y) coordinates
        int x = random.nextInt(200); // Adjust based on screen width
        int y = random.nextInt(500);
        js.executeScript("document.elementFromPoint(arguments[0], arguments[1\n" +
                "        Long width = (Long) js.executeScript(\"return window.innerWidth;\");\n" +
                "        Long height = (Long) js.executeScript(\"return window.innerHeight;\");]).click();", x, y);

        // Wait before next click
        Thread.sleep(2000);
    }

    // Close browser
//    public void closeBrowser() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

    public boolean validate(String xpath, String expectedValue) {
        String actualValue = driver.findElement(By.xpath(xpath)).getText();
        if (actualValue.equalsIgnoreCase(expectedValue)) {
            return true;
        }
        return false;

    }

    public void switchWindow(String xpath, String email) {
        WebDriver newDriver = new ChromeDriver();

        String mainHandle = newDriver.getWindowHandle();
        Set<String> allHandles = newDriver.getWindowHandles();
        for (String handle : allHandles) {
            if (!handle.equals(mainHandle)) {
                newDriver.switchTo().window(handle);
                newDriver.manage().window().maximize();
                break;
            }
        }

        newDriver.findElement(By.xpath(xpath)).sendKeys(email);
    }

    public void getEmail(String serverDomain, String emailXpath){
        String emailId = "user" + System.currentTimeMillis() + "@" + serverDomain;
        driver.findElement(By.xpath(emailXpath)).sendKeys(emailId);

    }



    public void closeBrowser() {
        driver.quit();
        driver.close();

    }


    public void getOtpFromEmail(String email, String password, String xpath) {
        try {
            String host = "imap.gmail.com";
            Properties props = new Properties();
            props.put("mail.store.protocol", "imaps");
            Session session = Session.getInstance(props);
            Store store = session.getStore("imaps");
            store.connect(host, email, password);
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_WRITE);
            Message[] messages = inbox.getMessages();
            for (int i = messages.length - 1; i >= 0; i--) { // Checking latest emails
                MimeMessage msg = (MimeMessage) messages[i];
                String subject = msg.getSubject();
                if (subject.contains("OTP")) {  // 🔥 Modify based on actual subject
                    String content = msg.getContent().toString();

                    Matcher matcher = Pattern.compile("\\b\\d{6}\\b").matcher(content);
                    if (matcher.find()) {
                        inbox.close(false);
                        store.close();
                        driver.findElement(By.xpath(xpath)).sendKeys(matcher.group());
//                        return matcher.group();  //
                    }
                }
            }
            inbox.close(false);
            store.close();
        } catch (NoSuchProviderException e) {
            throw new RuntimeException("No Such Provider Exception: " + e.getMessage());
        } catch (MessagingException e) {
            throw new RuntimeException("Messaging Exception: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException("IO Exception: " + e.getMessage());
        }
//        return "000000"; //
    }

    // Abstract method to execute UI interactions based on incoming message
    public abstract void executeAutomation(List<Map<String, String>> actionSequence, String featureName);
}
