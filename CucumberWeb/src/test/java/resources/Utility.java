package resources;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Point;


import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

/**
 * Created by rishabh.sakhare on 7/26/2019.
 */
public class Utility {

    public static AndroidDriver<MobileElement> driver;

    static String existinguserEmail="vignetTest20@gmail.com",userEmail="vignetTest21@gmail.com",invaliduserEmail="vignet";
    static String userPass="Aa@12345";
    static int driverflag = 0;

    public WebDriverWait wait = new WebDriverWait(driver,20);


    public static int setDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
//GALA
        cap.setCapability("deviceName","ViG-521");
        cap.setCapability("udid","02157df29c32133e");

        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "7.0");

        cap.setCapability("app","C:\\Users\\rishabh.sakhare\\Downloads\\All_of_Us_Staging.apk");
        cap.setCapability("appPackage", "com.acadia.pmistaging");
        cap.setCapability("appActivity", "com.vibrent.features.core.ui.StartActivity");


//Shreyas
/*

        caps.setCapability("deviceName", "Roch-391");
        caps.setCapability("udid", "4d00d575b853a055");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "5.0");

        caps.setCapability("appPackage", "com.acadia.pmistaging");
        caps.setCapability("appActivity", "com.vibrent.features.core.ui.StartActivity");
*/


        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(url,cap);

        System.out.println("Application Started!! ");

        driver.unlockDevice();
        return 1;
    }





    //Generic function for Scroll
    public static void scroll2() {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(1340, 2150))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(PointOption.point(1360, 240)).release().perform();
    }



    //Generic function for Scroll
    public static void scrollLong() {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(1340, 2150))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(1360, 240)).release().perform();
    }

    //Generic function for short Scroll
    public static void scrollShort() {
        TouchAction actions = new TouchAction(driver);
        actions.press(PointOption.point(1016, 1044))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(4)))
                .moveTo(PointOption.point(1016, 1591)).release().perform();
    }


    public static void tap(AndroidDriver driver, Point location) {
        TouchAction action = new TouchAction(driver);
        action.tap(PointOption.point(location.getX() +982, location.getY()+71)).perform();
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

