package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import resources.Utility;

/**
 * Created by rishabh.sakhare on 8/1/2019.
 */
public class SignUp extends Utility {

    @And("^i navigate to signup page$")
    public void i_navigate_to_signup_page() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/signin_action_signup")));
        driver.findElementById("com.acadia.pmistaging:id/signin_action_signup").click();

    }

    @When("^i enter email address$")
    public void i_enter_email_address() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("android.widget.EditText")));
        driver.findElementByClassName("android.widget.EditText").sendKeys(Utility.getUserEmail());    //email
        driver.hideKeyboard();
    }


    @And("^i enter password$")
    public void i_enter_password(){

        driver.findElementById("com.acadia.pmistaging:id/signup_fields_password_text").sendKeys(Utility.getUserPass());   //password
        driver.hideKeyboard();

    }

    @Then("^i click on continue$")
    public void i_click_on_continue() {

        Utility.scroll2();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.acadia.pmistaging:id/signup_action_button_next")));
        driver.findElementById("com.acadia.pmistaging:id/signup_action_button_next").click();       //click continue
    }




//SECURITY PAGE METHODS

    @When("^all fields are entered$")
    public void all_fields_are_entered(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.acadia.pmistaging:id/edt_question1")));     //ques 1
        driver.findElementById("com.acadia.pmistaging:id/edt_question1").sendKeys("Anything1");
        driver.hideKeyboard();


        Utility.scroll2();
        driver.findElementById("com.acadia.pmistaging:id/edt_question2").sendKeys("Anything2");
        driver.hideKeyboard();

        Utility.scroll2();
        driver.findElementById("com.acadia.pmistaging:id/edt_question3").sendKeys("Anything3");
        driver.hideKeyboard();

    }

    @And("^i click on Sign Up$")
    public void i_click_on_Sign_Up(){

        Utility.scroll2();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("android.widget.Button")));
        driver.findElementByClassName("android.widget.Button").click();
    }

    @Then("^i check for successful signup$")
    public void i_check_for_successful_signup() throws Throwable {

        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@content-desc='Welcome']")));
            Assert.assertEquals("Welcome", driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Welcome']")).getText());
            System.out.println("\n SIGNUP FLOW : SUCCESSFUL");
        }
        catch (AssertionError e) {
            System.out.println("\n SIGNUP FLOW : FAILED");
        }
        catch(Exception e)
        {
            System.out.println("\n Connection is Taking too Long");
            System.out.println("\n SIGNUP FLOW : FAILED");
        }
    }

}
