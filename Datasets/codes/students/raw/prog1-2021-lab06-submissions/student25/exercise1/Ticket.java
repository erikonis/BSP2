package lu.uni.programming1.lab6.exercise1;

import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavillion[] pavillons;
    private double price;

    public Ticket(Pavillion[] pavillons) {
        this.pavillons = pavillons;
        initializeDate();
        initializeTicketID();
    }

    public void initializeTicketID() {
        ticketID = UUID.randomUUID();
    }

    public void initializeDate() {
        emissionDate = new Date();
    }

    public Double totalPrice() {
        price = 0;
        if (pavillons.length < 4) {
            for (Pavillion pavillion : pavillons) {
                price += pavillion.getPrice();
            }
        } else {
            for (int i = 0; i < 3; i++) {
                price += pavillons[i].getPrice();
            }
            for (int i = 3; i < pavillons.length; i++) {
                price += pavillons[i].getPrice()-(0.3*pavillons[i].getPrice());
            }
        }
        return price;
    }
    
    @Override
    public String toString() {
        String string = " — Welcome to Luxemobourg History Museum — " + "\n\t" + "Ticket ID: " + ticketID + "\n\t" + "Date: " + emissionDate + "\n\t" + "You can visit: " + Arrays.toString(pavillons) + "\n\t" + "Total cost is: " + totalPrice() + "€";
        return string;
    }

}
