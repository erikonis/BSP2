package Exercise1;

public class GroupTicket extends Ticket {
    
    private int n;


    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public GroupTicket(Ticket ticket, int n) {
        super(ticket);
        this.n=n;

    }

public double discountRate(double whattodiscounthere) {
    double thiswillbediscounted=whattodiscounthere;
    if (n>=6 && n<=12)  thiswillbediscounted*=(2/3d); 
    if (n>12) thiswillbediscounted*=(2/5d); 

    return thiswillbediscounted;

}

}