import java.util.List;

public class GroupTicket extends Ticket {
    private int numberOfVisitors;

    private GroupTicket(GroupTicketBuilder builder) {
        super(builder.ticketBuilder);
        this.numberOfVisitors = builder.numberOfVisitors;
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
    public String toString() {
        // ... (same toString() as before)
    }

    public static class GroupTicketBuilder {
        private Ticket.TicketBuilder ticketBuilder;
        private int numberOfVisitors;

        public GroupTicketBuilder(List<Pavilion> pavilions, int numberOfVisitors) {
            this.ticketBuilder = new Ticket.TicketBuilder(pavilions);
            this.numberOfVisitors = numberOfVisitors;
        }

        public GroupTicket build() {
            return new GroupTicket(this);
        }
    }
}