public class MuseumApp {
    public static void main(String[] args) {
        Pavilion[] pavilions = {
            new Pavilion("Ancient History", 10),
            new Pavilion("Medieval Art", 15),
            new Pavilion("Modern Science", 20),
            new Pavilion("Space Exploration", 25)
        };

        Ticket ticket = new Ticket(pavilions);
        System.out.println(ticket);

        GroupTicket groupTicket = new GroupTicket(pavilions, 10);
        System.out.println(groupTicket);
    }
}