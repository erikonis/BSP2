package lu.uni.programming.Lab6.exercise1;

import java.util.Date;
import java.util.UUID;

public class Ticket {
    
    private UUID ticketUuid = UUID.randomUUID();
    private Date emissionDate = new Date();
    private Pavillon[] arPavillons = new Pavillon[100];

    public void add(Pavillon pav){
        int i=0;
        while(arPavillons[i]!=null){
            i++;
        }
        arPavillons[i]=pav;
    }

    public double getPrice(){
        double price=0;
        int i=0;
        while(arPavillons[i]!=null){
            if(i<=3){
                price+= arPavillons[i].getPrice();
            }
            else{
                price += (0.7*arPavillons[i].getPrice());
            }
            i++;
        }
        return price;
    }

    public String toString(){
        System.out.println("--- Welcome to Luxembourg History Museum ---");
        System.out.println("\tTicket ID: "+ ticketUuid);
        System.out.println("\tDate: "+emissionDate.getTime());
        System.out.print("\tYou can visit: ");
        int i=0;
        while(arPavillons[i]!=null){
            System.out.print(arPavillons[i].getName()+" ");
            i++;
        }
        System.out.println("\n\tTotal cost is: " + getPrice());
        return "";
    }

}
