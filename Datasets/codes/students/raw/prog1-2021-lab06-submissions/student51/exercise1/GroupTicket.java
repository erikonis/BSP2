package exercise1;

public class GroupTicket extends Ticket {

    private int n;

    public GroupTicket(int size, int n) {
        super(size);
        this.n = n;
    }

    public double calculatePrice() {
        if (n > 12) {
            return 0.6 * super.calculatePrice();
        } else if (n >= 6) {
            return 0.7 * super.calculatePrice();
        } else {
            return super.calculatePrice();
        }
    }

    @Override
    public String toString() {
        return "-** Group Ticket **-\n"+super.toString(calculatePrice());
    }

    
}
