import java.util.Date;
import java.util.UUID;
import java.util.Arrays;
import java.util.Objects;

public class Ticket {
    private final UUID ticketID;
    private final Date emissionDate;
    private final Pavilion[] pavilions;

    public Ticket(Pavilion[] pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = validatePavilions(pavilions);
    }

    private Pavilion[] validatePavilions(Pavilion[] pavilions) {
        if (pavilions == null || pavilions.length == 0) {
            throw new IllegalArgumentException("Pavilions array cannot be null or empty.");
        }
        for (Pavilion pavilion : pavilions) {
            if (pavilion == null) {
                throw new IllegalArgumentException("Pavilion array cannot contain null elements.");
            }
        }
        return pavilions;
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
            totalCost += (i < 3) ? pavilions[i].getPrice() : pavilions[i].getPrice() * 0.7;
        }
        return totalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Objects.equals(ticketID, ticket.ticketID) && Objects.equals(emissionDate, ticket.emissionDate) && Arrays.equals(pavilions, ticket.pavilions);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(ticketID, emissionDate);
        result = 31 * result + Arrays.hashCode(pavilions);
        return result;
    }

    @Override
    public String toString() {
        return "Ticket {" +
                "ticketID=" + ticketID +
                ", emissionDate=" + emissionDate +
                ", pavilions=" + Arrays.toString(pavilions) +
                "}";
    }
}