package lab6.exercise1;


import java.util.Date;
import java.util.UUID;

public class Ticket {
    private UUID ticketID;
    private Date emissionDate;
    private Pavilion[] pavilions;
    private double ticketPrice = 0;

    public Ticket(Pavilion[] pavilions)
    {
        ticketID = UUID.randomUUID();
        emissionDate = new Date();
        emissionDate.setTime(System.currentTimeMillis());
        this.pavilions = pavilions;

        for(int i=0;i<pavilions.length;i++)
        {
            if(i>3) ticketPrice += 0.7*pavilions[i].getPrice();
            else ticketPrice += pavilions[i].getPrice();
        }
    }

    public double getTicketPrice(){return ticketPrice;}
    public void setTicketPrice(double price){this.ticketPrice = price;}

    public String toString()
    {
        String output = "\n-- Welcome to Luxembourg History Museum --\n\tTicket ID: "+ticketID.toString()+"\n\tDate: "+emissionDate.toString()+"\n\tYou can visit:";
        for(int i=0;i<pavilions.length;i++)
        {
           output += " "+pavilions[i].getName();
        }
        output += "\n\tTotal cost is: $"+ticketPrice;
        return output;
    }
}
