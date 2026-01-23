package com.automation.fluentDOP;

import com.automation.def.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeFluent extends TestBase {

    public HomeFluent(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }






}
