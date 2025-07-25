import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private LocalDateTime emissionDate;
    private Pavilion[] pavilions;
    private String formatDateTime;
    protected double sum;

    public Ticket(Pavilion[] pav) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        emissionDate = LocalDateTime.now();
        ticketID = UUID.randomUUID();
        this.pavilions = pav;
        formatDateTime = emissionDate.format(format);
        sum = 0;
        for (int i = 0 ; i < pavilions.length ; i++) {
            
            sum = sum + pavilions[i].getPrice();
        }

    }
    public UUID getTicketID() {
        return ticketID;
    }
    public Pavilion[] getPavilions() {
        return pavilions;
    }
    public void setPavilions(Pavilion[] pavilions) {
        this.pavilions = pavilions;
    }
    public String getEmissionDate() { 
        return formatDateTime;
    }
    public void ticketPrint() {

        String pavPrint = "";
        for (int i = 0 ; i < pavilions.length ; i++) {
            pavPrint = pavPrint + pavilions[i].getName() + "; ";
        }
        String fsum = String.format("%.2f", sum);
        System.out.println("-- Welcome to Luxembourg History Museum --");
        System.out.println("\t\tTicket ID : " + getTicketID());
        System.out.println("\t\tDate : " + getEmissionDate());
        System.out.println("\t\tYou can visit : " + pavPrint);
        System.out.println("\t\tTotal cost = " + fsum + " €");


    }


    

}
