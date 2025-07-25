package Exercises.exercise1;

import java.util.UUID;

import java.util.Date;

public class Ticket {
    UUID ticketID;
    Date emissionDate;
    Pavilion pavillions[];

    Ticket(int number) {
        emissionDate = new Date(System.currentTimeMillis());
        ticketID = UUID.randomUUID();
        pavillions = new Pavilion[number];

    }

    public void setPavilion(int pos, String name, double price) {

        Pavilion pavilion = new Pavilion(name, price);

        pavillions[pos] = pavilion;

    }

    public double totalcost() {
        double total = 0;
        if (pavillions.length <= 3) {
            for (int i = 0; i < pavillions.length; i++) {
                total = total + pavillions[i].getPrice();
            }

        } else {
            for (int i = 0; i < pavillions.length; i++) {
                if (i < 3) {
                    total = total + pavillions[i].getPrice();
                } else {
                    total = total + (pavillions[i].getPrice() * 0.7);
                }

            }
        }
        return total;
    }

    public String allPavnames() {
        String result = "";
        for (int i = 0; i < pavillions.length; i++) {
            result = result + " " + pavillions[i].getName();
        }
        return result;
    }

    public String toString() {
        return "- Welcome to Luxembourg History Museum -" + System.lineSeparator() + "Ticket ID: " + ticketID
                + System.lineSeparator() + "Date: " + emissionDate + System.lineSeparator() + " You can visit: "
                + allPavnames() + System.lineSeparator() + " Total cost is: " + totalcost();

    }

}
