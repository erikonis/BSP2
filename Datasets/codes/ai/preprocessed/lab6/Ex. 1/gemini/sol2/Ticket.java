import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion[] pavilions;

    public Ticket(Pavilion[] pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = pavilions;
    }

    public UUID getTicketID() {
        return ticketID;
    }

    public Date getEmissionDate() {
        return emissionDate;
    }

    public Pavilion[] getPavilions() {
        return pavilions;
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
        sb.append("Date: ").append(emissionDate).append("\n");
        sb.append("You can visit: ");
        for (int i = 0; i < pavilions.length; i++) {
            sb.append(pavilions[i]);
            if (i < pavilions.length - 1) {
                sb.append(" ");
            }
        }
        sb.append("\n");
        sb.append("Total cost is: $").append(String.format("%.2f", calculateCost()));
        return sb.toString();
    }
}