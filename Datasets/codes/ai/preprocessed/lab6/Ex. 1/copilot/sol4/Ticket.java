import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private List<Pavilion> pavilions;

    public Ticket(List<Pavilion> pavilions) {
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

    public List<Pavilion> getPavilions() {
        return pavilions;
    }

    public double calculateCost() {
        double totalCost = 0;
        for (int i = 0; i < pavilions.size(); i++) {
            if (i < 3) {
                totalCost += pavilions.get(i).getPrice();
            } else {
                totalCost += pavilions.get(i).getPrice() * 0.7;
            }
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ticket ID: ").append(ticketID).append("\n");
        sb.append("Emission Date: ").append(emissionDate).append("\n");
        sb.append("Pavilions: \n");
        for (Pavilion pavilion : pavilions) {
            sb.append(" - ").append(pavilion.getName()).append(": ").append(pavilion.getPrice()).append(" EUR\n");
        }
        sb.append("Total Cost: ").append(calculateCost()).append(" EUR\n");
        return sb.toString();
    }
}