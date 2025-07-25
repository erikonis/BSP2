import java.util.Date;
import java.util.UUID;

public class Ticket {
    UUID ticketID;
    Date emissionDate;
    Pavillion pavillions[];

    Ticket(UUID ticketID, Date emissionDate, Pavillion pavillions[]){
        this.ticketID = ticketID;
        this.emissionDate = emissionDate;
        this.pavillions = pavillions;
    }

    public double priceCalc() {
        double total = 0;
        for (int i = 0; i < pavillions.length; i++) {
           if (i < 3) {
                total += pavillions[i].getPrice();
            } else {
                total += pavillions[i].getPrice()*0.7;
            }
        }
        return total;
    }


    public String TicketInfoSingle() {
        String title = "--- Welcome to Luxembourg History Museum ---\n";
        title += "\tTicketID: " + ticketID;
        title += "\n\tDate: " + emissionDate;
        for (int i = 0; i < pavillions.length; i++) {
            title += "\n\tYou can visit: " + pavillions[i].getName();
        }
        title += "\n\tTotal cost is: $" + String.format("%.1f",priceCalc());
        return title;
    }

    @Override
    public String toString(){
        return TicketInfoSingle(); 
    }
}
