package product.electronics;

import product.Electronic;
import product.Products;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Mobile extends Electronic {

    public Products call()
    {
        Products p1 = new Products.ProductBuilder("Mobile","Best Mobile in the category",15999).build();
        return p1;
    }
}
