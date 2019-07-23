package modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by rishabh.sakhare on 7/22/2019.
 */
public class Signup_security {

    //Security Page right side Expected lines
    private final String expectedLine21 = "Create a New Account";
    private final String expectedLine22 = "For added security, please answer the following security questions.";
    private final String expectedLine23 = "Your answer";

    private final String expectedURL2 = "https://sub-automation.qak8s.vibrenthealth.com/#/idQuestion";

    public String actual;


    public void checkSecurityQuestion(WebDriver driver)
    {
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@name='sqc.securityQuestionsForm']/div")));

            actual = driver.findElement(By.xpath("//form[@name='sqc.securityQuestionsForm']/div")).getText();
            Assert.assertEquals(actual, expectedLine21);

            actual = driver.findElement(By.xpath("//form[@name='sqc.securityQuestionsForm']/div[2]/h4")).getText();
            Assert.assertEquals(actual, expectedLine22);

            actual = driver.findElement(By.xpath("//input[@id='answer-security-1']")).getAttribute("placeholder");
            Assert.assertEquals(actual, expectedLine23);

            actual = driver.findElement(By.xpath("//input[@id='answer-security-2']")).getAttribute("placeholder");
            Assert.assertEquals(actual, expectedLine23);

            actual = driver.findElement(By.xpath("//input[@id='answer-security-3']")).getAttribute("placeholder");
            Assert.assertEquals(actual, expectedLine23);

            System.out.println("\nSecurity Page Content : PASSED");


        }
        catch(Exception e){
            System.out.println("\nSecurity Page Content : FAILED");
            e.printStackTrace();
        }

    }



    public void sendingSecurityInput(WebDriver driver,String userEmail,String userPass)
    {

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='answer-security-1']")));

        driver.findElement(By.xpath("//input[@id='answer-security-1']")).sendKeys("Aa@12345");
        driver.findElement(By.xpath("//input[@id='answer-security-2']")).sendKeys("Ba@12346");
        driver.findElement(By.xpath("//input[@id='answer-security-3']")).sendKeys("Ca@12347", Keys.ENTER);

        wait.until(ExpectedConditions.urlContains(expectedURL2));

        if((driver.getCurrentUrl()).equals(expectedURL2))
        {
            System.out.println("\nSign-Up-Page Security PASSED");
        }
        else
        {
            System.out.println("\nSign-Up-Page Security FAILED");
        }

    }


    protected void test(WebDriver driver,String userEmail,String userPass) throws InterruptedException {

        checkSecurityQuestion(driver);
        sendingSecurityInput(driver, userEmail, userPass);

    }

}
