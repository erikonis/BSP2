package lu.uni.programming1.lab6.exercise1;

import java.util.Date;
import java.util.UUID;

public class Ticket {

    public UUID ticketID;
    public Date emissionDate;
    public Pavilion[] selection;

    String names = "";
    double price;
    double totalprice;
    int discount = 0;

    public Ticket(Pavilion[] selection) {

        initializeTicketID();
        CurrentDate();
        this.selection = selection;
        allN();
        totalC();

    }

    private void initializeTicketID() {
        ticketID = UUID.randomUUID();
    }

    private void CurrentDate() {
        emissionDate = java.util.Calendar.getInstance().getTime();
    }

    public void totalC() {
        for (int i = 0; i < selection.length; i++) {

            if (selection[i] != null) {
                price = selection[i].getPrice();
                discount++;
                if (discount > 3) {
                    price = price / 100 * 70;
                }
                totalprice += price;
            }
        }

    }

    public void allN() {
        for (int i = 0; i < selection.length; i++) {

            if (selection[i] != null) {
                names += selection[i].getName();
            }
        }

    }

    @Override
    public String toString() {
        return "--- Welcome to Luxembourg History Museum ---" + "\n" + "Ticket ID: " + ticketID + "\n" + "Date: "
                + emissionDate + "\n" + "You can visit: " + names + "\n" + "Total cost is: " + totalprice;
    }

}
