public class Launcher {
    public static void main(String[] args) {
        Address address = new Address("Place de l'université 2", "Belval", Country.LUXEMBOURG, 4936);

        Person me = new Person("Mathieu", "Francois", address, true);

        Delivery del = new Delivery(DeliveryType.NORUSH, "MacBook Pro", me);

        del.ship();
    }
}