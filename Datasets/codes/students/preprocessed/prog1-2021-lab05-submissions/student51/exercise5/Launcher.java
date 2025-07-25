public class Launcher {
    public static void main(String[] args) {
        
        Shop shop = new Shop();
        Item item = new Item();
        shop.setNOG();
        item.setInitialPrice();
        System.out.println("This is the price of the item: " +item.getInitialPrice());
        shop.buyItem();    
    }
}
