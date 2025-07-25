import java.util.Set;

public class GroupTicket {
    private Ticket baseTicket;
    private int numVisitors;

    public GroupTicket(Set<Pavilion> pavilions, int numVisitors) {
        this.baseTicket = new Ticket(pavilions);
        this.numVisitors = numVisitors;
    }

    public double calculateGroupCost() {
        double cost = baseTicket.calculateCost();
        if (numVisitors >= 6 && numVisitors <= 12) {
            return cost * 0.7; // 30% discount
        } else if (numVisitors > 12) {
            return cost * 0.6; // 40% discount
        }
        return cost; // No discount
    }

    @Override
    public String toString() {
        return baseTicket.toString() + ", Group of: " + numVisitors + ", Group Cost: €" + calculateGroupCost();
    }
}