package product.electronics;

import product.Electronic;
import product.Products;

import java.time.LocalDate;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Refrigerator extends Electronic {

    public Products call()
    {
        Products p1 = new Products.ProductBuilder("Refrigerator","The most Affordable Double Door Refrigerator",18999)
                        .setManufacturingDate(LocalDate.of(2019, 6, 1)).build();
        return p1;
    }
}
