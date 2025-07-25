//import java.util.Scanner;

public class MuseumMain {
    
    public static void main(String[] args) {
        
        // The number of people
        int n = 1 ;

        // The pavillons
        Pavilion p0 = new Pavilion("Prehistory", 5.00);
        Pavilion p1 = new Pavilion("Ancient Egypt ", 6.00);
        Pavilion p2 = new Pavilion("Middle Age", 5.00);
        Pavilion p3 = new Pavilion("Renaissance", 7.00);
        
        Pavilion []pavillon = {p0, p1, p2, p3};


         if (n<=6) {
             for (int i = 0; i < n; i++) {
                Ticket Ticket = new Ticket(pavillon);
                System.out.println(Ticket);
             }
         }

         if (n>6) {
            Ticket gTicket = new GroupTicket(pavillon, n);
            System.out.println(gTicket);
        }

         

        



    }
}
