package exercise1;

import java.util.Date;
import java.util.Arrays;
import java.util.UUID;

public class Ticket {
    private Pavilion[] arrPavilion = new Pavilion[9];
    private Date emissionDate;
    private UUID ticketID = UUID.randomUUID();

    public Date getEmissionDate() {
        long millis = System.currentTimeMillis();
        java.util.Date date = new java.util.Date(millis);
        return emissionDate = date;
    }

    public void makePavilions() {
        for (int i = 0; i < 9; i++) {
            arrPavilion[i] = new Pavilion("", 0.0);
        }
    }

    public void wantToVisitPavilion(String name, double price) {
        for (int i = 0; i < 9; i++) {
            if (arrPavilion[i].getName().equals("")) {
                arrPavilion[i] = new Pavilion(name, price);
                i = 10;
            }
        }
    }

    public String visitedPavilion() {
        for (int i = 0; i < 9; i++) {
            return arrPavilion[i].getName() + " ";
        }
        return "";
    }

    public double ticketPrice() {
        double pavilionPrice = 0;

        for (int i = 0; i < 9; i++) {
            if (i > 2) {
                pavilionPrice = pavilionPrice + (arrPavilion[i].getPrice() - (arrPavilion[i].getPrice() / 100) * 30);
            } else {
                pavilionPrice = pavilionPrice + arrPavilion[i].getPrice();
            }
        }
        return pavilionPrice;
    }

    @Override
    public String toString() {
        return "\n" + "-- Welcome to Luxembourg History Museum --" + "\n" + "\tTicket ID: " + ticketID + "\n"
                + "\tDate: " + getEmissionDate() + "\n" + "\tYou can visit: " + visitedPavilion() + "\n"
                + "\tTotal cost is: " + ticketPrice();
    }

}
