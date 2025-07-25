import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Ticket {

    protected Date emissionDate;
    protected Pavilion[] pavilion;
    protected UUID ticketID;

    public Ticket(Pavilion[] pavilion) {
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilion = pavilion;
    }

    public UUID getTicketID() {
        return ticketID;
    }

    public Date getEmissionDate() {
        return emissionDate;
    }

    public Pavilion[] getPavillon() {
        return pavilion;
    }

    // How to compute the cost of a ticket

    private double Cost() {
        double costTicket = 0;

        if (pavilion.length <= 2 || pavilion.length>2) {
            for (int j = 0; j <= 2; j++) {
            costTicket = costTicket + pavilion[j].getPrice();
            }
        }
        if (pavilion.length > 2) {

            for (int j = 3; j< pavilion.length; j++) {
            costTicket = costTicket + (pavilion[j].getPrice()- pavilion[j].getPrice() * 0.3);
            }   
        
        }
        
        return costTicket;
    }

    @Override
    public String toString() {
        return "\n-- Welcome to Luxembourg History Museum -- \n Ticket ID : " 
                + ticketID 
                + "\n Date :" + emissionDate
                + "\n You can visit :" + Arrays.toString(pavilion) 
                + "\n Total cost is : €"+ String.format("%,.2f\n", Cost());
    }

}
