package exercise5;

import java.util.ArrayList;

public class GroupTicket extends Ticket {
    private int groupSize;

    public GroupTicket(ArrayList<Pavilion> pavilions, int groupSize) {
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
        return super.toString() + "\nGroup Size: " + groupSize;
    }
}
