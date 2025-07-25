import java.sql.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion[] pavilions;

    public Ticket(Pavilion[] pavs) {
        ticketID = UUID.randomUUID();
        emissionDate = new Date(System.currentTimeMillis());
        this.pavilions = pavs;
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

    public String getPavilionsName() {
        String pavs = "";
        for (Pavilion pavilion : pavilions) {
            pavs += pavilion + ", ";
        }
        return pavs;
    }

    public double cost() {
        double cost = 0.0;
        for (int i = 0; i < pavilions.length; i++) {
            if (i < 3) {
                cost += pavilions[i].getPrice();
            }else{
                cost += pavilions[i].getPrice() * 0.7;
            }
        }
        return cost;
    }

    @Override
    public String toString() {
        return "--- Welcome to Luxembourg History Museum ---" +
        "\n\tTicket ID : " + ticketID.toString() +
        "\n\tDate: " + emissionDate.toString() + 
        "\n\tYou can visit: " + getPavilionsName() + 
        "\n\tTotal cost is: $" + cost();
    }

}
