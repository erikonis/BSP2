package lu.uni.programming1.lab8.exercise4;

public class LoyaltyCard {

    private int ID;
    private double loyaltyPointsAccumulated;

    public LoyaltyCard(int iD, double loyaltyPoints) {
        this.ID=iD;
        this.loyaltyPointsAccumulated = loyaltyPoints;
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public double getLoyaltyPoints() {
        return loyaltyPointsAccumulated;
    }

    public void setLoyaltyPoints(double loyaltyPoints) {
        this.loyaltyPointsAccumulated = loyaltyPoints;
    }

    @Override
    public int hashCode() {
        return 7*Integer.hashCode(ID);
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
    
    @Override
    public String toString() {
        return " ID number : " + this.getID() + "/ Loyalty Points : " + this.getLoyaltyPoints();
    }

    
}
