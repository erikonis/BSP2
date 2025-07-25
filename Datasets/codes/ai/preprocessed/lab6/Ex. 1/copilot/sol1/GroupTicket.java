public class GroupTicket extends Ticket {
    private int n;

    public GroupTicket(Pavilion[] pavilions, int n) {
        super(pavilions);
        this.n = n;
    }

    @Override
    public double calculateCost() {
        double baseCost = super.calculateCost();
        if (n >= 6 && n <= 12) {
            return baseCost * 0.7;
        } else if (n > 12) {
            return baseCost * 0.6;
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return super.toString() + "Number of Visitors: " + n + "\n";
    }
}