public class GroupTicket extends Ticket {
    private int numberOfVisitors;

    public GroupTicket(Pavilion[] pavilions, int numberOfVisitors) {
        super(pavilions);
        this.numberOfVisitors = numberOfVisitors;
    }

    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    @Override
    public double calculateCost() {
        double baseCost = super.calculateCost();
        if (numberOfVisitors >= 6 && numberOfVisitors <= 12) {
            return baseCost * 0.7; // 30% discount
        } else if (numberOfVisitors > 12) {
            return baseCost * 0.6; // 40% discount
        } else {
            return baseCost; // No discount
        }
    }

    @Override
    public String toString() {
        return "–** Group Ticket **–\n" + super.toString();
    }
}