public class TicketFactory {
    public static Ticket createTicket(Pavilion[] pavilions) {
        return new Ticket(pavilions);
    }

    public static GroupTicket createGroupTicket(Pavilion[] pavilions, int n) {
        return new GroupTicket(pavilions, n);
    }
}