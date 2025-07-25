package exercise4;

import java.util.UUID;

public class LoyaltyCard {
    private UUID ID;
    private int points;

    public LoyaltyCard(){
        this.ID = UUID.randomUUID();
        this.points = 0;
    }

    public UUID getID() {
        return ID;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((ID == null) ? 0 : ID.hashCode());
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
        if (ID == null) {
            if (other.ID != null)
                return false;
        } else if (!ID.equals(other.ID))
            return false;
        return true;
    }
    
}
