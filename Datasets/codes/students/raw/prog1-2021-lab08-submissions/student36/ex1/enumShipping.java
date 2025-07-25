package ex1;

public class enumShipping {

  enum Country{
    Luxembourg(0),
    France(30),
    Belgium(50),
    Germany(40);

    int pricee;
    Country (int pricee){
        this.pricee = pricee;
    }
    public int getPricee() {
        return pricee;
    }
    
  }
  enum Shipping{
    Express(100),
    Priority(50),
    Classic(10),
    Norush(0);

    int shippingprice;
    Shipping (int shippingprice){
        this.shippingprice = shippingprice;
    }
    public int getShippingprice() {
        return shippingprice;
    }

  }  


}