public class Delivery {

    ShippingMethod shippingMethod;
    private Client client;
    private Item item;

    public Delivery(ShippingMethod shippingMethod, Client client, Item item) {
        this.shippingMethod = shippingMethod;
        this.client = client;
        this.item = item;
    }

    public int countryPrice()
    {
        int price=0;
        switch(client.getCountry())
        {
            case LUXEMBOURG:
                price = 0;
                break;
            case FRANCE:
                price = 30;
                break;
            case GERMANY:
                price = 40;
                break;
            case BELGIUM:
                price = 50;
                break;
        }
        return price;
    }

    public int methodPrice()
    {
        int price=0;
        switch(shippingMethod)
        {
            case EXPRESS:
                price = 100;
                break;
            case PRIORITY:
                price = 50;
                break;
            case CLASSIC:
                price = 10;
                break;
            case NORUSH:
                price = 0;
                break;
        }
        return price;
    }

    public String handlingDays()
    {
        String handling="";
        switch(shippingMethod)
        {
            case EXPRESS:
                handling= "Handling in 1 day";
                break;
            case PRIORITY:
                handling= "Handling in 3 days";
                break;
            case CLASSIC:
                handling= "Handling in 5 days";
                break;
            case NORUSH:
                handling= "Handling in 8 days";
                break;
        }
        return handling;
    }

    @Override
    public String toString() {
        return "Shipping for " + client + ", \n\t" + item + "," + "\n\tShipping method: " + shippingMethod + "[" + methodPrice() + " EUR" + "]. " + handlingDays() + "," +
                "\n\tTOTAL cost: " + (countryPrice()+methodPrice()) + " EUR";
    }
    
}