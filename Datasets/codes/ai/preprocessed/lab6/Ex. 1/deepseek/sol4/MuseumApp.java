public class MuseumApp {
    public static void main(String[] args) {
        Pavilion[] pavilions = {
            new Pavilion("Ancient History", 10),
            new Pavilion("Medieval Art", 15),
            new Pavilion("Modern Science", 20),
            new Pavilion("Space Exploration", 25)
        };

        Ticket ticket = TicketFactory.createTicket(pavilions);
        System.out.println(ticket);

        GroupTicket groupTicket = TicketFactory.createGroupTicket(pavilions, 10);
        System.out.println(groupTicket);
    }
}