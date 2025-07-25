public class Launcher {
    public static void main(String[] args) {
    
    LoyaltyCard card = new LoyaltyCard(1);
    Person person = new Person("Jack Sparrow", card);
    Supermarket supermarket = new Supermarket();

        supermarket.buyProducts(person, 200);
        System.out.println(person);

        supermarket.buyProducts(person, 300);
        System.out.println(person);

        String buyWithLC = supermarket.buyWithLoyaltyCard(person, 100);
        System.out.println(buyWithLC);
        System.out.println(person);

        buyWithLC=supermarket.buyWithLoyaltyCard(person, 80);
        System.out.println(buyWithLC);
        System.out.println(person);

        supermarket.buyProducts(person, 150);
        System.out.println(person);

        supermarket.buyProducts(person, 120);
        System.out.println(person);

        buyWithLC= supermarket.buyWithLoyaltyCard(person, 40);
        System.out.println(buyWithLC);
        System.out.println(person);
    }
    
}
