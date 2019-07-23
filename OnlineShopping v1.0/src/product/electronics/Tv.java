package product.electronics;

import product.Products;
import product.Electronic;

import java.time.LocalDate;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Tv extends Electronic {


    public Products call()
    {
        
        Products p1 = new Products.ProductBuilder("TV","This is a Brand New OLED TV",60000)
                            .setManufacturingDate(LocalDate.of(2018, 5, 11)).build();
        return p1;
    }

}
