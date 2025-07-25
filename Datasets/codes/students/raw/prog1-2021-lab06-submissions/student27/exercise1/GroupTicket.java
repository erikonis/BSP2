package exercise1;

public class GroupTicket extends Ticket {
    private int n;

    public void makePavilions(){
        super.makePavilions();
    }

    public void wantToVisitPavilion(String name, double price) {
        super.wantToVisitPavilion(name, price);
    }

    public void setN(int n) {
        this.n = n;
    }

    public double ticketPrice() {
        if (n > 5 && n < 13) {
            return n*(super.ticketPrice() - (super.ticketPrice() / 100) * 30);
        } else if (n > 12) {
            return n*(super.ticketPrice() - (super.ticketPrice() / 100) * 40);
        } else {
            return n*super.ticketPrice();
        }
    }

    @Override
    public String toString() {
        return ("-** Group Ticket **-" + super.toString());
    }

}
