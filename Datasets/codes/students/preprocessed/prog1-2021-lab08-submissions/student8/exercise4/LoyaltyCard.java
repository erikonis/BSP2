import java.util.ArrayList;
import java.util.UUID;

public class LoyaltyCard {

    UUID id;
    double point;
    ArrayList<LoyaltyCard> cardList;

    public LoyaltyCard(UUID id, double point) {
        this.id = id;
        this.point = point;
    }

    public LoyaltyCard(double point) {
        this.point = point;
        this.id = UUID.randomUUID();
    }

    public LoyaltyCard() {
        this.point = 0;
        this.id = UUID.randomUUID();
    }

    public void buy(double price) {
        point += 0.1*price;
        System.err.println("You bought for "+price+"$\t\t\t\t|| Points : "+point);
    }

    public void redeem(double price) {
        point -= price;
        price = 0;
        System.out.println("You paid the full amount with points \t\t|| Points : "+point);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LoyaltyCard other = (LoyaltyCard) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString(){
        return "\nID: "+id+" \t|| Points: "+point;
    }

    
    
}
