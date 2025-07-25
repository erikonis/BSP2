public class MuseumTest {
    public static void main(String[] args) {
        // Create some pavilions
        Pavilion pav1 = new Pavilion("pav1", 100);
        Pavilion pav2 = new Pavilion("pav2", 80);
        Pavilion pav3 = new Pavilion("pav3", 90);
        Pavilion pav4 = new Pavilion("pav4", 70);
        Pavilion pav5 = new Pavilion("pav5", 60);
        Pavilion pav6 = new Pavilion("pav6", 50);
        Pavilion pav7 = new Pavilion("pav7", 40);
        Pavilion pav8 = new Pavilion("pav8", 30);
        Pavilion pav9 = new Pavilion("pav9", 20);

        // Create a regular ticket
        Ticket ticket = new Ticket(new Pavilion[]{pav2, pav3, pav4, pav1, pav5});
        System.out.println(ticket);
        System.out.println();

        // Create a group ticket
        GroupTicket groupTicket = new GroupTicket(
            new Pavilion[]{pav4, pav8, pav7, pav6, pav9},
            8
        );
        System.out.println(groupTicket);
    }
}