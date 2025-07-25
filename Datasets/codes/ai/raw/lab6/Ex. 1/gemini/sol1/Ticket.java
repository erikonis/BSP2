package ex5_basic;

import java.time.LocalDate;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private LocalDate emissionDate;
    private Pavilion[] pavilions;

    public Ticket(Pavilion[] pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = LocalDate.now();
        this.pavilions = pavilions;
    }

    public double calculateCost() {
        double totalCost = 0;
        for (int i = 0; i < pavilions.length; i++) {
            if (i < 3) {
                totalCost += pavilions[i].getPrice();
            } else {
                totalCost += pavilions[i].getPrice() * 0.7; // 30% discount
            }
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(ticketID).append("\n");
        sb.append("Emission Date: ").append(emissionDate).append("\n");
        sb.append("Pavilions:\n");
        for (Pavilion pavilion : pavilions) {
            sb.append("  ").append(pavilion.getName()).append(" (").append(pavilion.getPrice()).append(" EUR)\n");
        }
        sb.append("Total Cost: ").append(calculateCost()).append(" EUR");
        return sb.toString();
    }
}