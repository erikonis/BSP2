public class Main {
    public static void main(String[] args) {
        Pavilion p1 = new Pavilion("Ancient Art", 10);
        Pavilion p2 = new Pavilion("Modern Art", 12);
        Pavilion p3 = new Pavilion("Science", 8);
        Pavilion p4 = new Pavilion("History", 15);

        Pavilion[] pavilions = {p1, p2, p3, p4};

        Ticket singleTicket = new Ticket(pavilions);
        System.out.println(singleTicket);

        GroupTicket groupTicket = new GroupTicket(pavilions, 10);
        System.out.println(groupTicket);
    }
}