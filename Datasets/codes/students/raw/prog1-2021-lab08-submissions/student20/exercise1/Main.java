package exercise1;

public class Main {
    public static void main(String[] args){
        Shipping ship1 = new Shipping(Delay.EXPRESS, new Item(23, "Glasses"), new Client("Obama", "1600 Pennsylvania Ave NW", Country.LUXEMBOURG, 20500, "Washington DC", true));
        ship1.printTicket();
    }
}
