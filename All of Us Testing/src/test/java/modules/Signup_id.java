package modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by rishabh.sakhare on 7/22/2019.
 */
public class Signup_id {

    //Id Page right side Expected Lines
    private final String expectedLine21 = "Create a New Account";
    private final String expectedLine23 = "Your answer";
    private final String expectedLine24 = "For your security, we are requiring you to answer an additional security question for contact purposes. If you contact support, you will be asked to answer this security question to verify your identity.";

    protected final String expectedURL4 = "https://sub-automation.qak8s.vibrenthealth.com/#/dashboard";

    public String actual;

    public void checkIdContent(WebDriver driver)
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@name='pic.supportQuestionForm']/div")));

            actual = driver.findElement(By.xpath("//form[@name='pic.supportQuestionForm']/div")).getText();
            Assert.assertEquals(actual, expectedLine21);

            actual = driver.findElement(By.xpath("//form[@name='pic.supportQuestionForm']/p")).getText();
            Assert.assertEquals(actual, expectedLine24);

            actual = driver.findElement(By.xpath("//input[@id='answer-support-1']")).getAttribute("placeholder");
            Assert.assertEquals(actual, expectedLine23);


            System.out.println("\nID Page Content : PASSED");


        }
        catch(Exception e){
            System.out.println("\nID Page Content : FAILED");
            e.printStackTrace();
        }

    }




    public void sendingIdInput(WebDriver driver) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='answer-support-1']")));

        driver.findElement(By.xpath("//input[@id='answer-support-1']")).sendKeys("Qwertyuiop");
        driver.findElement(By.xpath("//span[@class='ng-binding']")).click();

        wait.until(ExpectedConditions.urlContains(expectedURL4));

        if((driver.getCurrentUrl()).equals(expectedURL4))
        {
            System.out.println("\nSign-Up ID SUCCESSFUL");
            //driver.findElement(By.xpath("//input[@id='signUpEmail']")).sendKeys(userEmail);
        }
        else
        {
            System.out.println("\nSign-Up ID FAILED");
        }

    }


    protected void test(WebDriver driver,String userEmail,String userPass) throws InterruptedException {

        checkIdContent(driver);
        sendingIdInput(driver);

    }


}
