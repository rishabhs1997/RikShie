package main;

import pages.*;
import utility.Utility;

import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * Created by rishabh.sakhare on 7/26/2019.
 */
public class MainClass {

    public static int ch;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws MalformedURLException {
        MainClass obj = new MainClass();

        Register reg = new Register();
        Security sec = new Security();
        Login login = new Login();

        System.out.println("\n Select TEST Scenario from Below");
        System.out.println("\n 1. Verify Content of /Register Page");
        System.out.println(" 2. Verify Content of /Security Page");
        System.out.println("\n 3. Verify Input in /Register Page");
        System.out.println(" 4. Verify Input in /Security Page");
        System.out.println("\n 5. Verification for Successful SignUp");
        System.out.println(" 6. Verify User is Successfully Login");
        System.out.println(" 7. Verify Input Error Condition in Login Page");
        System.out.print("\n Enter Choice : ");
        ch = sc.nextInt();

        switch(ch)
        {
            case 1: reg.checkContent();
                    break;

            case 2: reg.sendInput();
                    sec.checkContent();
                    break;

            case 3: reg.sendInput();
                    break;

            case 4: reg.sendInput();
                    sec.sendInput();
                    break;

            case 5: reg.sendInput();
                    sec.sendInput();
                    System.out.println("\n SIGN-UP : SUCCESSFULL");
                    break;

            case 6: login.sendInput(Utility.getExistinguserEmail());
                    break;

            case 7: login.sendInput(Utility.getInvaliduserEmail());
                    break;

        }


    }
}
