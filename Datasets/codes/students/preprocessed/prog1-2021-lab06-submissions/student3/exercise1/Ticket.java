import java.util.Date;
import java.util.UUID;

public class Ticket {
   private UUID ticketID;
   private Date emissionDate;
   private Pavilion[] pavilions; 
   public Ticket(Pavilion[] pavilions) {
    this.pavilions = pavilions;
    this.ticketID = UUID.randomUUID();
    this.emissionDate = new Date();
    
   }
   public double getPrice() {
    double result = 0.0;
    for(int i = 0; i < this.pavilions.length;i++) {
        if (i > 2) {
            result += this.pavilions[i].getPrice()  * 30 / 100;
        }else{
            result += this.pavilions[i].getPrice(); 
        } 
    }
    return result;
    

   }
   public String toString() {
    String result = "— Welcome to Luxemobourg History Museum —";
    result += "\n\t Ticket ID: " + this.ticketID; 
    result += "\n\t Date: " + this.emissionDate;
    result += "\n\t You can visit:";
    for(int i=0; i < this.pavilions.length; i++) {
        result += this.pavilions[i].getName() + " ";
     
    }
    result += "\n\t Total cost is: " + this.getPrice();
    return result; 
   }
}
