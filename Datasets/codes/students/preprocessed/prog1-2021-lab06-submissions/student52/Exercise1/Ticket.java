import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Ticket {
    Scanner input = new Scanner(System.in);
    Date emissionDate = new Date();
    double price, totalPrice = 0;
    String name = "";
    Test test = new Test();
    Pavilion[] pavili;
    String ticketId = UUID.randomUUID().toString();

    public Ticket(Pavilion[] pavili) {// constructor for ticket

        for (int i = 0; i <= 2 && i < pavili.length; i++)// calculate the total price by iterating through the array and getting the value at each index                                                        
            totalPrice += pavili[i].getPrice();
        for (int i = 3; i <= pavili.length - 1; i++)
            totalPrice += pavili[i].getPrice() * 0.7; // because there is 30% off so it is 70%

        for (int i = 0; i < pavili.length; i++)
            name += pavili[i].getName() + " "; // same thing as for price

    }

    public String toString() {
        return "-- Welcome to Luxembourg History Museum --\nTicket ID: " + ticketId + "\nDate: " + emissionDate
                + "\nYou can visit: " + name + "\nTotal cost is: " + totalPrice;

    }

}
