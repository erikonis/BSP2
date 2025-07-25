import java.util.Date;
import java.util.UUID;

public class Launcher {
    public static void main(String[] args) {
        int visitors = 20;
        Pavillon pavillon1 = new Pavillon("pav1", 7.0);
        Pavillon pavillon2 = new Pavillon("pav2", 8.0);
        Pavillon pavillon3 = new Pavillon("pav3", 9.0);
        Pavillon pavillon4 = new Pavillon("pav4", 10.0);
        Pavillon pavillon5 = new Pavillon("pav5", 11.0);

        Pavillon pavillons[] = {pavillon1,pavillon2,pavillon3,pavillon4,pavillon5};

        UUID ticketID = UUID.randomUUID();
        Date date = new Date();
        Ticket ticket = new Ticket(ticketID, date, pavillons);
        
        ticketID = UUID.randomUUID();
        date = new Date();
        GroupTicket groupTicket = new GroupTicket(ticketID, date, pavillons, visitors);

        System.out.println(ticket);
        System.out.println();
        System.out.println(groupTicket);
    }

    
}
