package product;

import java.util.HashSet;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Cart {

    HashSet<Products> list = new HashSet<>();
    void addtoCart(Products p)
    {

        for(Products x: list)
        {
            if (x.getID().equals(p.getID()))
            {
                x.setQuantity(1);
                System.out.println("\n QUANTITY INCREASED +1 !!");
                return;
            }

        }
        list.add(p);
        System.out.println("\n PRODUCT ADDED SUCCESSFULLY !!");
    }

    boolean checkEmpty()
    {
        return list.isEmpty();
    }
    void showCart()
    {
        if(list.isEmpty())
        {
            System.out.println("\n\n YOUR CART IS EMPTY!!");
            System.out.println(" Add Some Products...");
            return;
        }

        double total=0;
        String leftAlignFormat = "| %-15s | %-49s | %-15.3f | %-15.3f |%n";

        System.out.format("+-----------------+---------------------------------------------------+-----------------+-----------------+%n");
        System.out.format("| Product Name    |                Description                        |      Price      |      Quantity   |%n");
        System.out.format("+-----------------+---------------------------------------------------+-----------------+-----------------+%n");

        for(Products x: list)
        {
            System.out.format(leftAlignFormat, x.getID(), x.getDescription(),x.getPrice(),x.getQuantity());
            total = total+(x.getPrice() * x.getQuantity());
        }
        System.out.format("+-----------------+---------------------------------------------------+-----------------+-----------------+%n");
        System.out.format("|                          TOTAL AMOUNT                               |              "+total+"              +%n");
        System.out.format("+-----------------+---------------------------------------------------+-----------------+-----------------+%n");

    }
}
