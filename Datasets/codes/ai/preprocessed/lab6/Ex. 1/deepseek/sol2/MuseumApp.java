public class MuseumApp {
    public static void main(String[] args) {
        Pavilion[] pavilions = {
            new Pavilion("Ancient History", 10),
            new Pavilion("Medieval Art", 15),
            new Pavilion("Modern Science", 20),
            new Pavilion("Space Exploration", 25)
        };

        Ticket ticket = new Ticket.Builder()
            .setPavilions(pavilions)
            .build();
        System.out.println(ticket);

        GroupTicket groupTicket = new GroupTicket.Builder()
            .setPavilions(pavilions)
            .setN(10)
            .build();
        System.out.println(groupTicket);
    }
}