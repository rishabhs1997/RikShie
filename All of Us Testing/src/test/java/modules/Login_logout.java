package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by rishabh.sakhare on 7/22/2019.
 */
public class Login_logout {

    public void logOut(WebDriver driver)
    {
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='pull-right']")));

        driver.findElement(By.xpath("//*[@class='pull-right']")).click();
        driver.findElement(By.xpath("//div[@class='form-page-btn-bar']/button[2]")).click();
        //driver.findElement(By.xpath("a[@class='ng-binding']")).click();
    }

    public void test(WebDriver driver) throws InterruptedException {

       logOut(driver);

    }
}
