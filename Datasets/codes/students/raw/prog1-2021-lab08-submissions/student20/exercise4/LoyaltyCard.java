package exercise4;

import java.time.LocalDate;
import java.util.UUID;

public class LoyaltyCard {
    private double loyaltyPoints;
    private UUID id;
    private LocalDate lastRedeem;
    
    public LoyaltyCard(UUID id) {
        loyaltyPoints = 0.0;
        this.id = id;
    }

    public void addPoints(double money){
        loyaltyPoints += (money/10);
    }

    public UUID getId(){
        return id;
    }

    public boolean redeemCard(double cost){
        if(cost<loyaltyPoints){
            if(lastRedeem == null || lastRedeem != LocalDate.now()){
                lastRedeem=LocalDate.now();
                return true;
            }
            else{
                System.out.println("Cannot redeem this card because it was already redeemed today.");
            }
        }
        else{
            System.out.println("Cannot redeem this card because you do not have enough points.");
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass().equals(this.getClass())){
            LoyaltyCard tempCard = (LoyaltyCard)obj;
            if(tempCard.getId()==id){
                return true;
            }
        }
        return false;
    }

    
}
