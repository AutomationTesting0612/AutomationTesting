package fluentDOP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import step.def.TestBase;

public class HomeFluent extends TestBase {

    public HomeFluent(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }






}
