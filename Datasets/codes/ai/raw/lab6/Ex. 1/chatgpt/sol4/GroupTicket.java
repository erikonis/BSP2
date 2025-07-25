public class GroupTicket extends Ticket {
    private int n;

    public GroupTicket(Pavilion[] pavilions, int n) {
        super(pavilions);
        this.n = n;
    }

    @Override
    public double calculateTotalCost() {
        double baseCost = 0;
        for (Pavilion p : pavilions) {
            baseCost += p.getPrice();
        }

        if (n > 12) {
            baseCost *= 0.6; // 40% discount
        } else if (n >= 6) {
            baseCost *= 0.7; // 30% discount
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return "–** Group Ticket **–\n" + super.toString();
    }
}
