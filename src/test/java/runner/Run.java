package runner;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.*;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = {"src/test/resources/features"}, glue = {"step.def"},
        tags = "@1111", plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true

)
public class Run {

    @AfterClass
    public static void writeExtentReport() throws FileNotFoundException {
        try {
            InputStream inputStream = Files.newInputStream(Paths.get("config.xml"));
            Reporter.loadXMLConfig(inputStream.toString());
        } catch (IllegalArgumentException io) {
            io.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}


//Cucumber is tool where we write feature files (Test Scenarios) and step definitions classes (feature file code)
//jnuit framework used to run the cucumber test

//@RunWith(Cucumber.class) --> This tells junit what is the test runner
//@Cucumber.Options --> This will give additional configuration to the runner
// dry Run =true --> It will verify the individual step in Feature file and implementation of code of steps in feature file. A message will thrown if implementation is not done
//in any step of feature file

// feature --> give the path of feature file
// glue--> give the package name of step definition
//tag--> enter the tag which is present in feat
//
// ure file
// format--> will give report
