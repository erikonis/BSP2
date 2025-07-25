import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private LocalDate emissionDate;
    private List<Pavilion> pavilions;

    private Ticket(TicketBuilder builder) {
        this.ticketID = builder.ticketID;
        this.emissionDate = builder.emissionDate;
        this.pavilions = builder.pavilions;
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
        // ... (same toString() as before)
    }

    public static class TicketBuilder {
        private UUID ticketID;
        private LocalDate emissionDate;
        private List<Pavilion> pavilions;

        public TicketBuilder(List<Pavilion> pavilions) {
            this.pavilions = pavilions;
            this.ticketID = UUID.randomUUID();
            this.emissionDate = LocalDate.now();
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}