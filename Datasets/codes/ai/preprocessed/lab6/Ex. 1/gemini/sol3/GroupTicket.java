import java.util.Arrays;
import java.util.Objects;

public class GroupTicket extends Ticket {
    private final int numberOfVisitors;

    public GroupTicket(Pavilion[] pavilions, int numberOfVisitors) {
        super(pavilions);
        this.numberOfVisitors = validateNumberOfVisitors(numberOfVisitors);
    }

    private int validateNumberOfVisitors(int numberOfVisitors) {
        if (numberOfVisitors <= 0) {
            throw new IllegalArgumentException("Number of visitors must be positive (was " + numberOfVisitors + ")");
        }
        return numberOfVisitors;
    }

    public int getNumberOfVisitors() {
        return numberOfVisitors;
    }

    @Override
    public double calculateCost() {
        double baseCost = super.calculateCost();
        if (numberOfVisitors >= 6 && numberOfVisitors <= 12) {
            return baseCost * 0.7;
        } else if (numberOfVisitors > 12) {
            return baseCost * 0.6;
        } else {
            return baseCost;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupTicket that = (GroupTicket) o;
        return numberOfVisitors == that.numberOfVisitors && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfVisitors);
    }

    @Override
    public String toString() {
        return "GroupTicket {" +
                "numberOfVisitors=" + numberOfVisitors +
                "} " + super.toString();
    }
}