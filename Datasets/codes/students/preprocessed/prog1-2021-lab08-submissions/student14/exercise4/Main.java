public class Main {public static void main(String[] args) {
    
    Customer customer1 = new Customer("Mother");

    LoyaltyCard loyaltyCard1 = new LoyaltyCard(customer1);

    customer1.setName("Son");
    LoyaltyCard loyaltyCard2 = new LoyaltyCard(customer1);

    Supermarket supermarket = new Supermarket();

    Item item1 = new Item("Orange", 2);
    Item item2 = new Item("Melon", 1.50);
    Item item3 = new Item("Avocado", 2.30);
    Item item4 = new Item("Headphones", 200);
    Item item5 = new Item("usb adaptater", 7);

    supermarket.buy(item1, loyaltyCard1, false);
    supermarket.buy(item2, loyaltyCard1, false);
    supermarket.buy(item3, loyaltyCard1, false);
    supermarket.buy(item4, loyaltyCard1, false);
    supermarket.buy(item5, loyaltyCard1, true);
    supermarket.buy(item5, loyaltyCard2, true);

}
    
}
