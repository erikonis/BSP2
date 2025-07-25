public class LoyaltyCard {

    String customerFamilyID;

    double points;


    public LoyaltyCard(String customerFamilyID, double points) {
        this.customerFamilyID=customerFamilyID; this.points=points;


    }


    public String getCustomerFamilyID() {
        return this.customerFamilyID;
    }

    public void setCustomerFamilyID(String customerFamilyID) {
        this.customerFamilyID = customerFamilyID;
    }

    public double getPoints() {
        return this.points;
    }

    public void setPoints(double points) {
        this.points = points;
    }


    
}
