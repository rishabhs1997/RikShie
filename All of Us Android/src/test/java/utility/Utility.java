package utility;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Created by rishabh.sakhare on 7/26/2019.
 */
public class Utility {

    static AndroidDriver<MobileElement> driver;

    static String existinguserEmail="vignetTest5@gmail.com",userEmail="vignetTest8@gmail.com",invaliduserEmail="vignet";
    static String userPass="Aa@12345";
    static int driverflag = 0;

    public static int setDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName","ViG-521");
        cap.setCapability("udid","02157df29c32133e");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "7.0");

        cap.setCapability("appPackage", "com.acadia.pmistaging");
        cap.setCapability("appActivity", "com.vibrent.features.core.ui.StartActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url,cap);

        System.out.println("Application Started!! ");

        return 1;
    }


    public static  MobileElement scroll(String scrollableList, String uiSelector, String contentDesc) {
        MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().resourceId(\"" + scrollableList + "\")).getChildByDescription("
                        + "new UiSelector().className(\"" + uiSelector + "\"), \"" + contentDesc + "\")"));

        return element;

    }



    //Generic function for Scroll
    public static void scroll2() {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(1340, 2150))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(1360, 240)).release().perform();
    }


    public static AndroidDriver getDriver() throws MalformedURLException {


        if(driverflag == 0) {
            driverflag = setDriver();
        }

        if(driver.isDeviceLocked())
        {
            driver.unlockDevice();
        }

        return driver;
    }

    public static String getUserEmail()
    {
        return userEmail;
    }

    public static String getExistinguserEmail()
    {
        return existinguserEmail;
    }

    public static String getInvaliduserEmail()
    {
        return invaliduserEmail;
    }

    public static String getUserPass()
    {
        return userPass;
    }

}
