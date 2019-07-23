package product.clothing;

import product.Clothing;
import product.Products;

import java.time.LocalDate;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Shirt extends Clothing{
    public Products call()
    {
        Products p1 = new Products.ProductBuilder("Shirt","High quality Casual Shirt",1200)
                .setManufacturingDate(LocalDate.of(2019, 1, 20)).build();
        return p1;
    }
}
