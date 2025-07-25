public class LoyaltyCard {
    private static int idCount = 123456;
    private int points, id;
    
    public LoyaltyCard() {
        generateId();
    }

    private void generateId() {
        id = idCount++;
    }

    public int getId() {
        return id;
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
        result = prime * result + id;
        result = prime * result + points;
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
        if (id != other.id)
            return false;
        if (points != other.points)
            return false;
        return true;
    }

    
}
