public class GroupTicket extends Ticket {
    private final int groupSize;

    public GroupTicket(Pavilion[] pavilions, int groupSize) {
        super(pavilions);
        this.groupSize = groupSize;
    }

    @Override
    public double calculateCost() {
        double baseCost = super.calculateCost();
        if (groupSize >= 6 && groupSize <= 12) {
            return baseCost * 0.7; // 30% discount
        } else if (groupSize > 12) {
            return baseCost * 0.6; // 40% discount
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return "--** Group Ticket **--\n" + super.toString();
    }
}