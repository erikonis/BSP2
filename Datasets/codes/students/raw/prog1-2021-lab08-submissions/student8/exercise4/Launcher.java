package exercise4;

public class Launcher {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        LoyaltyCard lc1 = new LoyaltyCard(100);
        LoyaltyCard lc2 = new LoyaltyCard();
        LoyaltyCard lc3 = new LoyaltyCard();
        supermarket.addNewLoyaltycard(lc1);
        supermarket.addNewLoyaltycard(lc2);
        supermarket.addNewLoyaltycard(lc3);
        LoyaltyCard lc1copy = supermarket.copyLoyaltyCard(lc1);
        System.out.println(lc1.toString()); 
        lc1.buy(100);
        supermarket.redeem(lc1, 50);
        supermarket.redeem(lc1, 5);
        supermarket.redeem(lc1copy, 150);
        System.out.println(lc2.toString()); 
        supermarket.redeem(lc2, 10);
        lc2.buy(100);
        supermarket.redeem(lc2, 5);
        supermarket.redeem(lc2, 5);
        supermarket.redeem(lc2, 6);
        System.out.println(lc3.toString()); 
        lc3.buy(500);
        supermarket.redeem(lc3, 51);
        supermarket.redeem(lc3, 49);
        LoyaltyCard lc3copy = supermarket.copyLoyaltyCard(lc3);
        supermarket.redeem(lc3copy, 1);
        supermarket.redeem(lc3, 2);





    }
}
