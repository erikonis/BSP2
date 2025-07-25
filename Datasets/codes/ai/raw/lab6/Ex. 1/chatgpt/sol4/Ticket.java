package solution4;

import java.util.*;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Set<Pavilion> pavilions;

    public Ticket(Set<Pavilion> pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = new TreeSet<>(pavilions); // Ensures sorted order
    }

    public double calculateCost() {
        double total = 0;
        int count = 0;
        for (Pavilion pavilion : pavilions) {
            count++;
            total += (count > 3) ? pavilion.getPrice() * 0.7 : pavilion.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + ", Date: " + emissionDate + ", Pavilions: " + pavilions + ", Total Cost: €" + calculateCost();
    }
}
