package lu.uni.programming1.lab8.exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Supermarket {

    private Map<LoyaltyCard, LocalDate> loyaltyCards;
    private static int nextId = 0;

    private int giveNextId() {
        return ++nextId;
    }

    public Supermarket() {
        this.loyaltyCards = new HashMap<LoyaltyCard, LocalDate>();
    }
    
    public ArrayList<LoyaltyCard> giveLoyaltyCards(int amount){
        int id = giveNextId();
        ArrayList<LoyaltyCard> newCards = new ArrayList<LoyaltyCard>();
        
        for (int i = 0; i < amount; i++) {
            newCards.add(new LoyaltyCard(id));
        }

        loyaltyCards.put(new LoyaltyCard(id), LocalDate.of(1970, 1, 1));

        return newCards;
    }

    public void redeem(LoyaltyCard loyaltyCard) {
        //updates the last redeem date to today
        loyaltyCards.put(loyaltyCard, LocalDate.now());
    }

    public boolean redeemed(LoyaltyCard loyaltyCard) {  
        //looks if card has already redeemed for today

        if (loyaltyCards.get(loyaltyCard).equals(LocalDate.now())) {
            return true;
        }
        return false;
    }

}
