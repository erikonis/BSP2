public class Main {
    public static void main(String[] args) {
        try {
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

            // Create a Ticket
            Pavilion[] pavilions1 = {pav2, pav3, pav4, pav1, pav5};
            Ticket ticket1 = new Ticket(pavilions1);
            System.out.println("Ticket 1: " + ticket1);
            System.out.println("Ticket 1 Cost: $" + String.format("%.2f", ticket1.calculateCost()));


            // Create a GroupTicket
            Pavilion[] pavilions2 = {pav4, pav8, pav7, pav6, pav9};
            GroupTicket groupTicket1 = new GroupTicket(pavilions2, 10);
            System.out.println("\nGroup Ticket 1: " + groupTicket1);
            System.out.println("Group Ticket 1 Cost: $" + String.format("%.2f", groupTicket1.calculateCost()));

            GroupTicket groupTicket2 = new GroupTicket(pavilions2, 15);
            System.out.println("\nGroup Ticket 2: " + groupTicket2);
            System.out.println("Group Ticket 2 Cost: $" + String.format("%.2f", groupTicket2.calculateCost()));

            Ticket ticket2 = new Ticket(new Pavilion[]{pav1, pav2});
            System.out.println("\nTicket 2: " + ticket2);
            System.out.println("Ticket 2 Cost: $" + String.format("%.2f", ticket2.calculateCost()));

            //Demonstrate exception handling
            try {
                Ticket invalidTicket = new Ticket(null);
            } catch (IllegalArgumentException e) {
                System.out.println("\nCaught Exception: " + e.getMessage());
            }

            try {
                GroupTicket invalidGroupTicket = new GroupTicket(new Pavilion[]{pav1, null}, 10);
            } catch (IllegalArgumentException e) {
                System.out.println("\nCaught Exception: " + e.getMessage());
            }

             try {
                Pavilion invalidPavilion = new Pavilion("Invalid", -10);
            } catch (IllegalArgumentException e) {
                System.out.println("\nCaught Exception: " + e.getMessage());
            }

            try {
                 GroupTicket invalidGroupTicket2 = new GroupTicket(new Pavilion[]{pav1}, 0);
            } catch (IllegalArgumentException e) {
                System.out.println("\nCaught Exception: " + e.getMessage());
            }

            //Test equals and hashcode
            Ticket ticket3 = new Ticket(pavilions1);
            System.out.println("\nTicket 1 equals Ticket 3: " + ticket1.equals(ticket3));
            System.out.println("Ticket 1 hashcode: " + ticket1.hashCode());
            System.out.println("Ticket 3 hashcode: " + ticket3.hashCode());

            GroupTicket groupTicket3 = new GroupTicket(pavilions2, 10);
            System.out.println("\nGroupTicket 1 equals GroupTicket 3: " + groupTicket1.equals(groupTicket3));
            System.out.println("GroupTicket 1 hashcode: " + groupTicket1.hashCode());
            System.out.println("GroupTicket 3 hashcode: " + groupTicket3.hashCode());


        } catch (IllegalArgumentException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}