package Exercise1;

public class Main {
    
    public static void main(String[] args) {
        
        Client client= new Client("Mr.", "Antunes", "Nelson Mandela", 33, 5893, "Esch", Countries.LUXEMBOURG);

        Item item= new Item("Aquarium");

        Delivery delivery= new Delivery(ShippingMethod.EXPRESS, client, item);

        System.out.println(delivery);
    }
}
