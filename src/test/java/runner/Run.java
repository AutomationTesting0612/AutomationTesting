package runner;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(dryRun = true, features = "features", glue = "step.def",
        tags = "@Test", format = {"pretty", "html:target/cucumber"}

)
public class Run {
}


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
