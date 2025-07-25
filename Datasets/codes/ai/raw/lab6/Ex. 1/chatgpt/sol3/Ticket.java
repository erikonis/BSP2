package exercise5_v2;

import java.util.Date;
import java.util.HashSet;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private HashSet<Pavilion> pavilions;

    public Ticket(HashSet<Pavilion> pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = new HashSet<>(pavilions);
    }

    public double calculateCost() {
        double total = 0;
        int count = 0;
        for (Pavilion pavilion : pavilions) {
            if (count < 3) {
                total += pavilion.getPrice();
            } else {
                total += pavilion.getPrice() * 0.7;
            }
            count++;
        }
        return total;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + "\nDate: " + emissionDate + "\nTotal Cost: " + calculateCost() + " EUR";
    }
}
