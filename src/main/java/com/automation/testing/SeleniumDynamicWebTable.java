//package com.automation.testing;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//
//import java.util.List;
//
//public class SeleniumDynamicWebTable {
//
//    public static void main(String args[]) {
//
//        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//
//        WebDriver driver = new ChromeDriver(options);
//        driver.get("https://demo.guru99.com/test/web-table-element.php");
//        driver.manage().window().maximize();
//
//        String beforeXpathHeader="(//table[@class='dataTable']//thead//tr//th)[";
//        String afterXpathHeader="]";
//        List<WebElement> header = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
//        for (int i =1;i<=header.size();i++) {
//            String finalXpathHeader= beforeXpathHeader + i + afterXpathHeader;
//            String text = driver.findElement(By.xpath(finalXpathHeader)).getText();
//            System.out.println(text);
//        }
//
//        String beforeXpathBody="//table[@class='dataTable']//tbody//tr[";
//
//
//
//        String afterXpathBody="]";
//
//        String tdXpath="//td";
//
//        String beforeXpathBodyTd="//td[";
//        String afterXpathBodyTd="]";
//
//
//       List<WebElement> listBody= driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
//
//
//
//       for(int i=1;i<=listBody.size();i++) {
//
//           String finalXpath= beforeXpathBody + i + afterXpathBody + tdXpath;
//
//           List<WebElement> element = driver.findElements(By.xpath(finalXpath));
//
//           for(int j=1;j<=element.size();j++) {
//               String xpath = beforeXpathBody + i + afterXpathBody + beforeXpathBodyTd + j + afterXpathBodyTd;
//
//               String text= driver.findElement(By.xpath(xpath)).getText();
//               System.out.println(text);
//
//               if(text.contains("Welspun Corp") || text.contains("Bata India")) {
//
//                   driver.findElement(By.linkText("Welspun Corp")).click();
//
//               }
//           }
//
//
//
//
//
//       }
//
//
//
//
//
//
//
//
//
//
//
//    }
//
//
//}
