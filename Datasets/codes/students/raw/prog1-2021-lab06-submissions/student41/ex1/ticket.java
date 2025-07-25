package ex1;
import java.util.*;

public class ticket {
    UUID ticketID; 
    Date emission;
    int a;
    pavilion[] pavArray; 

    public double cost() {
        double cost=0;
        for(a=0;a<=2;a++){
         cost +=pavArray[a].getPrice();
     }
        for(a=3;a<pavArray.length;a++){
         cost +=pavArray[a].getPrice()*0.7;
    }
        return cost;        
    }
    public void Ticket(pavilion[] pavArray) {
        this.ticketID=UUID.randomUUID();
        this.emission= new Date();
        this.pavArray=pavArray;
        
    }
    
    @Override
    public String toString() {
        return "ticket [costs=" + cost() + ", emission=" + emission + ", pavArray=" + pavArray
                + ", ticketID=" + ticketID + "]";
    }

}