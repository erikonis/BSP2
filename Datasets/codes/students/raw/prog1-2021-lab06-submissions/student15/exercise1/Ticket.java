package exercise1;

import java.util.Date; 
import java.util.UUID;

public class Ticket {
    private UUID ticketId;
    private Date emmisionDate;
    private Pavilion[] Pavarray;
    private double totalcost;
    
    public Ticket(Pavilion[] Pavarray) {
        this.ticketId = UUID.randomUUID();
        this.emmisionDate=new Date();
        this.Pavarray = Pavarray;
    }

    public double getSum(){
        totalcost = 0;
        for (int i=0; i<3; ++i) {
            totalcost +=Pavarray[i].getPrice();
        }
        for (int i = 3; i<Pavarray.length; ++i) {
            totalcost+=Pavarray[i].getPrice()*0.7;
        }
        return totalcost;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("— Welcome to Luxembourg History Museum —");
        sb.append("\n\tTicket ID: "+ticketId+"\n\tDate: "+emmisionDate+"\n\tYou can visit: ");
        for(int i=0; i<Pavarray.length; ++i) {
            sb.append(Pavarray[i].getName()+" ");
        }
        sb.append("\n\tTotal cost is: $"+getSum()+"\n");
        return sb.toString();
    }
}
