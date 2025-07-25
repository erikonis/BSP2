package lu.uni.programming1.lab8.exercise1;

public class Shipping {

    private Individual client;
    private String item;
    private float totalcost;
    private float shippingcost;
    private float countryfee;
    private Delivery method;
    private int days;

    public Shipping(Individual client, String item, Delivery method) {
        this.client=client;
        this.item=item;
        this.method=method;
        days=0;
        totalcost=0;
        shippingcost=0;
        countryfee=0;
    }

    public void Display() {
        switch (client.GetCountry()) {

            case FRANCE : countryfee += 30;
            break;
            case GERMANY : countryfee += 40;
            break;
            case BELGIUM : countryfee += 50;
            break;
            case LUXEMBOURG : countryfee += 0;
            break;

        }

        switch (method) {

            case EXPRESS : shippingcost += 100; days += 1;
            break;
            case PRIORITY : shippingcost += 50; days += 3;
            break;
            case CLASSIC : shippingcost += 10; days += 5;
            break;
            case NORUSH : shippingcost += 0; days += 8;
            break;

        }

        totalcost = shippingcost + countryfee;

        System.out.println("Shipping for: " + client.GetName() + ", " + client.GetAdress() + ", " + client.GetCountry() + "\n" );
        System.out.println("Item: " + item + "\n");
        System.out.println("Shipping method: " + method + " (" + shippingcost + "EUR). " + "Handling in " + days + " days." + " \n");
        System.out.println("Total cost: " + totalcost + "\n" + "--------" + "\n");



    }

    
    
}
