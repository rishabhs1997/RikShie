package product.clothing;

import product.Clothing;
import product.Products;

import java.time.LocalDate;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Kurta extends Clothing {

    public Products call()
    {
        Products p1 = new Products.ProductBuilder("Kurta","All Season Blue Kurta",8999)
                .setManufacturingDate(LocalDate.of(2018, 11, 12)).build();
        return p1;
    }
}
