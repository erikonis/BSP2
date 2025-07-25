import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();

        ArrayList<LoyaltyCard> cards1 = supermarket.giveLoyaltyCards(3);
        LoyaltyCard card1 = cards1.get(0);
        LoyaltyCard card2 = cards1.get(1);
        LoyaltyCard card3 = cards1.get(2);

        card1.pay(531.43);
        card2.pay(326.32);
        card3.pay(2.99);

        card3.redeem(4.99, supermarket);
        card1.redeem(20, supermarket);
        card1.redeem(30, supermarket);
        card2.redeem(20, supermarket);
    }
}
