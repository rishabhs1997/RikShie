package product;

import product.electronics.*;
import product.clothing.*;
import java.util.Scanner;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Process {

    static Cart c1 = new Cart();
    static Scanner sc = new Scanner(System.in);
    private static int number=0,choice=0;

    protected int showProductList()
    {
        Products.Category[] category = Products.Category.values();
        for(Products.Category cat : category)
        {
            number++;
            System.out.println(" "+number+". "+cat);
        }
        number = 0;
        System.out.print("\n Enter Option : ");

        while (!sc.hasNextInt()) {
            System.out.println("\n That is NOT A NUMBER!!");
            System.out.println("\n Enter Again: ");
            sc.next();
        }

        choice = sc.nextInt();

        return choice;
    }


    public int showElectronicList(){

        System.out.println("\n\nChoose from the Electronics Below :");
        Electronic.ElecList[] category = Electronic.ElecList.values();
        for(Electronic.ElecList cat : category)
        {
            number++;
            System.out.println(number+". "+cat);
        }
        number = 0;

        System.out.print("\n Enter Option : ");
        while (!sc.hasNextInt()) {
            System.out.println("\n That is NOT A NUMBER!!");
            System.out.println("\n Enter Again: ");
            sc.next();
        }
        choice = sc.nextInt();

        return choice;
    }


    public int showClothingList(){

        System.out.println("\n\nChoose from the Clothing Below :");
        Clothing.ClothList[] category = Clothing.ClothList.values();
        for(Clothing.ClothList cat : category)
        {
            number++;
            System.out.println(number+". "+cat);
        }
        number = 0;
        System.out.print("\n Enter Option : ");
        while (!sc.hasNextInt()) {
            System.out.println("\n That is NOT A NUMBER!!");
            System.out.println("\n Enter Again: ");
            sc.next();
        }
        choice = sc.nextInt();

        return choice;
    }


    public int showAbout(Products p){
        int choice=0;
        System.out.println("\n<============ Product Details ===========>");
        System.out.print("\n Products   : " + p.getID());
        System.out.print("\n Description: " + p.getDescription());
        System.out.print("\n Price      : " + p.getPrice());
        System.out.print("\n MFG Date   : " + p.getManufacturingDate());

        while(choice<1 || choice>2)
        {

            System.out.print("\n\n Do You want to buy this Product ? ");
            System.out.print("\n 1. YES");
            System.out.print("\n 2. NO");
            System.out.print("\n Enter VALID Choice: ");

            while (!sc.hasNextInt()) {
                System.out.println("\n INVALID CHOICE!!");
                System.out.println("\n Enter Again: ");
                sc.next();
            }


            choice = sc.nextInt();
        }

        return choice;

    }


    public void callProduct()
    {
        int correctChoice = showProductList();
        while(correctChoice<1 || correctChoice>3)
        {
            System.out.println("\n Enter VALID Choice: ");
            correctChoice = showProductList();
        }

        switch(correctChoice)
        {
            case 1: callElectronics();
                break;
            case 2: callClothing();
                break;
            case 3:
                System.out.println("\n\n<---------------------------------------------YOUR CART------------------------------------------------------>");
                c1.showCart();
                break;
        }

    }

    private void callElectronics(){

        Products obj = null;
        choice = showElectronicList();
        while(choice<1 || choice>3)
        {
            System.out.print("\n Enter VALID Choice: ");
            choice = showElectronicList();
        }
        switch (choice){
            case 1: obj = new Tv().call();
                if(showAbout(obj) == 1)
                    c1.addtoCart(obj);
                break;

            case 2: obj = new Mobile().call();
                if(showAbout(obj) == 1)
                    c1.addtoCart(obj);
                break;

            case 3: obj = new Refrigerator().call();
                if(showAbout(obj) == 1)
                    c1.addtoCart(obj);
                break;
        }

    }

    private void callClothing(){

        Products obj = null;
        choice = showClothingList();
        while(choice<1 || choice>4)
        {
            System.out.print("\n Enter VALID Choice: ");
            choice = showClothingList();
        }
        switch (choice){
            case 1: obj = new Shirt().call();
                if(showAbout(obj) == 1)
                    c1.addtoCart(obj);
                break;

            case 2: obj = new Saree().call();
                if(showAbout(obj) == 1)
                    c1.addtoCart(obj);
                break;

            case 3: obj = new Jeans().call();
                if(showAbout(obj) == 1)
                    c1.addtoCart(obj);
                break;

            case 4: obj = new Kurta().call();
                if(showAbout(obj) == 1)
                    c1.addtoCart(obj);
                break;
        }

    }

    public void showCart(){
        c1.showCart();
    }

    public boolean checkEmpty(){
        return c1.checkEmpty();
    }


}
