import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Supermarket {

    Map<LocalDate, List<Card>> redeemedCards = new HashMap<>();
    List<Card> cardList = new ArrayList<>();

    Supermarket(){
        redeemedCards.put(LocalDate.now(),cardList);
    }


    public void buy(double price,Card card){
        card.addPoints((int) (0.1*price));
        System.out.println("Loyalty Points Added To Card : " + 0.1*price);
    }

    public void buyWithRedeem(double price,Card card){
        if (!cardList.contains(card)){
            if (card.points>=price){
                int bal = card.redeemPoints((int) price);
                cardList.add(card);
                System.out.println("Points Sucessfully Redeemed. Balance :" + bal);
            }else {
                System.out.println("Insufficient Loyalty Points.");
            }
        }else{
            System.out.println("Card already used today once.");
        }
    }

}
