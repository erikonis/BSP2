package exercise5_v2;

import java.util.HashSet;

public class GroupTicket extends Ticket {
    private int groupSize;

    public GroupTicket(HashSet<Pavilion> pavilions, int groupSize) {
        super(pavilions);
        this.groupSize = groupSize;
    }

    @Override
    public double calculateCost() {
        double baseCost = super.calculateCost();
        if (groupSize >= 6 && groupSize <= 12) {
            return baseCost * 0.7;
        } else if (groupSize > 12) {
            return baseCost * 0.6;
        }
        return baseCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nGroup Size: " + groupSize;
    }
}
