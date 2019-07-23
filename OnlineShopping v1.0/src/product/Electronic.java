package product;
import product.Products.ProductBuilder;
/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public  class Electronic extends Products{


    public enum ElecList{
        TV,
        MOBILE,
        REFRIGERATOR
    }

    public Electronic()
    {
        
    }


    @Override
    public int hashCode() {
        return 10;
    }


}

