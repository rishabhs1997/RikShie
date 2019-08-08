package testRunner;

/**
 * Created by rishabh.sakhare on 7/31/2019.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/features/"},
        glue = {"stepDefinations"},
        format = {"pretty", "html:target/cucumber-report-correctLogin"},
        tags = {"@Correct"},
        monochrome = true
)
public class TestRunnerCorrect {
}
