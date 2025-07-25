public class Main {
    public static void main(String[] args) {
        // Create some pavilions
        Pavilion pav1 = new Pavilion("pav1", 100.0);
        Pavilion pav2 = new Pavilion("pav2", 80.0);
        Pavilion pav3 = new Pavilion("pav3", 70.0);
        Pavilion pav4 = new Pavilion("pav4", 120.0);
        Pavilion pav5 = new Pavilion("pav5", 90.0);
        Pavilion pav6 = new Pavilion("pav6", 110.0);
        Pavilion pav7 = new Pavilion("pav7", 95.0);
        Pavilion pav8 = new Pavilion("pav8", 85.0);
        Pavilion pav9 = new Pavilion("pav9", 105.0);

        System.out.println("— Welcome to Luxembourg History Museum —");
        // Create a Ticket
        Pavilion[] pavilions1 = {pav2, pav3, pav4, pav1, pav5};
        Ticket ticket1 = new Ticket(pavilions1);
        System.out.println(ticket1);

        System.out.println("— Welcome to Luxembourg History Museum —");
        // Create a GroupTicket
        Pavilion[] pavilions2 = {pav4, pav8, pav7, pav6, pav9};
        GroupTicket groupTicket1 = new GroupTicket(pavilions2, 10);
        System.out.println(groupTicket1);

        GroupTicket groupTicket2 = new GroupTicket(pavilions2, 15);
        System.out.println(groupTicket2);

        Ticket ticket2 = new Ticket(new Pavilion[]{pav1, pav2});
        System.out.println(ticket2);
    }
}