import java.util.Date;
import java.util.UUID;


public class GroupTicket extends Ticket{
    private int n;

    GroupTicket(UUID ticketID, Date emissionDate, Pavillion pavillions[], int n){
        super(ticketID, emissionDate, pavillions);
        this.n = n;
    }

    public double totalcalcprice() {
        double totalprice = priceCalc()*n;
        if (n >= 6 && n <= 12) {
            totalprice *= 0.7;
        }
        else if( n > 12){
            totalprice *= 0.6;
        }
        return totalprice;
    }

    public String TicketInfoGroup() {
        String title = "\t-** Group Ticket **-\n";
        title += "--- Welcome to Luxembourg History Museum ---\n";
        title += "\tTicketID: " + ticketID;
        title += "\n\tDate: " + emissionDate;
        for (int i = 0; i < pavillions.length; i++) {
            title += "\n\tYou can visit: " + pavillions[i].getName();
        }
        title += "\n\tTotal cost is: $" + String.format("%.1f",totalcalcprice());
        return title;
    }

    @Override
    public String toString(){
        return TicketInfoGroup(); 
    }
}
