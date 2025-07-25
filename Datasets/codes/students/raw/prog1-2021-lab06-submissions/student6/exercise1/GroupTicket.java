package lu.uni.programming1.lab6.exercise1;

import java.util.Scanner;

public class GroupTicket extends Ticket {
    Scanner scanner = new Scanner(System.in);
    private int n; // Number of visitors

    public GroupTicket(Pavilion[] myPavilion) {
        super(myPavilion);
        System.out.println("How many tickets do you want? ");
        this.n = scanner.nextInt();

        if (n >= 6 && n <= 12)
            totalPrice = totalPrice * 0.7;

        if (n > 12)
            totalPrice = totalPrice * 0.6;

    }

    @Override
    public String toString() {
        return "\t-**Group Ticket**-\n--Welcome to Luxembourg History Museum-- \n Ticket ID: " + ticketId + "\n Date: "
                + emissionDate + "\n You can visit: " + name + "\n Total cost is: " + "€" + totalPrice + "\n";

    }

}
