package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import step.def.TestBase;

public class Home extends TestBase {

    public Home(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }






}
