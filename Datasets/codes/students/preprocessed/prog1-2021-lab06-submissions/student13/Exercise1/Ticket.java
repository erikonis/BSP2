import java.text.DecimalFormat;
import java.util.Date;
import java.util.UUID;

public class Ticket {
    private String ticketUid;
    private Date emissionDate;
    private Pavilion[] array;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Ticket(Pavilion[] sections) {
        ticketUid = UUID.randomUUID().toString();
        emissionDate = new Date();
        this.array = sections;
    }

    public double getTicketPrice() {
        double returnValue = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < 3) {
                returnValue += array[i].getPrice() * 1; // This is full price
            } else {
                returnValue += array[i].getPrice() * 0.7; // This is 30% discount price
            }
        }
        return returnValue;
    }

    public String toString() {
        String printedTicket = "";
        printedTicket += "Welcome to Luxemobourg History Museum\n";
        printedTicket += "Ticket ID: " + ticketUid + "\n";
        printedTicket += "Date : " + emissionDate + "\n";
        printedTicket += "You can vist : \n";
        for (int i = 0; i < array.length; i++) {
            printedTicket += array[i];
        }
        printedTicket += "\n";
        printedTicket += "Total cost is : " + df.format(getTicketPrice()) + "\n";
        return printedTicket;
    }
}