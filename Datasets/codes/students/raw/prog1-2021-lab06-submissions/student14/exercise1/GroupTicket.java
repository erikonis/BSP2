package lu.uni.programming1.lab6.exercise1;

public class GroupTicket extends Ticket {
    private int n;

    public GroupTicket(Pavilion[] pav, int n) {
        super(pav);
        this.n = n;
        if (n >= 6 && n <= 12)
        {
            sum = (sum * 0.7);
        }
        else if (n > 12)
        {
            sum = (sum * 0.6);
        }

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
        @Override
        public void ticketPrint() {
             System.out.println("\t\t-** Groupticket (" + n + ")**-");
            super.ticketPrint();
        }

    



}
