package product;


/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Clothing extends Products{

    public enum ClothList{
        SHIRT,
        SAREE,
        JEANS,
        KURTA
    }

    @Override
    public int hashCode() {
        return 20;
    }


}