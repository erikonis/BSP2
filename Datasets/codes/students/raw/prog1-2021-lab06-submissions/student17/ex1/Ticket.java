package ex1;
import java.util.Date;
import java.util.UUID;
import java.util.jar.Attributes.Name;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion[] pavilion;

    public Ticket(Pavilion[] pavilions){
        this.ticketID = UUID.randomUUID();
        this.emissionDate = new Date();
        this.pavilion = pavilions;
    }
     
     
    public double ticketPrice(){
        double price=0;
        for (int s=0;s<pavilion.length;s++)
        {
            if(s < 3)
            {
                price+=pavilion[s].getPrice();
            }
            else
            {
                price+=pavilion[s].getPrice()*0.7;
            }
        }
        return price;
    }

    public String pavilion(){
        String name="";
        for (int s=0;s<pavilion.length;s++)
        {
            name+= pavilion[s].getName();
        }
        return name;
    }
    
    @Override
    public String toString() {
        System.out.println("___Welcome to Luxembourg History Museum___");
        System.out.println("Ticket ID: " + ticketID);
        System.out.println("Date: " + emissionDate);       
        System.out.println("You can visit: " + pavilion());
        return "One Ticket costs " + ticketPrice() + " $ ";
    }    
}
