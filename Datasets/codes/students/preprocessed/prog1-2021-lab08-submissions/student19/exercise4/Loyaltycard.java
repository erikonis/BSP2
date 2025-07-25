import java.time.LocalDate;
import java.util.UUID;

public class Loyaltycard {
    UUID idcard;
    double points = 0;
    Supermarket supermarket;

    public Loyaltycard(UUID idcard, Supermarket supermarket){
        this.idcard = idcard;
        this.supermarket = supermarket;
    }
    public UUID getIdcard() {
        return idcard;
    }


    public double getPoints() {
        return points;
    }
    
    public void buy(int price) {
        points += price * 0.10;
        System.out.println("You have bought for " + price + " and you have accumulated " + points);
    }
    public void redeem(int price){
        if(points >= price && (!supermarket.getMap().containsKey(LocalDate.now()) && !supermarket.getMap().containsValue(idcard))){
            points -= price;
            System.out.println("You have bought the item with your points and you have " + points + " left");
            supermarket.getMap().put(LocalDate.now(), idcard);
        }
        else{
            System.out.println("You don't respect the conditions. You have " + points + " on the card");
        }
        
    }
}
