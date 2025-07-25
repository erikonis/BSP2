import ex1.enumShipping.Country;
import ex1.enumShipping.Shipping;

public class mainticket {

    public static void main(String[] args) {
        Recipient imed = new Recipient("imed","migmoula", 57290, "France", "item");
        System.out.println(imed);
        Totalcost.cost(Country.France, Shipping.Express);
        System.out.println("Shipping method:"+Shipping.Express+"["+Shipping.Express.shippingprice+" €]");
        System.out.println("Total cost: "+Totalcost.totalcost+"€");
    }
    
}
