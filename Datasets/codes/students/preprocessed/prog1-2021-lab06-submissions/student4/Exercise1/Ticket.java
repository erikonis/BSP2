import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

public class Ticket {
    
    Scanner scan = new Scanner(System.in);
    Date emissionDate = new Date();
    String ticketID = UUID.randomUUID().toString();
    Pavilion[] pavi;
    double totalprice=0;
    String name ="" ;

    
    public Ticket(Pavilion[] pavi) {
        
        for(int i = 0; i <=2; i++)
        totalprice += pavi[i].getPrice();

        for(int i=3; i<= pavi.length-1; i++)
        totalprice += pavi[i].getPrice()*0.7;
        
        for(int i=0; i<pavi.length;i++)
        name += pavi[i].getName();
    }

    public String toString() {
        return "        ――― Welcome to Luxembourg Museum ―――\n\n   Ticket ID: "+ ticketID + "\n   Date: "+ emissionDate +"\n   You can access: "+ name +"\n   You need to pay: $"+ totalprice + "\n";
    }

    
    
    
}


