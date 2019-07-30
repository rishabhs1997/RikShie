package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.functions.ExpectedCondition;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Utility;

import java.net.MalformedURLException;
import java.time.Duration;

/**
 * Created by rishabh.sakhare on 7/26/2019.
 */
public class Register {

    static AndroidDriver<MobileElement> driver;
    static String existinguserEmail,userPass;

    private final String expectedLine1 = "Create a New Account";

    private final String expectedText1 = "Create a new account";
    private final String expectedText2 = "Email Address";
    private final String expectedText3 = "e.g. example@email.com";
    private final String expectedText4 = "Register with a Mobile Number";
    private final String expectedText5 = "Create password";
    private final String expectedText6 = "Show";
    private final String expectedText7 = "Password requirements:";
    private final String expectedText8 = "Minimum 8 Characters";
    private final String expectedText9 = "Contains a Number";
    private final String expectedText10 = "Contains Uppercase Letter";
    private final String expectedText11 = "Contains Lowercase Letter";
    private final String expectedText12 = "Contains Special Character";
    private final String expectedText13 = "Continue";
    private final String expectedText14 = "Already have an account? Sign In";
    private final String expectedText15 = "Your security is important to us. We use technology to encrypt, safeguard, and secure your personal information. Please view our privacy policy for more information. By clicking Sign Up, you agree to our Terms and that you have read our Data Policy.";


    public void sendInput() throws MalformedURLException {

        driver = Utility.getDriver();

        WebDriverWait wait = new WebDriverWait(driver,20);

        //finding link and clicking on main page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/signin_action_signup")));
        driver.findElementById("com.acadia.pmistaging:id/signin_action_signup").click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
        driver.findElementByClassName("android.widget.EditText").sendKeys(Utility.getUserEmail());    //email

        driver.hideKeyboard();
        driver.findElementById("com.acadia.pmistaging:id/signup_fields_password_text").sendKeys(Utility.getUserPass());   //password
        driver.hideKeyboard();

        Utility.scroll2();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.acadia.pmistaging:id/signup_action_button_next")));
        driver.findElementById("com.acadia.pmistaging:id/signup_action_button_next").click();       //click continue

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/securityQuestions_header_primary")));
            Assert.assertEquals(expectedLine1, driver.findElement(By.id("com.acadia.pmistaging:id/securityQuestions_header_primary")).getText());

            System.out.println("\n REGISTRATION : PASSED");

        }catch(AssertionError e)
        {
            System.out.println("\n REGISTRATION : FAILED");
        }
    }


    public void checkContent() throws MalformedURLException {

        driver = Utility.getDriver();

        WebDriverWait wait = new WebDriverWait(driver,20);

/*        Wait wait  = new FluentWait(driver)
                     .withTimeout(Duration.ofSeconds(30))
                     .pollingEvery(Duration.ofSeconds(5));*/

        driver.hideKeyboard();

        //finding and clicking New user on main page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/signin_action_signup")));
        driver.findElementById("com.acadia.pmistaging:id/signin_action_signup").click();

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/signup_title")));
            Assert.assertEquals(expectedText1, driver.findElement(By.id("com.acadia.pmistaging:id/signup_title")).getText());

            Assert.assertEquals(expectedText2, driver.findElement(By.id("com.acadia.pmistaging:id/signup_fields_email_label")).getText());

            Assert.assertEquals(expectedText3, driver.findElement(By.id("com.acadia.pmistaging:id/signup_fields_email_hintText")).getText());
            driver.hideKeyboard();

            Assert.assertEquals(expectedText4, driver.findElement(By.id("com.acadia.pmistaging:id/signup_actions_showPhone")).getText());

            Assert.assertEquals(expectedText5, driver.findElement(By.id("com.acadia.pmistaging:id/signup_fields_password_label")).getText());

            Assert.assertEquals(expectedText6, driver.findElement(By.id("com.acadia.pmistaging:id/signup_actions_showPassword")).getText());

            Assert.assertEquals(expectedText7, driver.findElement(By.id("com.acadia.pmistaging:id/password_requirements_view")).getText());

            Assert.assertEquals(expectedText8, driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.acadia.pmistaging:id/text_requirement_view']")).getText());

            Assert.assertEquals(expectedText8, driver.findElement(By.xpath("//android.widget.TextView[@text='Minimum 8 Characters']")).getText());

            Assert.assertEquals(expectedText9, driver.findElement(By.xpath("//android.widget.TextView[@text='Contains a Number']")).getText());

            Assert.assertEquals(expectedText10, driver.findElement(By.xpath("//android.widget.TextView[@text='Contains Uppercase Letter']")).getText());


            Assert.assertEquals(expectedText11, driver.findElement(By.xpath("//android.widget.TextView[@text='Contains Lowercase Letter']")).getText());

            Utility.scroll2();

            Assert.assertEquals(expectedText12, driver.findElement(By.xpath("//android.widget.TextView[@text='Contains Special Character']")).getText());

            Assert.assertEquals(expectedText13, driver.findElement(By.id("com.acadia.pmistaging:id/signup_action_button_next")).getText());

            Assert.assertEquals(expectedText14, driver.findElement(By.id("com.acadia.pmistaging:id/signup_actions_signin")).getText());

            Assert.assertEquals(expectedText15, driver.findElement(By.id("com.acadia.pmistaging:id/signup_text_termsDataPolicy")).getText());

            System.out.println("\n REGISTRATION CONTENT : PASSED");

        }
        catch(AssertionError e)
        {
            System.out.println("\n REGISTRATION CONTENT : FAILED");
            e.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
