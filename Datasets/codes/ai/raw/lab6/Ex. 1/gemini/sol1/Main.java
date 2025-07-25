package ex5_basic;

public class Main {
    public static void main(String[] args) {
        Pavilion[] pavilions1 = {
                new Pavilion("Art Gallery", 10.0),
                new Pavilion("Science Exhibit", 8.0),
                new Pavilion("History Hall", 12.0),
                new Pavilion("Ancient Tools", 5.0)
        };

        Ticket ticket1 = new Ticket(pavilions1);
        System.out.println(ticket1);

        Pavilion[] pavilions2 = {
                new Pavilion("Art Gallery", 10.0),
                new Pavilion("Science Exhibit", 8.0)
        };

        GroupTicket groupTicket1 = new GroupTicket(pavilions2, 8);
        System.out.println(groupTicket1);

        GroupTicket groupTicket2 = new GroupTicket(pavilions1, 15);
        System.out.println(groupTicket2);

    }
}