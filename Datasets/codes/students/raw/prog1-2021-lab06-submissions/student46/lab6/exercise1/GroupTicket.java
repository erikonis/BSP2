package lab6.exercise1;

public class GroupTicket extends Ticket{
    public GroupTicket(Pavilion[] pavilions, int n)
    {
        super(pavilions);
        if(n>=6&&n<=12) setTicketPrice(n*super.getTicketPrice()*0.7);
        else if(n>12) setTicketPrice(n*super.getTicketPrice()*0.6);
        else setTicketPrice(n*super.getTicketPrice());
    }

    @Override
    public String toString()
    {   

        return "\n\t-** Group Ticket **-"+super.toString();
    }
}
