public class LoyaltyCard {
    private long id;
    private int points;

    public LoyaltyCard(long ID)
    {
        id = ID;
        points =0;
    }

    public long getID()
    {
        return id;
    }

    public void addPoints(int add)
    {
        points += add;
    }

    public void subPoints(int sub)
    {
        points -= sub;
    }

    public int getPoints()
    {
        return points;
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
        return true;
    }

}