package stepDefinations;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.Point;
import resources.Utility;

import java.util.concurrent.TimeUnit;

/**
 * Created by rishabh.sakhare on 8/1/2019.
 */
public class PrimaryConsent extends Utility {

    @When("^i complete primary consent$")
    public void i_complete_primary_consent() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    //1st PC
        MobileElement button1 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button1.click();

        MobileElement track1 = driver.findElementByAccessibilityId("0:00 of 0:28");
        Point location = track1.getLocation();
        tap(driver, location);

        driver.navigate().back();
        Thread.sleep(3000);
        Utility.scroll2();

        driver.findElementByAccessibilityId("Next").click();

    //2st PC
        driver.findElementByAccessibilityId("Next").click();

    //3rd PC
        driver.findElementByAccessibilityId("Next").click();

    //4th PC
        Thread.sleep(3000);
        Utility.scroll2();
        driver.findElementByAccessibilityId("Next").click();

    //5th PC
        driver.findElementById("com.acadia.pmistaging:id/spinnerText").click();
        driver.findElementByAccessibilityId("Alaska").click();
        driver.findElementByAccessibilityId("Next").click();

    //6th PC
        driver.findElementByXPath("//*[@text='Yes']").click();
        driver.findElementByAccessibilityId("Next").click();

    //7th PC
        driver.findElementById("com.acadia.pmistaging:id/spinnerText").click();
        driver.findElementByAccessibilityId("Alaska").click();
        driver.findElementByAccessibilityId("Next").click();

    //8th PC
        driver.findElementByAccessibilityId("Next").click();

    //9th PC
        driver.findElementByAccessibilityId("Next").click();

    //10th PC
        MobileElement button2 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button2.click();

        MobileElement track2 = driver.findElementByAccessibilityId("0:00 of 0:22");
        Point location2 = track2.getLocation();
        tap(driver, location2);

        driver.navigate().back();
        Thread.sleep(3000);
        Utility.scroll2();

        driver.findElementByAccessibilityId("Next").click();

    //11th PC
        MobileElement button3 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button3.click();

        MobileElement track3 = driver.findElementByAccessibilityId("0:00 of 0:30");
        Point location3 = track3.getLocation();
        tap(driver, location3);

        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //12th PC

            MobileElement button4 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
            button4.click();

            MobileElement track4 = driver.findElementByAccessibilityId("0:00 of 0:51");

            Point location4 = track4.getLocation();
            tap(driver, location4);
            Thread.sleep(3);

            driver.navigate().back();

            driver.findElementByAccessibilityId("Next").click();

    //13th PC
        MobileElement button5 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button5.click();

        MobileElement track5 = driver.findElementByAccessibilityId("0:00 of 0:26");
        Point location5 = track5.getLocation();
        tap(driver,location5);


        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //14th PC
        MobileElement button6 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button6.click();

        MobileElement track6 = driver.findElementByAccessibilityId("0:00 of 0:51");
        Point location6 = track6.getLocation();
        tap(driver,location6);

        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //15th PC
        MobileElement button7 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button7.click();

        MobileElement track7 = driver.findElementByAccessibilityId("0:00 of 0:37");
        Point location7 = track7.getLocation();
        tap(driver,location7);

        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //16th PC
        MobileElement button8 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button8.click();

        MobileElement track8 = driver.findElementByClassName("android.widget.SeekBar");
        Point location8 = track8.getLocation();
        tap(driver,location8);

        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //17th PC
        MobileElement button9 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button9.click();

        MobileElement track9 = driver.findElementByClassName("android.widget.SeekBar");
        Point location9 = track9.getLocation();
        tap(driver, location9);

        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //18th PC
        driver.findElementByAccessibilityId("Next").click();

    //19th PC
        MobileElement button10 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button10.click();

        MobileElement track10 = driver.findElementByClassName("android.widget.SeekBar");
        Point location10 = track10.getLocation();
        tap(driver, location10);

        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //20th PC
        driver.findElementByAccessibilityId("Next").click();

    //21th PC
        driver.findElementByAccessibilityId("Next").click();

    //22th PC
        MobileElement button11 = driver.findElementByXPath("//android.widget.ImageView/following-sibling::android.widget.ImageView");
        button11.click();

        MobileElement track11 = driver.findElementByClassName("android.widget.SeekBar");
        Point location11 = track11.getLocation();
        tap(driver, location11);
        tap(driver, location11);

        driver.navigate().back();

        driver.findElementByAccessibilityId("Next").click();

    //23th PC
        driver.findElementByAccessibilityId("Next").click();

    //24th PC
        driver.findElementByAccessibilityId("Next").click();

    //25th PC
        driver.findElementByAccessibilityId("Next").click();

    //26th PC
        driver.findElementByAccessibilityId("Next").click();

    //27th PC
        driver.findElementByAccessibilityId("Next").click();

    //28th PC
        Thread.sleep(3000);
        for(int i=0;i<39;i++) {
            Utility.scrollLong();
        }
        driver.findElementByAccessibilityId("Next").click();

    //29th PC
        driver.findElementByAccessibilityId("Next").click();

    //30th PC
        driver.findElementByXPath("//*[contains(@text,'researchers')]").click();
        driver.findElementByAccessibilityId("Next").click();

    //31st PC
        driver.findElementByXPath("//*[contains(@text,'voluntary')]").click();
        driver.findElementByAccessibilityId("Next").click();

    //32nd PC
        driver.findElementByXPath("//*[contains(@text,'time')]").click();
        driver.findElementByAccessibilityId("Next").click();

    //33rd PC
        driver.findElementByXPath("//*[contains(@text,'Risks')]").click();
        driver.findElementByAccessibilityId("Next").click();

    //34th PC
        driver.findElementByXPath("//*[contains(@text,'ready')]").click();
        driver.findElementByAccessibilityId("Next").click();

    //35th PC
        driver.findElementByXPath("//*[contains(@text,'freely')]").click();
        driver.findElementByAccessibilityId("Next").click();

    //36th PC
        driver.findElementByXPath("//*[contains(@text,'full')]").sendKeys("Anyname Surname");
        driver.navigate().back();
        Utility.scroll2();
        driver.findElementByAccessibilityId("Next").click();

    //37th PC
        driver.findElementByXPath("//*[@text='No']").click();
        driver.findElementByAccessibilityId("Next").click();

    //38th PC
        Thread.sleep(3000);
        Utility.scroll2();
        driver.findElementByXPath("//android.widget.EditText[@text='first name']").sendKeys("AnyFirst");
        driver.findElementByXPath("//android.widget.EditText[@text='middle initial']").sendKeys("M");
        driver.navigate().back();

        driver.findElementByXPath("//*[@text='last name']").sendKeys("AnyLast");
        //driver.navigate().back();
        driver.navigate().back();


        String path = "//*[contains(@text,'address')]";
        driver.findElementByXPath(path).click();

        if(driver.findElementByXPath(path).isDisplayed()) {

            //System.out.println("Displayed");
            driver.findElementByXPath(path).sendKeys("Anyaddress");
        }
        else{
            System.out.println("Not found");
        }

        driver.navigate().back();

/*
        driver.findElementByXPath("/*//*[contains(@text,'address 2')]").sendKeys("AnyAddress 2");
        driver.navigate().back();
*/
        Utility.scroll2();


        driver.findElementByXPath("//*[@text='city']").sendKeys("AnyCity");
        driver.navigate().back();

        driver.findElementByXPath("//*[@text='state']").click();
        driver.findElementByAccessibilityId("Alaska").click();

        path = "//*[contains(@text,'zip')]";
        String zip = "45678";
        driver.findElementByXPath(path).sendKeys(zip);
        driver.navigate().back();
        Utility.scroll2();

        path = "//*[contains(@text,'phone number')]";
        String no = "9999999999";
        driver.findElementByXPath(path).click();

        if(driver.findElementByXPath(path).isDisplayed()) {

            //System.out.println("Displayed");
            driver.findElementByXPath(path).sendKeys(no);
        }
        else{
            System.out.println("Not found");
        }

        driver.navigate().back();

        driver.findElementByXPath("//*[@text='MM/DD/YYYY']").click();
        Thread.sleep(2000);
        for(int i=0; i<10; i++) {
            scrollShort();
        }

        driver.findElementById("com.acadia.pmistaging:id/date_picker_done").click();

        driver.findElementByAccessibilityId("Next").click();

    //39th PC
        driver.findElementByAccessibilityId("Submit").click();


    }

    @Then("^display dashboard$")
    public void display_dashboard() {
        System.out.println("\n DASHBOARD OPENED !!");
    }
}
