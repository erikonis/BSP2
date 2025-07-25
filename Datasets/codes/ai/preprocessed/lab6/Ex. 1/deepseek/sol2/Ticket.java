import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion[] pavilions;

    private Ticket(Builder builder) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = builder.pavilions;
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
            sb.append("  - ").append(pavilion.getName()).append(": ").append(pavilion.getPrice()).append(" EUR\n");
        }
        sb.append("Total Cost: ").append(calculateCost()).append(" EUR\n");
        return sb.toString();
    }

    public static class Builder {
        private Pavilion[] pavilions;

        public Builder setPavilions(Pavilion[] pavilions) {
            this.pavilions = pavilions;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}