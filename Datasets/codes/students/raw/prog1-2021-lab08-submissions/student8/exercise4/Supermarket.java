package exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Supermarket {
    ArrayList<LoyaltyCard> cardList;
    LocalDate today;
    Map<LocalDate, ArrayList<LoyaltyCard>> map;

    public LoyaltyCard copyLoyaltyCard(LoyaltyCard loyaltyCard) {
        LoyaltyCard copy = new LoyaltyCard(loyaltyCard.id, loyaltyCard.point);
        loyaltyCard.cardList.add(copy);
        return copy;
    }

    public void addNewLoyaltycard(LoyaltyCard loyaltyCard) {
        ArrayList<LoyaltyCard> newCardList = new ArrayList<>();
        loyaltyCard.cardList = newCardList;
        newCardList.add(loyaltyCard);
        map.put(null,cardList);
    }

    public Supermarket() {
        cardList = new ArrayList<>();
        today = LocalDate.now();
        map = new HashMap<>();
    }
    
    public void redeem(LoyaltyCard lc, double price) {
        boolean check1=true,check2=true;
            if(map.get(today)!=null && map.get(today).contains(lc) == true)
                check1=false;
            if(lc.point<price){
                check2=false;
            }
        
        if(check1 == true && check2 == true){
            lc.redeem(price);
            map.put(today, lc.cardList);
        }
        else if(check1 == false && check2 ==false)
            System.out.println("Your Loyaltycard already was used today and you don´t have enought points");
        else if(check1 == false)
            System.out.println("Your Loyaltycard already was used today");
        else if(check2 == false)
            System.out.println("Your don´t have enough points");
    }
}
