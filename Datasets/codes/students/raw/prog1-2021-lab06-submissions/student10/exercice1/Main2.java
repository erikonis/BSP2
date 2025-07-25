public class Main2 {
    public static void main(String[] args) {
        int visitorNumber=3;

        Pavilion p1=new Pavilion("p1", 14.2);
        Pavilion p2=new Pavilion("p2", 12.5);
        Pavilion p3=new Pavilion("p3", 9.8);
        Pavilion p4=new Pavilion("p4", 15.0);

        Pavilion[] grouppavilion = {p1, p2, p3, p4};

        Ticket ticket=new Ticket(grouppavilion);

        new GroupTicket(grouppavilion, visitorNumber);

        System.out.println(ticket);
        System.out.println("   ");
        System.out.println(grouppavilion);
    }
}
