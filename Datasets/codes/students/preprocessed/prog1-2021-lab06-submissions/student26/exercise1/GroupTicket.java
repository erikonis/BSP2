import java.util.Date;
import java.util.UUID;

public class GroupTicket extends Ticket {
    private int visitors;

    public GroupTicket(UUID ticketID, Date date, Pavillon pavillons[], int visitors){
        super(ticketID,date,pavillons);
        this.visitors = visitors;
    }

    public double discount(){
        double TicketCost = visitors * Cost();
        if (6 <= visitors && visitors <= 12) {
            TicketCost *= 0.7;
        } else if (visitors > 12) {
            TicketCost *= 0.6;
        }
        return TicketCost;
    }

    public String output(){
        String result = "\n\t-** Group Ticket **-" + "\n--- Welcome to Luxembourg History Museum ---" 
        + "\n\tTicket ID: " + ticketID + "\n\tDate: " + date + "\n\tYou can visit: ";
        for (int i = 0; i < pavillons.length; i++) {
            result += pavillons[i].getName() + " ";
        }
        result += "\n\tTotal cost is: $" + String.format("%.1f",discount());
        return result;
    }

    @Override
    public String toString(){
        return output();
    }
}
