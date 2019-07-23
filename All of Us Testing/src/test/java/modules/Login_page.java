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
public class Login_page {

    String actual;

    private final String expectedLine1 = "Call to action header";
    private final String expectedLine2 = "Sign in";
    private final String expectedLine3 = "Email Address";
    private final String expectedLine4 = "e.g. example@email.com";
    private final String expectedLine5 = "Sign in with a Mobile Number";
    private final String expectedLine6 = "Password";


    private final String loginURL =  "https://sub-automation.qak8s.vibrenthealth.com/#/login";
    private final String expectedURL1 =  "https://sub-automation.qak8s.vibrenthealth.com/#/dashboard";
    private final String expectedURL2 =  "";


    protected WebDriver redirect(WebDriver driver)
    {
        driver.get(loginURL);
        return driver;
    }


    public void checkLoginContent(WebDriver driver)
    {

        try {
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='usernameEmail']")));

            actual = driver.findElement(By.cssSelector("h1.instructions-title.ng-scope.ng-binding")).getText();
            Assert.assertEquals(actual, expectedLine1);
/*
            actual = driver.findElement(By.xpath("h1.instructions-title.ng-scope.ng-binding")).getText();
            Assert.assertEquals(actual, expectedLine2);

            actual = driver.findElement(By.xpath("h1.instructions-title.ng-scope.ng-binding")).getText();
            Assert.assertEquals(actual, expectedLine3);

            actual = driver.findElement(By.xpath("h1.instructions-title.ng-scope.ng-binding")).getText();
            Assert.assertEquals(actual, expectedLine4);

            actual = driver.findElement(By.xpath("h1.instructions-title.ng-scope.ng-binding")).getText();
            Assert.assertEquals(actual, expectedLine5);

            actual = driver.findElement(By.xpath("h1.instructions-title.ng-scope.ng-binding")).getText();
            Assert.assertEquals(actual, expectedLine6);*/

            System.out.println("Login Page Content : PASSED");
        }
        catch(Exception e){
            System.out.println("Login Page Content : FAILED");
            e.printStackTrace();
        }


    }

    public void sendLoginInput(WebDriver driver,String userEmail,String userPass) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='usernameEmail']")));

        driver.findElement(By.xpath("//input[@id='usernameEmail']")).sendKeys(userEmail);
        driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(userPass, Keys.ENTER);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        Thread.sleep(10000);

        wait.until(ExpectedConditions.urlContains(expectedURL1));

        if((driver.getCurrentUrl()).equals(expectedURL1))
        {
            System.out.println("\nLOGIN : PASSED");
            //driver.findElement(By.xpath("//input[@id='signUpEmail']")).sendKeys(userEmail);
        }
        else
        {
            System.out.println(driver.getCurrentUrl());
            System.out.println("\nLOGIN : FAILED");
        }

    }


    public void test(WebDriver driver,String userEmail,String userPass) throws InterruptedException {
        checkLoginContent(driver);
        sendLoginInput(driver, userEmail, userPass);

    }
}
