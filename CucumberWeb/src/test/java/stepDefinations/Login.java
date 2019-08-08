package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import resources.Utility;
import java.util.concurrent.TimeUnit;

/**
 * Created by rishabh.sakhare on 7/31/2019.
 */
public class Login extends Utility{

    public final String expectedLine1 = "Welcome";


    @Given("^All Of Us login page is opened$")
    public void All_Of_Us_login_page_is_opened()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        System.out.println("\nLogin Page Loaded");

    }

    @When("^i enter email and password$")
    public void i_enter_email_and_password()
    {
            MobileElement userField = driver.findElementById("com.acadia.pmistaging:id/signin_fields_login_hintText");
            userField.sendKeys(Utility.getExistinguserEmail());
            driver.hideKeyboard();

            MobileElement pass = driver.findElementById("com.acadia.pmistaging:id/signin_fields_password");
            pass.sendKeys(Utility.getUserPass());

            driver.hideKeyboard();


    }

    @And("^i click on login$")
    public void i_click_on_login() {
        //wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button")));
        driver.findElementByClassName("android.widget.Button").click();

    }

    @Then("^i check for successful login$")
    public void i_check_for_successful_login()
    {
        try{

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Welcome']")));
            Assert.assertEquals(expectedLine1, driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Welcome']")).getText());

            System.out.println("\n LOGIN : SUCCESSFUL");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }


    @Then("^close app$")
    public void close_app()
    {
        driver.closeApp();

    }


    @When("^i enter for \"([^\"]*)\" and \"([^\"]*)\"$")
    public void i_enter_for_and(String username, String password) {


            MobileElement userField = driver.findElementById("com.acadia.pmistaging:id/signin_fields_login_hintText");
            userField.sendKeys(username);

            MobileElement pass = driver.findElementById("com.acadia.pmistaging:id/signin_fields_password");
            pass.click();
            userField.click();

            driver.hideKeyboard();
            pass.click();

    }
/*

    @Then("^display error messages$")
    public void display_error_messages() {

        System.out.println("\n Error : " + driver.findElement(By.id("com.acadia.pmistaging:id/textinput_error")).getText());
        System.out.println("\n LOGIN : FAILED ");

    }
*/

    @Then("^display error messages for \"([^\"]*)\"$")
    public void display_error_messages_for(String username) {
        System.out.println("\n Error : " + driver.findElement(By.id("com.acadia.pmistaging:id/textinput_error")).getText());
        System.out.println("\n LOGIN : FAILED for "+ username);

    }

    @But("^username is wrong$")
    public void username_is_wrong(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/textinput_error")));

    }
}
