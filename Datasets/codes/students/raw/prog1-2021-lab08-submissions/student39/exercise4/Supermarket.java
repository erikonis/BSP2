package lu.uni.programming1.lab8.exercise4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Supermarket{

    private HashMap<LocalDate, ArrayList<LoyaltyCard>> loyaltyCardPerDay = new HashMap <> ();

    public void addPointToLoyaltyCard(LoyaltyCard loyaltyCard, double purchases){
        loyaltyCard.setLoyaltyPoints(loyaltyCard.getLoyaltyPoints()+(0.1*purchases)) ;
    }
    
    public void removePointsforMoney(LoyaltyCard loyaltyCard, double purchases){
        loyaltyCard.setLoyaltyPoints(loyaltyCard.getLoyaltyPoints()-(0.1*purchases));
    }

    public double getMoneyWithPoints(LoyaltyCard loyaltyCard){
        return loyaltyCard.getLoyaltyPoints()*10;
    }

    public void getHashMapForOneDay(){
        for (LocalDate localDate: loyaltyCardPerDay.keySet()) {
            System.out.println("\nDate : " + localDate + "\nValue: " + loyaltyCardPerDay.get(localDate) +"\n");
        }
    }
    
    public LoyaltyCard findLoyaltyCard(ArrayList<LoyaltyCard> loyaltyCardUsed, LoyaltyCard loyaltyCard){
        for(LoyaltyCard lCard : loyaltyCardUsed){
            if(lCard.getID()==loyaltyCard.getID()){
                return lCard;
            }
        }  
        return null;       
    }

    public void paid(LoyaltyCard loyaltyCard, double purchases, LocalDate localDate){

        if ((getMoneyWithPoints(loyaltyCard)) >= purchases){

            ArrayList<LoyaltyCard> loyaltyCardUsed = loyaltyCardPerDay.get(localDate);
            if (loyaltyCardUsed == null ){
                loyaltyCardUsed = new ArrayList<>();
                loyaltyCardPerDay.put(localDate, loyaltyCardUsed);
            }
            
            if(findLoyaltyCard(loyaltyCardUsed, loyaltyCard) == null){
                this.removePointsforMoney(loyaltyCard,purchases);
                loyaltyCardUsed.add(loyaltyCard);
            }
            else{
                this.addPointToLoyaltyCard(loyaltyCard, purchases);
            }
        }
        else {
            this.addPointToLoyaltyCard(loyaltyCard, purchases);
        }
    }    
}
