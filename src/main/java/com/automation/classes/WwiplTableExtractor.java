package com.automation.classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.*;

import java.io.FileOutputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class WwiplTableExtractor {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        try {
            String url = "https://wwipl.com/";
            driver.get(url);

            WebElement offeringsMenu = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Offerings')]"))
            );

            // Locate submenu element
            WebElement preIpoMenu = wait.until(
                    ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'Mergers and Amalgamations')]"))
            );

            // Perform hover and click in one chain — prevents dropdown from closing
            Actions actions = new Actions(driver);
            actions.moveToElement(offeringsMenu)
                    .pause(Duration.ofSeconds(1)) // small delay to let dropdown appear
                    .moveToElement(preIpoMenu)
                    .click()
                    .build()
                    .perform();


            // Step 2: Wait until the table loads
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='table table-bordered notdborder']")));

            // Step 3: Initialize Excel workbook
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Merged Companies");
            int excelRowNum = 0;

            // Step 4: Extract table headers
            List<WebElement> headers = driver.findElements(By.xpath("//table[@class='table table-bordered notdborder']//thead//th"));
            Row headerRow = sheet.createRow(excelRowNum++);
            int colNum = 0;

            for (WebElement th : headers) {
                String headerText = th.getText().trim();
                if (!headerText.isEmpty()) {
                    headerRow.createCell(colNum++).setCellValue(headerText);
                }
            }

            // Step 5: Extract all table rows
            List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-bordered notdborder']//tbody/tr"));
            System.out.println("📊 Total rows found: " + rows.size());

            for (WebElement row : rows) {
                List<WebElement> cols = row.findElements(By.tagName("td"));
                Row excelRow = sheet.createRow(excelRowNum++);
                int cellNum = 0;

                for (WebElement col : cols) {
                    String cellValue = col.getText().trim();

                    // Handle link inside cell
                    try {
                        WebElement link = col.findElement(By.tagName("a"));
                        if (link != null && link.getAttribute("href") != null) {
                            cellValue = link.getText().trim() + " (" + link.getAttribute("href") + ")";
                        }
                    } catch (NoSuchElementException ignored) {}

                    excelRow.createCell(cellNum++).setCellValue(cellValue);
                }
            }

            // Step 6: Auto-size all columns
            for (int i = 0; i < headers.size(); i++) {
                sheet.autoSizeColumn(i);
            }

            // Step 7: Save Excel file
            String fileName = "WWIPL_Merger_Table.xlsx";
            try (FileOutputStream out = new FileOutputStream(fileName)) {
                workbook.write(out);
            }
            workbook.close();

            System.out.println("✅ Data extracted successfully! File saved as: " + fileName);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}