import java.util.Scanner;

public class GroupTicket extends Ticket {

    Scanner scan = new Scanner(System.in);
    private int n; // number of visitors
    Test testing = new Test(); // initialise main class

    Pavilion[] pavi; // initialise pavilion object as array

    public GroupTicket(Pavilion[] pavil) {
        super(pavil);// ticket is super
        System.out.print("Enter the number of people: ");
        this.n = scan.nextInt();
        if (n >= 6 && n <= 12)// if the group is a certain size you get 30 or 40% off so it is 70%/60% of og price
            totalPrice = totalPrice * 0.7;
        if (n > 12)
            totalPrice = totalPrice * 0.6;

    }

    public String toString() {
        return "_**Group ticket**_\n-- Welcome to Luxembourg History Museum --\nTicket ID: " + ticketId + "\nDate: "
                + emissionDate + "\nYou can visit: " + name + "\nTotal cost is: " + totalPrice;
    }

}