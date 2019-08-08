package testRunner;

/**
 * Created by rishabh.sakhare on 8/7/2019.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/features/"},
        glue = {"stepDefinations"},
        format = {"pretty", "html:target/cucumber-report-primaryConsent"},
        monochrome = true,
        tags = {"@SmokeTest"}
)

public class TestPrimaryConsent {
}
