import java.util.Date;

import java.util.UUID;

public class Ticket {

    private UUID ticketID = new UUID(Long.MAX_VALUE, Long.MIN_VALUE);

    private Date emissionDate;

    private Pavilion pavilion[];

    private void initializeTicketID() {
        ticketID = ticketID.randomUUID();
    }

    private void initializeEmissionDate() {
        emissionDate = new Date();
    }
    
    public Ticket(Pavilion pavilion[]) {
        initializeTicketID();
        initializeEmissionDate();
        this.pavilion = pavilion;
    }

    public double Cost() {
        double cost = 0;

        for (int i = 0; i < pavilion.length; i++) {
            if (i < 3) {
                cost += pavilion[i].getPrice();
            } else {
                cost += pavilion[i].getPrice() * 0.7;
            }
        }

        return cost;
    }

    @Override
    public String toString() {
        String s = "— Welcome to Luxembourg History Museum —\nTicket ID: " + ticketID.toString() + "\nDate: " + emissionDate.toString() + "\nYou can visit: ";

        //Adds all names of the pavilions
        for (int i = 0; i < pavilion.length; i++) {
            s += pavilion[i].getName() + " ";
        }

        s += "\nTotal cost is: $" + Math.round(Cost()*100)/100.0;

        return s;
    }

}