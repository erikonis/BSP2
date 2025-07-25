package ex1;
public class Groupticket extends Ticket {
    private int n;


    public Groupticket(int n, Pavilion[] pavilions) {
        super(pavilions);
        this.n = n;

    }
    
    public double price()
    {
        double price= ticketPrice()*n;
        if(6<=n && n<=12)
        {
            price=price * 0.7;
        }
        else if (12>n)
        {
            price=price *0.6;
        }
        return price;
    }
     
    @Override
    public String toString() {
        return "The Groupticket costs " + price() + " $ for a group of " + n +" people, where " + super.toString();
    }
    
    
}
