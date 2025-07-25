package exercise1;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    protected Pavillon pavillons[];
    protected Date date;
    protected UUID ticketID;

    public Ticket(UUID ticketID, Date date, Pavillon pavillons[]){
        this.ticketID = ticketID;
        this.date = date;
        this.pavillons = pavillons;
    }

    public double Cost(){
        double TicketCost = 0;
        for (int i = 0; i < pavillons.length; i++) {
            if (i > 2) {
                TicketCost += pavillons[i].getPrice()*0.7;
            } else {
                TicketCost += pavillons[i].getPrice();
            }
        }
        return TicketCost;
    }

    public String output(){
        String result = "--- Welcome to Luxembourg History Museum ---";
        result += "\n\tTicket ID: " + ticketID + "\n\tDate: " + date + "\n\tYou can visit: ";
        for (int i = 0; i < pavillons.length; i++) {
            result += pavillons[i].getName() + " ";
        }
        result += "\n\tTotal cost is: $" + String.format("%.1f", Cost());
        return result;
    }

    @Override
    public String toString(){
        return output();
    }
}
