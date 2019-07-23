package scenario;

import modules.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

/**
 * Created by rishabh.sakhare on 7/22/2019.
 */
public class Signup_main {


    private final String expectedURL1 = "https://sub-automation.qak8s.vibrenthealth.com/#/securityQuestions";
    private final String expectedURL2 = "https://sub-automation.qak8s.vibrenthealth.com/#/idQuestion";
    private final String expectedURL3 = "https://sub-automation.qak8s.vibrenthealth.com/#/programSubscribe";
    protected final String expectedURL4 = "https://sub-automation.qak8s.vibrenthealth.com/#/dashboard";

    public static String actual,userEmail="qwerty25@gmail.com",userPass="Aa@12345",invaliduserEmail="123456";
    public static int ch;
    static WebDriver driver;
    static Scanner sc = new Scanner(System.in);

    public void loadDriver()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://sub-automation.qak8s.vibrenthealth.com");
        System.out.println("\nLoaded URl successfully");
    }

    public void loadLogin()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.get("https://sub-automation.qak8s.vibrenthealth.com/#/login");
        System.out.println("\nLoaded URl successfully");
    }

    public static void main(String[] args) throws InterruptedException {


        Signup_main obj = new Signup_main();

       Signup_register register = new Signup_register();
//        register.test(driver,userEmail,userPass);

        Signup_security secure = new Signup_security();
 //       secure.test(driver,userEmail,userPass);

        Signup_id idquestion= new Signup_id();
 //       idquestion.test(driver,userEmail,userPass);

        Login_logout logout = new Login_logout();
//        logout.test(driver);

        Login_page login = new Login_page();
  //      login.test(driver,userEmail,userPass);*/



        System.out.println("\n Select TEST Scenario from Below");
        System.out.println(" 1. Verify Content of /Register Page");
        System.out.println(" 2. Verify Content of /Security Page");
        System.out.println(" 3. Verify Content of /IdQuestions Page");
        System.out.println(" 4. Verify Input in /Register Page");
        System.out.println(" 5. Verify Input in /Security Page");
        System.out.println(" 6. Verify Input in /IdQuestions Page");
        System.out.println(" 7. Verification for Successful SignUp");
        System.out.println(" 8. Verify User is Successfully Login");
        System.out.println(" 9. Verify Input Error Condition in Login Page");
        System.out.print("\n Enter Choice : ");
        ch = sc.nextInt();

        switch(ch)
        {
            case 1:     obj.loadDriver();
                        register.checkTitle(driver);
                        register.checkLineContent(driver);
                        driver.quit();
                        break;

            case 2:     obj.loadDriver();
                        register.sendingRegisterInput(driver, userEmail, userPass);
                        secure.checkSecurityQuestion(driver);
                        driver.quit();
                        break;

            case 3:     obj.loadDriver();
                        register.sendingRegisterInput(driver, userEmail, userPass);
                        secure.sendingSecurityInput(driver, userEmail, userPass);
                        idquestion.checkIdContent(driver);
                        driver.quit();
                        break;

            case 4:     obj.loadDriver();
                        register.sendingRegisterInput(driver, userEmail, userPass);
                        driver.quit();
                        break;

            case 5:     obj.loadDriver();
                        register.sendingRegisterInput(driver, userEmail, userPass);
                        secure.sendingSecurityInput(driver, userEmail, userPass);
                        driver.quit();
                        break;

            case 6:     obj.loadDriver();
                        register.sendingRegisterInput(driver, userEmail, userPass);
                        secure.sendingSecurityInput(driver, userEmail, userPass);
                        idquestion.sendingIdInput(driver);
                        driver.quit();
                        break;

            case 7:     obj.loadDriver();
                        register.sendingRegisterInput(driver, userEmail, userPass);
                        secure.sendingSecurityInput(driver, userEmail, userPass);
                        idquestion.sendingIdInput(driver);
                        System.out.println("\nSIGNUP Procedure SUCCESSFUL");
                        driver.quit();
                        break;

            case 8:     obj.loadLogin();
                        login.sendLoginInput(driver, "qwerty24@gmail.com", userPass);
                        driver.quit();
                        break;

            case 9:     obj.loadLogin();
                        login.sendLoginInput(driver, invaliduserEmail, userPass);
                        driver.quit();
                        break;

        }


    }
}
