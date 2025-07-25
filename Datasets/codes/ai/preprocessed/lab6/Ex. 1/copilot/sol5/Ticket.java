import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private List<Pavilion> pavilions;
    private DiscountStrategy discountStrategy;

    public Ticket(List<Pavilion> pavilions, DiscountStrategy discountStrategy) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = pavilions;
        this.discountStrategy = discountStrategy;
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
        double baseCost = pavilions.stream().mapToDouble(Pavilion::getPrice).sum();
        return discountStrategy.applyDiscount(baseCost, pavilions.size());
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