package exercise5;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private ArrayList<Pavilion> pavilions;

    public Ticket(ArrayList<Pavilion> pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = new ArrayList<>(pavilions);
    }

    public double calculateCost() {
        double total = 0;
        for (int i = 0; i < pavilions.size(); i++) {
            if (i < 3) {
                total += pavilions.get(i).getPrice();
            } else {
                total += pavilions.get(i).getPrice() * 0.7; // 30% discount
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + "\nDate: " + emissionDate + "\nTotal Cost: " + calculateCost() + " EUR";
    }
}
