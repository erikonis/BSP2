package lu.uni.programming1.lab6.exercise1;

public class GroupTicket extends Ticket {
    private int n;
    private double price;

    public GroupTicket(Pavillion[] pavillons, int n) {
        super(pavillons);
        this.n = n;
    }

    public Double setGroupPrice() {
        if (n >= 6 && n <= 12) {
            price = (super.totalPrice()*n)-(0.3*(super.totalPrice()*n));
            return price;
        } else if (n > 12) {
            price = (super.totalPrice()*n)-(0.4*(super.totalPrice()*n));
            return price;
        } else {
            System.err.println("You don't apply for group ticket");
            return super.totalPrice();
        }
    }

    @Override
    public Double totalPrice() {
        return setGroupPrice();
    }

    @Override
    public String toString() {

        return "\t" + "–** Group Ticket **–" + "\n" + super.toString();
    }

}
