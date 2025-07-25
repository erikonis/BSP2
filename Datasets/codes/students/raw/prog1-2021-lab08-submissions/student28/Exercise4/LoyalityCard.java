package Exercise4;
import java.util.UUID;

public class LoyalityCard{
    public UUID uniquekey;
    public int loyaltyPoints = 0;

    public LoyalityCard(UUID uniquekey, int loyaltyPoints){
        this.uniquekey = uniquekey;
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getLoyaltyPoints(){
        return loyaltyPoints;
    }

    public void setRandomUUID(){
        this.uniquekey = UUID.randomUUID();
    }
}
