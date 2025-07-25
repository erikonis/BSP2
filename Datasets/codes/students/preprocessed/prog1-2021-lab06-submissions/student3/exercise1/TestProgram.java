public class TestProgram {
    public static void main(String[]args) {
        Pavilion pavilion1 = new Pavilion("Pav1", 10.9);
        Pavilion pavilion2 = new Pavilion("Pav2", 28.9);
        Pavilion[] pavilions = new Pavilion[1];
        Pavilion[] pavilions2 = new Pavilion[2];
        pavilions[0] = pavilion1;    
       Ticket ticket1 = new Ticket(pavilions);
       System.out.println(ticket1.toString());
       pavilions2[0] = pavilion1;
       pavilions2[1] = pavilion2;
       GroupTicket groupTicket = new GroupTicket(12, pavilions2);
       System.out.println(groupTicket.toString());


    }
}
