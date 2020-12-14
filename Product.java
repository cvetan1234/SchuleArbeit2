package myonlineshop;

public class Product {
   
    private double regularPrice;
 
    Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
  
    protected double computeSalePrice(){
        return 0;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
}
