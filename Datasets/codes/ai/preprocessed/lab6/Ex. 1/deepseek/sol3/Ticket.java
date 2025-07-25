import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private PavilionWrapper[] pavilions;

    public Ticket(PavilionWrapper[] pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = pavilions;
    }

    public double calculateCost() {
        double totalCost = 0;
        for (int i = 0; i < pavilions.length; i++) {
            if (i < 3) {
                totalCost += pavilions[i].getPavilion().getPrice();
            } else {
                totalCost += pavilions[i].getPavilion().getPrice() * 0.7; // 30% discount
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
        for (PavilionWrapper wrapper : pavilions) {
            sb.append("  - ").append(wrapper).append("\n");
        }
        sb.append("Total Cost: ").append(calculateCost()).append(" EUR\n");
        return sb.toString();
    }
}