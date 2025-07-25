import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Museum {
    public static void main(String[] args) {
        System.out.println("Enter the number of Persons in the group");
        Scanner scanner = new Scanner(System.in);
        Pavillion p1 = new Pavillion("pav1", 10.0);
        Pavillion p2 = new Pavillion("pav2", 35.0);
        Pavillion p3 = new Pavillion("pav3", 25.0);
        Pavillion p4 = new Pavillion("pav4", 30.0);

        UUID ticketID = UUID.randomUUID();
        Date emissionDate = new Date();
        Pavillion[] pavillions = {p1, p2, p3, p4};
        Ticket ticketname = new Ticket(ticketID, emissionDate, pavillions);

        ticketID = UUID.randomUUID();
        emissionDate = new Date();
        int n = scanner.nextInt();

        GroupTicket groupTicketName = new GroupTicket(ticketID, emissionDate, pavillions, n);
        System.out.println(ticketname);
        System.out.println(groupTicketName);
    }
}
