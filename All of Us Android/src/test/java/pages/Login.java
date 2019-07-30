package pages;

import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.*;

import io.appium.java_client.MobileElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

/**
 * Created by rishabh.sakhare on 7/26/2019.
 */
public class Login {

    public final String expectedLine1 = "Welcome";
    static AndroidDriver<MobileElement> driver;
    static String existinguserEmail,userPass;



    public void sendInput(String userEmail) throws MalformedURLException {

        driver = Utility.getDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(driver,20);

        try {

            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/signin_fields_login_hintText")));
            driver.findElementById("com.acadia.pmistaging:id/signin_fields_login_hintText").sendKeys(userEmail);

            driver.hideKeyboard();

            driver.findElementById("com.acadia.pmistaging:id/signin_fields_password").sendKeys(Utility.getUserPass());
            driver.findElementById("com.acadia.pmistaging:id/signin_fields_login_hintText").click();
            driver.hideKeyboard();
            driver.findElementById("com.acadia.pmistaging:id/signin_fields_password").click();


            driver.hideKeyboard();

            //wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button")));
            driver.findElementByClassName("android.widget.Button").click();


            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Welcome']")));
            Assert.assertEquals(expectedLine1, driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Welcome']")).getText());

            System.out.println("\n LOGIN : SUCCESSFULL");

        }catch(AssertionError e)
        {
            //System.out.println("Error : "+driver.findElement(By.id("com.acadia.pmistaging:id/textinput_error")).getText());
            System.out.println("\n LOGIN : FAILED");
        }
        catch(Exception e)
        {
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/textinput_error")));
            System.out.println("\n Error : " + driver.findElement(By.id("com.acadia.pmistaging:id/textinput_error")).getText());
            System.out.println("\n LOGIN : FAILED");

        }

        finally {
            driver.closeApp();
        }

    }

}
