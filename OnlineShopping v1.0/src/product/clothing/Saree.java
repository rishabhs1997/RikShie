package product.clothing;

import product.Clothing;
import product.Products;

import java.time.LocalDate;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Saree extends Clothing {

    public Products call()
    {
        Products p1 = new Products.ProductBuilder("Saree","Latest trendy Silk Saree",2500).build();
        return p1;
    }
}
