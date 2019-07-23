package main;

import product.Process;
import java.util.Scanner;


/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Client {


    static Scanner sc = new Scanner(System.in);
    static Process p1 = new Process();
    private void callProduct()
    {
        p1.callProduct();
    }

    public static void main(String[] args)
    {
        Client user = new Client();
        String ch ="y";
        System.out.println("<======= WELCOME TO ONLINE SHOPPING =======>");
        do
        {
            do {
                System.out.println("\n\n Select From the Category : ");
                user.callProduct();
                System.out.print("\n\n Do u Want to Add more Products(Press Y to continue) ? ");
                ch = sc.next();
            } while (ch.equals("Y") || ch.equals("y"));

            System.out.println("\n\n<--------------------------------------------FINAL CART------------------------------------------------------>");
            p1.showCart();
            if(p1.checkEmpty())
            {
                continue;
            }

            System.out.print("\n\n Do You want to CONFIRM (Press Y) ? ");
            ch = sc.next();
        }while(!(ch.equals("Y")) && !(ch.equals("y")));

        System.out.println("\n YOUR ORDER IS CONFIRMED !!");
    }

}
