
import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion[] arpav;
    



public Ticket(Pavilion[] arpav){
    this.arpav=arpav;
    ticketID = UUID.randomUUID();
    emissionDate = new java.util.Date();
}

public UUID getUuid(){
    return ticketID;
} 

public Date getEmiDate(){
    return emissionDate;
} 

public double calcPrice(){
    int count = 0;
    int totalprice = 0;
    for (int i = 0; i<9; i++){
        if (arpav[i]!=null){ //check to ignore null in the Array
            count ++;
            if (count <= 3){ //once the count goes over 3, the else block manipulates the price with a discount for every new (new in loop) entry in the array
                totalprice += arpav[i].getPrice();
            }
            else {
                totalprice += arpav[i].getPrice()*0.7;
            }

        }
    }
        return totalprice;
}

public StringBuilder sbf(){ //StringBuilder Method to append every entry to one String
    StringBuilder sbf = new StringBuilder("");
    for (int i = 0; i<9; i++){
        if (arpav[i]!=null){ //check to ignore null in the Array
            String test = arpav[i].getName(); //call to Pavilion class, to get name instead of Object reference
        sbf.append(test + " "); //append every pav to one String, separated by space
        }
    }
return sbf;
}

//@Override
public String toString(){

    return "--Welcome to Luxembourg History Museum--\n" + "Ticket ID: " + ticketID + "\n" + "Date: " + emissionDate +"\n" + "Pavilion(s): " + sbf() + "\n" + "Total cost is: $" + calcPrice();
}
}

