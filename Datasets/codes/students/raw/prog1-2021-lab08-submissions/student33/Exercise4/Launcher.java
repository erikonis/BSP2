package Exercise4;

public class Launcher {
    public static void main(String[] args) {
        LoyalityCard lc = new LoyalityCard(1);
        Customer customer = new Customer("Rocky", lc);

        Supermarket supermarket = new Supermarket();

        supermarket.buyProducts(customer, 100);
        System.out.println(customer);

        supermarket.buyProducts(customer, 100);
        System.out.println(customer);

        boolean canBuy = supermarket.buyWithCard(customer, 100);
        System.out.println("can buy: " + canBuy);
        System.out.println(customer);

        canBuy = supermarket.buyWithCard(customer, 20);
        System.out.println("can buy: " + canBuy);
        System.out.println(customer);

        supermarket.buyProducts(customer, 100);
        System.out.println(customer);

        supermarket.buyProducts(customer, 100);
        System.out.println(customer);

        canBuy = supermarket.buyWithCard(customer, 20);
        System.out.println("can buy: " + canBuy);
        System.out.println(customer);
    }
}
