package exercise5;

import java.util.List;

public class GroupTicket extends Ticket {
    private int n;

    private GroupTicket(Builder builder) {
        super(builder);
        this.n = builder.n;
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

    public static class Builder extends Ticket.Builder {
        private int n;

        public Builder setNumberOfVisitors(int n) {
            this.n = n;
            return this;
        }

        @Override
        public GroupTicket build() {
            return new GroupTicket(this);
        }
    }
}