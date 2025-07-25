import java.util.*;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    protected Pavilion[] pavilions;

    public Ticket(Pavilion[] pavilions) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilions = pavilions;
    }

    public double calculateTotalCost() {
        double total = 0;
        for (int i = 0; i < pavilions.length; i++) {
            double price = pavilions[i].getPrice();
            if (i >= 3) {
                price *= 0.7; // 30% discount
            }
            total += price;
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("— Welcome to Luxembourg History Museum —\n");
        sb.append("Ticket ID: ").append(ticketID.toString()).append("\n");
        sb.append("Date: ").append(emissionDate).append("\n");
        sb.append("You can visit: ");
        for (Pavilion p : pavilions) {
            sb.append(p.getName()).append(" ");
        }
        sb.append("\nTotal cost is: $").append(String.format("%.1f", calculateTotalCost()));
        return sb.toString();
    }
}