package exercise4;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        UUID cardID = UUID. randomUUID();
        Supermarket supermarket = new Supermarket();
        
        Loyaltycard card1 = new Loyaltycard(cardID, supermarket);
        Loyaltycard card2 = new Loyaltycard(cardID, supermarket);

        cardID = UUID. randomUUID();
        
        Loyaltycard card3 = new Loyaltycard(cardID, supermarket);

        card1.buy(100);
        card1.redeem(5);
        card2.redeem(4);
        card3.redeem(3);
        card1.redeem(2);
    }

}
