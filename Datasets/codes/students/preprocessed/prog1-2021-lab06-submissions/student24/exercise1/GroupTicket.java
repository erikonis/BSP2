public class GroupTicket extends Ticket {
    private int n;

    GroupTicket(int n, Pavilion[] pavilions2) {
        super(pavilions2);
        this.n = n;
    }

    public double cost() {
        double cost = 0.0;
        for (int i = 0; i < getPavilions().length; i++) {
            cost += getPavilions()[i].getPrice();
        }
        if (n >= 6 && n <= 12) {
            return cost * 0.7;
        } else if (n > 12) {
            return cost * 0.6;
        }
        return cost;
    }

    public String toString() {
        return "\t\t -** Group Ticket **- " +
        "\n" + super.toString();
    }
}
