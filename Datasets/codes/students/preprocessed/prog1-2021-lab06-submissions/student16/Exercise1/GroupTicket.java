public class GroupTicket extends Ticket{
    
    private int n;

    public GroupTicket(Pavilion[] p, int n) {
        super(p);
        this.n = n;
    }
    
    @Override
    public double getPrice()
    {
        if(n >= 6 && n <= 12)
        {
            return super.getPrice() * 0.7;
        }
        if(n > 12)
        {
            return super.getPrice() * 0.6;
        }
        return super.getPrice();
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i< list.length; i++)
        {
            result += list[i].getName() + " ";
        }
        return "\n\t–** Group Ticket **– \n" + "— Welcome to Luxemobourg History Museum — \n\t Ticket ID: " + ticketID + "\n\t Date: " + emissionDate + "\n\t You can visit: " + result + "\n\t Total cost is: $" + getPrice();
    }

    
}
