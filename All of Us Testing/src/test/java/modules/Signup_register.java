package modules;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by rishabh.sakhare on 7/22/2019.
 */
public class Signup_register {

    private final String expectedTitle = "";
    //private final String expectedTitle = "sub-automation.qak8s.vibrenthealth.com";
    private final String expectedLine1 = "Get Started";
    private final String expectedLine2 = "Here's a quick overview of what steps are involved in joining the program";
    private final String expectedLine3 = "Create an Account";
    private final String expectedLine4 = "You will give an email address or mobile phone number. Then you will give a password.";
    private final String expectedLine5 = "Fill in the Enrollment and Consent Forms";
    private final String expectedLine6 = "The process usually takes 18-30 minutes.";
    private final String expectedLine7 = "Complete Surveys and More";
    private final String expectedLine8 = "You may be asked to take online surveys, give blood and other samples, and share data from personal devices.";

    //Register page right hand Expected lines
    private final String expectedLine9 = "Create a new account";
    private final String expectedLine10 = "Email Address";
    private final String expectedLine11 = "e.g. example@email.com";
    private final String expectedLine12 = "Register with a Mobile Number";
    private final String expectedLine13 = "Create password";
    private final String expectedLine14 = "Show";
    private final String expectedLine15 = "Password requirements:";
    private final String expectedLine16 = "Minimum 8 Characters";
    private final String expectedLine17 = "Contains a Number";
    private final String expectedLine18 = "Contains Special Character";
    private final String expectedLine19 = "Contains Uppercase Letter";
    private final String expectedLine20 = "Contains Lowercase Letter";

    private final String expectedURL1 = "https://sub-automation.qak8s.vibrenthealth.com/#/securityQuestions";

    public String actual;

    public void checkTitle(WebDriver driver)
    {

        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle))
        {
            System.out.println("\nTitle Checked : PASS");
        }
        else
        {
            System.out.println("\nTitle Checked : FAILED");
            return;
        }
        /*String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("\n\nTitle Same");*/
    }



    public void checkLineContent(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ng-scope']/div/div/div/div/h1")));

        try{

            //Left Side of the Main Page
            actual = driver.findElement(By.xpath("//div[@class='ng-scope']/div/div/div/div/h1")).getText();
            Assert.assertEquals(actual, expectedLine1);

            /*actual = driver.findElement(By.xpath("/*//*[contains(text(),\""+expectedLine2+"\")]")).getText();
            Assert.assertEquals(actual,expectedLine2);*/

            actual = driver.findElement(By.xpath("//div[@class='margin-l-md']/div")).getText();
            Assert.assertEquals(actual, expectedLine3);

            actual = driver.findElement(By.xpath("//div[@class='margin-l-md']/div[2]")).getText();
            Assert.assertEquals(actual,expectedLine4);

            actual = driver.findElement(By.xpath("//div[@class='ng-scope']/div/div/div/div[2]/div[2]/div[2]/div")).getText();
            Assert.assertEquals(actual, expectedLine5);

            actual = driver.findElement(By.xpath("//div[@class='ng-scope']/div/div/div/div[2]/div[2]/div[2]/div[2]")).getText();
            Assert.assertEquals(actual, expectedLine6);

            actual = driver.findElement(By.xpath("//div[@class='ng-scope']/div/div/div/div[2]/div[3]/div[2]/div")).getText();
            Assert.assertEquals(actual,expectedLine7);

            actual = driver.findElement(By.xpath("//div[@class='ng-scope']/div/div/div/div[2]/div[3]/div[2]/div[2]")).getText();
            Assert.assertEquals(actual,expectedLine8);


            //Right Side of the Main Page
            actual = driver.findElement(By.xpath("//form[@name='rfc.signUpForm']/div")).getText();
            Assert.assertEquals(actual,expectedLine9);

            actual = driver.findElement(By.xpath("//form[@name='rfc.signUpForm']/div[2]/div/div/label")).getText();
            Assert.assertEquals(actual,expectedLine10);

            actual = driver.findElement(By.xpath("//input[@id='signUpEmail']")).getAttribute("placeholder");
            Assert.assertEquals(actual,expectedLine11);

            actual = driver.findElement(By.cssSelector("a.font-small.view-edit-link.ng-scope")).getText();
            Assert.assertEquals(actual,expectedLine12);

            actual = driver.findElement(By.xpath("//form[@name='rfc.signUpForm']/div[2]/div[2]/div/label")).getText();
            Assert.assertEquals(actual,expectedLine13);

            actual = driver.findElement(By.xpath("//show-hide-field-toggle[@class='ng-isolate-scope']/a")).getText();
            Assert.assertEquals(actual,expectedLine14);

            actual = driver.findElement(By.xpath("//form[@name='rfc.signUpForm']/div[2]/label")).getText();
            Assert.assertEquals(actual,expectedLine15);

            actual = driver.findElement(By.xpath("//div[@class='ng-scope']/div/label")).getText();
            Assert.assertEquals(actual,expectedLine16);

            actual = driver.findElement(By.xpath("//validation[@class='ng-isolate-scope']/div[2]/div/label")).getText();
            Assert.assertEquals(actual,expectedLine17);

            actual = driver.findElement(By.xpath("//validation[@class='ng-isolate-scope']/div[3]/div/label")).getText();
            Assert.assertEquals(actual,expectedLine18);

            actual = driver.findElement(By.xpath("//validation[@class='ng-isolate-scope']/div[4]/div/label")).getText();
            Assert.assertEquals(actual,expectedLine19);

            actual = driver.findElement(By.xpath("//validation[@class='ng-isolate-scope']/div[5]/div/label")).getText();
            Assert.assertEquals(actual,expectedLine20);

           /* actual = driver.findElement(By.xpath("//vbr-input[@id='signUpEmail']/div/span")).getText();
            Assert.assertEquals(actual,expectedLine21);

            actual = driver.findElement(By.xpath("//vbr-input[@id='signUpPassword']/div/span")).getText();
            Assert.assertEquals(actual,expectedLine22);*/


            System.out.println("\nRegister Page Content : PASSED");

        }
        catch(Exception e){
            System.out.println("\nRegister Page Content : FAILED");
            e.printStackTrace();
        }
    }




    public void sendingRegisterInput(WebDriver driver,String userEmail,String userPass) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='signUpEmail']")));

        driver.findElement(By.xpath("//input[@id='signUpEmail']")).sendKeys(userEmail);

        driver.findElement(By.xpath("//input[@id='signUpPassword']")).sendKeys(userPass);

        driver.findElement(By.xpath("//button")).click();

        wait.until(ExpectedConditions.urlContains(expectedURL1));

        if((driver.getCurrentUrl()).equals(expectedURL1))
        {
            System.out.println("\nSign-Up-Page Register SUCCESS");
        }
        else
        {
            System.out.println("\nSign-Up-Page Register FAILED");
        }

    }


    protected void test(WebDriver driver,String userEmail,String userPass) throws InterruptedException {

        checkTitle(driver);
        //checkLogo(driver);
        checkLineContent(driver);
        sendingRegisterInput(driver,userEmail,userPass);

    }



}
