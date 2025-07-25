import java.time.LocalDate;
import java.util.Random;
import java.util.UUID;

public class card {
    private String uniqueID;
    private double points;
    private LocalDate redeemdate;

    public card(double points) {
        uniqueID = UUID.randomUUID().toString();
        this.points = points;
    }

    public card(String uniqueID) {
        this.uniqueID = uniqueID;
    }

    public void setID(String ID) {
        uniqueID = ID;
    }

    public String getID() {
        return uniqueID;
    }

    public LocalDate getredeemdate() {
        return redeemdate;
    }

    public void bought(double price) {
        points += (price / 100) * 10;

    }

    public void redeem(double amount) {
        
            if (points - amount >= 0) {
                points = points - amount;
                redeemdate = LocalDate.now();
                System.out.println("Sucessfully redeemd");
            } else {
                System.out.println("insufficent balance!");
            }
        
    }

}
