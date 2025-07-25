package exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {

    private LocalDate redeemDate;
    List<LoyaltyCard> cardList;
    Map<LocalDate, List<LoyaltyCard>> redeemedCards;

    public Supermarket() {
        redeemedCards = new HashMap<>();
    }

    public LocalDate getRedeemDate() {
        return redeemDate;
    }

    public void setRedeemDate(LocalDate redeemDate) {
        this.redeemDate = redeemDate;
    }
    
    public void buy(Item item, LoyaltyCard loyaltyCard, boolean redeem) {
        if(redeem == false){
            loyaltyCard.setPoints(loyaltyCard.getPoints()+0.1*item.getPrice());
            System.out.println("Date : "+LocalDate.now());
            System.out.println(loyaltyCard.getName()+" have purchased : "+item.getName());
        }else{
            redeem(item, loyaltyCard);
        }
        System.out.println("Loyalty card points : " + loyaltyCard.getPoints()+"\n");
    }

    public void redeem(Item item, LoyaltyCard loyaltyCard) {
        LocalDate redeemDate = LocalDate.now();
        boolean isRedeem = false;
        if(redeemedCards.containsKey(redeemDate)){
            List<LoyaltyCard> cardList = redeemedCards.get(redeemDate);
            for(LoyaltyCard card : cardList){
                if(card.equals(loyaltyCard)){
                    isRedeem = true;
                }
            }
            if(loyaltyCard.getPoints()>item.getPrice() && isRedeem==false){
                loyaltyCard.removePoints(item.getPrice());
                cardList.add(loyaltyCard);
                redeemedCards.put(redeemDate,cardList);
                System.out.println("Date : "+redeemDate);
                System.out.println(loyaltyCard.getName()+" have purchased : "+item.getName());
                System.out.println(loyaltyCard.getName()+" used "+item.getPrice()+" points.");
            }else{
                System.out.println("Date : "+redeemDate);
                System.out.println(loyaltyCard.getName()+" have already redeemed today or have not enough points in his/her loyalty card!");
            }
        }else{
            cardList = new ArrayList<LoyaltyCard>();
            if(loyaltyCard.getPoints()>item.getPrice()){
                loyaltyCard.removePoints(item.getPrice());
                cardList.add(loyaltyCard);
                redeemedCards.put(redeemDate,cardList);
                System.out.println("Date : "+redeemDate);
                System.out.println(loyaltyCard.getName()+" have purchased : "+item.getName());
                System.out.println(loyaltyCard.getName()+" used "+item.getPrice()+" points.");
            }
        }

    }

}
