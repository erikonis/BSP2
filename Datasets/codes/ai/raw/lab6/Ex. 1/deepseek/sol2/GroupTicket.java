package museum;

public class GroupTicket extends Ticket {
    private int n;

    private GroupTicket(Builder builder) {
        super(builder);
        this.n = builder.n;
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

    public static class Builder extends Ticket.Builder {
        private int n;

        public Builder setN(int n) {
            this.n = n;
            return this;
        }

        @Override
        public GroupTicket build() {
            return new GroupTicket(this);
        }
    }
}