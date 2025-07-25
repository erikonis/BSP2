

public class Main {
    public static void main(String[] args) {
        Address a = new Address("14a", "Bahnhofs Straße", "2563", "Trier", Country.GERMANY);
        Recipient r = new Recipient("Pit", a);
        Item i = new Item("Gaming PC");
        Delivery d = new Delivery(DeliveryType.EXPRESS, r, i);
        System.out.println("-------------------------------------");
        System.out.println(d.toString());
        System.out.println("-------------------------------------");
    }
}
