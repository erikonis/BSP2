package Exercise4;

public class LoyaltyCard {

    private Client c;
    private int ID;
    private int points;

    public LoyaltyCard(Client c, int iD, int points) {
        this.c= c;
        this.ID = iD;
        this.points = points;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }

    public Client getC() {
        return c;
    }
    public void setC(Client c) {
        this.c = c;
    }
    public boolean equals(LoyaltyCard c)
    {
        if(this.ID==c.ID)
        {
            return true;
        }
        return false;
    }

    
}