package Exercise1;

public class GroupTicket extends Ticket {
    private int n;

    public GroupTicket(Pavilion[] pav,int n) {
        super(pav);
        this.n=n;
        if(this.n>=6)
            if(this.n<=12)
            price=price*0.7;
            else price=price*0.6;
    }

    @Override
    public String toString()
    {  return "\t -**Group Ticket **-"+super.toString(); 
    }

    
}
