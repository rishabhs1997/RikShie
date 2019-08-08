package stepDefinations;

import cucumber.api.java.en.Given;
import io.appium.java_client.android.AndroidDriver;
import resources.Utility;

import java.net.MalformedURLException;

/**
 * Created by rishabh.sakhare on 8/1/2019.
 */
public class LaunchApp {

    @Given("^i launch the app$")
    public void i_launch_the_app() throws MalformedURLException {
        Utility.getDriver();
    }



}
