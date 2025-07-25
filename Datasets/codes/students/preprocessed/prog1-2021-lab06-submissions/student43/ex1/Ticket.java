import java.util.Date;
import java.util.UUID;

public class Ticket {

    private UUID ticketID = UUID.randomUUID();
    private Date emissionDate;
    private Pavilion[] list;

    public Ticket(Pavilion[] list) {
        this.emissionDate = new java.util.Date();
        this.list = list;
    }

    // GETTERS:
    public String getId() {
        return ticketID.toString();
    }

    public Date getEmissionDate() {
        return emissionDate;
    }

    public Pavilion[] getPavilions() {
        return list;
    }

    // Calculate the total cost of the ticket
    public double calculateCost() {
        double cost = 0;
        for (int i = 0; i < list.length; i++) {
            if (i < 3) {
                cost += list[i].getPrice();
            } else {
                cost += 0.7 * list[i].getPrice();
            }
        }
        return cost;
    }

    public String toString() {
        String pavs = " ";
        for (int i = 0; i < list.length; i++)
            pavs += list[i].getName() + " ";
        return "--- Welcome to Luxemobourg History Museum --- \n" + "\tTicket ID: " + this.getId() + "\n\tDate: "
                + this.getEmissionDate()
                + "\n\tYou can visit:  " + pavs + "\n\tTotal cost is: " + this.calculateCost() + "\n";
    }
}