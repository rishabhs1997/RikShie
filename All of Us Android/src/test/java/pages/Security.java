package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.Utility;

import java.net.MalformedURLException;

/**
 * Created by rishabh.sakhare on 7/26/2019.
 */
public class Security {

    static AndroidDriver<MobileElement> driver;
    static String existinguserEmail, userPass;

    private final String expectedLine1 = "Welcome";

    private final String expectedText1 = "Create a New Account";
    private final String expectedText2 = "Please answer the following security questions. Your answers must have a minimum of 5 characters. No two answers can be the same.";
    private final String expectedText3 = "What is the last name of your favorite school teacher?";
    private final String expectedText4 = "Your answer";
    private final String expectedText5 = "What is the name of your favorite song?";
    private final String expectedText6 = "What is the furthest place to which you have traveled?";
    private final String expectedText7 = "Sign Up";
    private final String expectedText8 = "Your security is important to us. We use technology to encrypt, safeguard, and secure your personal information. Please view our privacy policy for more information. By clicking Sign Up, you agree to our Terms and that you have read our Data Policy.";


    public void sendInput() throws MalformedURLException {

        driver = Utility.getDriver();

        WebDriverWait wait = new WebDriverWait(driver, 30);

        //finding link and clicking on main page
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/edt_question1")));     //ques 1
        driver.findElementById("com.acadia.pmistaging:id/edt_question1").sendKeys("Anything1");
        driver.hideKeyboard();


        Utility.scroll2();
        driver.findElementById("com.acadia.pmistaging:id/edt_question2").sendKeys("Anything2");
        driver.hideKeyboard();

        Utility.scroll2();
        driver.findElementById("com.acadia.pmistaging:id/edt_question3").sendKeys("Anything3");
        driver.hideKeyboard();

        Utility.scroll2();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button")));
        driver.findElementByClassName("android.widget.Button").click();


        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Welcome']")));
            Assert.assertEquals(expectedLine1, driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Welcome']")).getText());

            System.out.println("\n SECURITY : PASSED");

        } catch (AssertionError e) {
            System.out.println("\n SECURITY : FAILED");
        }

        catch(Exception e)
        {
            System.out.println("\n Connection is Taking too Long");
            System.out.println("\n SECURITY : FAILED");
        }
    }


    public void checkContent() throws MalformedURLException {

        driver = Utility.getDriver();

        WebDriverWait wait = new WebDriverWait(driver, 20);

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/securityQuestions_header_primary")));
            Assert.assertEquals(expectedText1, driver.findElement(By.id("com.acadia.pmistaging:id/securityQuestions_header_primary")).getText());

            Assert.assertEquals(expectedText2, driver.findElement(By.id("com.acadia.pmistaging:id/securityQuestions_header_secondary")).getText());

            Assert.assertEquals(expectedText3, driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).getText());

            Assert.assertEquals(expectedText4, driver.findElement(By.id("com.acadia.pmistaging:id/securityQuestions_fields_question_hintText1")).getText());

        Utility.scroll2();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'song')]")));
        Assert.assertEquals(expectedText5, driver.findElement(By.xpath("//*[contains(@text,'song')]")).getText());

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'traveled')]")));
            Assert.assertEquals(expectedText6, driver.findElement(By.xpath("//*[contains(@text,'traveled')]")).getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'Sign')]")));
        Assert.assertEquals(expectedText7, driver.findElement(By.xpath("//*[contains(@text,'Sign')]")).getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@text,'information')]")));
        Assert.assertEquals(expectedText8, driver.findElement(By.xpath("//*[contains(@text,'information')]")).getText());

            System.out.println("\n SECURITY CONTENT : PASSED");

        } catch (AssertionError e) {
            System.out.println("\n SECURITY CONTENT : FAILED");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
            }

    }
}
