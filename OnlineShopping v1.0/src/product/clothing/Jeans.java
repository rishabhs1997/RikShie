package product.clothing;

import product.Clothing;
import product.Products;

import java.time.LocalDate;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Jeans extends Clothing {

    public Products call()
    {
        Products p1 = new Products.ProductBuilder("Jeans","Rough n Tough Jeans",1999)
                .setManufacturingDate(LocalDate.of(2017, 10, 21)).build();
        return p1;
    }
}
