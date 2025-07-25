
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;



public class Ticket {

    private UUID ticketID;
    
    private LocalDateTime emissionDate;

    private  Pavilion[] pavilions;


    

    public UUID getticketID(){

        return ticketID;


    }

    public LocalDateTime getEmissionDate(){

        return emissionDate;
    }

    public DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/ MM/ yyyy HH:mm:ss");

    

    

    

    
    public Ticket(Pavilion[] pavilions){

        emissionDate = LocalDateTime.now();
        ticketID = UUID.randomUUID();
        this.pavilions = pavilions;
        


    }

    public void TicketPrint(){

        double sum = 0;

        for (int i = 0; i<pavilions.length ;i++){

        sum = sum + pavilions[i].getprice(); 

        }

        String Printpav = "";

        for (int i = 0 ; i<pavilions.length ; i++){

        Printpav = Printpav + pavilions[i].getname()+"| " ; } 


        


       

        System.out.println("-- Welcome to Luxembourg History Museum --");
        System.out.println( "\t Ticket ID :" + getticketID());
        System.out.println("\t Date : " + emissionDate.format(format));
        System.out.println("\t You can visit: " + Printpav);
        System.out.println("\t Your total cost is: " + sum + " €");

        



    }

    

    public double getsum() {

        double sum = 0;

        for (int i = 0; i<pavilions.length ;i++){

        sum = sum + pavilions[i].getprice(); 

    }
        return sum;
   

    
}
}
