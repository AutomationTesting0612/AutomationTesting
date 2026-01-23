package com.automation.pom;

import com.automation.def.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Home extends TestBase {

    public Home(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }






}
