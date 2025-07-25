import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Ticket {
    Scanner scanner = new Scanner(System.in);
    Date emissionDate = new Date();
    String ticketId = UUID.randomUUID().toString();
    Pavilion[] myPavilion;
    double totalPrice = 0;
    String name = " ";

    public Ticket(Pavilion[] myPavilion) {
        for (int i = 0; i <= 2; i++)
            totalPrice += myPavilion[i].getPrice();

        for (int i = 3; i <= myPavilion.length - 1; i++)
            totalPrice += myPavilion[i].getPrice() * 0.7;

        for (int i = 0; i < myPavilion.length; i++)
            name += myPavilion[i].getName();

    }

    @Override
    public String toString() {
        return "--Welcome to Luxembourg History Museum-- \n Ticket ID: " + ticketId + "\n Date: " + emissionDate
                + "\n You can visit: " + name + "\n Total cost is: " + "€" + totalPrice + " \n";
    }

}
