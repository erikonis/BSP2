public class GroupTicket extends Ticket {
    private int n;

    public GroupTicket(Pavilion[] pavilions, int n) {
        super(pavilions);
        this.n = n;
    }

    @Override
    public double calculateCost() {
        double totalCost = super.calculateCost();
        if (n >= 6 && n <= 12) {
            totalCost *= 0.7; // 30% discount
        } else if (n > 12) {
            totalCost *= 0.6; // 40% discount
        }
        return totalCost;
    }

    @Override
    public String toString() {
        return super.toString() + "Number of Visitors: " + n + "\n";
    }
}