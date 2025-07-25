package exercise1;

public class GroupTicket extends Ticket{
    private int n;
    private double totalcost = 0;

    public GroupTicket(Pavilion[] Pavarray) {
        super(Pavarray);
        this.setN(n);
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public double getSum() {
        totalcost = super.getSum();

        if(n>=6 && n<=12){
            totalcost=totalcost*0.7;

        }else if(n>12){
            totalcost=totalcost*0.6;
        }
        return totalcost;
    }
    
    @Override
    public String toString() {
        return "\t–** Group Ticket **–\n"+super.toString();
    }
   
}
