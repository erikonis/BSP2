package Exercise4;

public class Store{
    LoyalityCard l;
    
    Store(LoyalityCard l){
        this.l = l;
    }

    public LoyalityCard getLoyalityCard(){
        return l;
    }
    
    public void setLoyalityCard(LoyalityCard l){
        this.l = l;
    }
}
