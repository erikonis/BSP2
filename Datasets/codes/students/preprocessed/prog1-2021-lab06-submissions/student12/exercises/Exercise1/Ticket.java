import java.util.Date;
import java.util.UUID;

public class Ticket
{
    private String ticketid;
    private Date emissionDate;
    private static Pavilion[] arPav;

    public Ticket(int size)
    {
        emissionDate = new Date();
        ticketid = UUID.randomUUID().toString();
        arPav = new Pavilion[size];
    }

    public void add(Pavilion pav)
    {
        for (int i = 0; i < arPav.length; i++) {
            if(arPav[i] == null)
            {
                arPav[i] = pav;
                System.out.println("Succesfully added!");
                return;
            }
        }
        System.out.println("You can't add any more Pavilions to your ticked!");
    }

    public double calculatePrice()
    {
        double price =0;

        for (int i = 0; i < arPav.length; i++)
        {
            if(arPav[i] != null)
            {
                if(i <3)
                {
                    price += arPav[i].getPrice();
                }
                else
                {
                    price += arPav[i].getPrice() *0.7;
                }
            }
        }
        return price;
    }

    public double priceWithoutDiscout()
    {
        double price =0;

        for (int i = 0; i < arPav.length; i++)
        {
            if(arPav[i] != null)
            {
                price += arPav[i].getPrice();
            }
            
        }
        return price;
    }

    public String toString()
    {
        String text = "--Welcome to Luxembourg History Museum-- \nTicket ID: "
        + ticketid + "\nDate: " + emissionDate + "\nYou can visit: " + eachPav()
        + "\nTotal cost is: ";

        return text;
    }

    public String eachPav()
    {
        String text ="";
        for (int i = 0; i < arPav.length; i++) {
            if(arPav[i] != null)
            {
                text += arPav[i].getName();
                if(arPav[i+1] != null)
                {
                    text += ", ";
                }
            }
        }
        return text;
    }
}
