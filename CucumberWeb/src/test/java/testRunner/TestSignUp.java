package testRunner;

/**
 * Created by rishabh.sakhare on 8/8/2019.
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/features/signup.feature"},
        glue = {"stepDefinations"},
        format = {"pretty", "html:target/cucumber-report-signUp"},
        monochrome = true
)
public class TestSignUp {
}
