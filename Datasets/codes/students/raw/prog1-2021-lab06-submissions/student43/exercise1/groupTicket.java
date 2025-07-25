package lu.uni.programming1.lab6.exercise1;

public class groupTicket extends Ticket {
    private int n; // represents the number of visitors

    public groupTicket(Pavilion[] sections, int numberOfVisitors) {
        super(sections);
        // TO DO Auto-generated constructor stub
        n = numberOfVisitors;
    }

    public double getTicketPrice() {
        double returnValue = 0;
        double oneTicket = super.getTicketPrice();
        returnValue = oneTicket * n;
        if (n >= 6 && n <= 12) {
            returnValue = returnValue * 0.7;// This is 30% discount
        }
        if (n > 12) {
            returnValue = returnValue * 0.6;// This is 40% discount
        }
        return returnValue;
    }

    public String toString() {
        String printedTicket = "** Group Ticket **\n";
        printedTicket += super.toString();
        return printedTicket;
    }
}