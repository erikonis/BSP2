public class Shipping {
    private int shippingPrice;
    private Delay delay;
    private Client client;
    private Item item;

    public Shipping(Delay delay, Item item, Client client){
        this.delay = delay;
        this.client = client;
        this.item = item;
        shippingPrice = client.getCountry().getPrice() + delay.getPrice();
    }

    public void printTicket(){
        System.out.println("Shipping for "+client.shouldIcallYouMister()+", ("+client.getFullAddress()+"),");
        System.out.println("Item: "+item.getName()+",");
        System.out.print("Shipping method : "+delay+"["+delay.getPrice()+"]. Handling in "+delay.getDays()+" ");
        String singularOrPlural = delay.getDays()>1 ? "days" : "day" ;
        System.out.println(singularOrPlural+",");
        System.out.println("Base price : "+item.getPrice()+"EUR,");
        System.out.println("Shipping cost : "+shippingPrice+"EUR,");
        int totalCost = shippingPrice+item.getPrice();
        System.out.println("Total prize : "+totalCost+"EUR.");
    }
}
