package product;

import java.time.LocalDate;

/**
 * Created by rishabh.sakhare on 7/14/2019.
 */
public class Products {

    private String id;          //required
    private String description; //required
    private double price;       //required
    private double qty;
    private LocalDate time=LocalDate.now();

    public enum Category{
        Electronics,
        Clothing,
        ShowCart
    }

    private Products(ProductBuilder builder) {
        //System.out.println("Hi from Param Products");
        this.id = builder.id;
        this.description = builder.description;
        this.price = builder.price;
        this.qty = builder.qty;
        this.time = builder.time;
    }


    Products(){
        //System.out.println("Hi from default Products");
    }
    public String getID() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return qty;
    }

    public LocalDate getManufacturingDate() {
        return time;
    }

    public void setQuantity(int qty)
    {
        this.qty = this.qty + qty;
    }


    public static class ProductBuilder {


        private String id;          //required
        private String description; //required
        private double price;       //required
        private double qty = 1;
        private LocalDate time = LocalDate.now();

        public ProductBuilder(String id, String description, double price)
            {
                //System.out.println("Hi from Param Builder");
                this.id = id;
                this.description = description;
                this.price = price;
            }


        public ProductBuilder setManufacturingDate(LocalDate time)
        {
            this.time = time;
            return this;
        }

        public Products build(){

            //System.out.println("Hi from build");
            Products prod = new Products(this);
            return prod;
        }


    }



}
