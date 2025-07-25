import java.util.Date;
import java.util.UUID;

public class Ticket {
    
    protected final UUID ticketID = UUID.randomUUID();
    protected Date emissionDate;
    protected Pavilion[] list;

    public Ticket(Pavilion[] p) {
        this.emissionDate = java.util.Calendar.getInstance().getTime();
        list= p;
    }

    public double getPrice()
    {
        double price=0;
        if(list.length<=3)
        {
            for(int i = 0; i < list.length; i++)
            {
                price += list[i].getPrice();
            }
        }
        else
        {
            for(int i = 0; i < 3; i++)
            {
                price += list[i].getPrice();
            }
            for(int i = 3; i < list.length; i++)
            {
                price += list[i].getPrice() * 0.7;
            }
        }
        return price;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i< list.length; i++)
        {
            result += list[i].getName() + " ";
        }
        return "— Welcome to Luxembourg History Museum — \n\t Ticket ID: " + ticketID + "\n\t Date: " + emissionDate + "\n\t You can visit: " + result + "\n\t Total cost is: $" + getPrice();
    }
    
    
}
