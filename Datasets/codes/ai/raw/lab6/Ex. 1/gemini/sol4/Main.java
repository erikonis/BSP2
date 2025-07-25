package ex5_builder;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pavilion> pavilions1 = Arrays.asList(
                new Pavilion("Art Gallery", 10.0),
                new Pavilion("Science Exhibit", 8.0),
                new Pavilion("History Hall", 12.0),
                new Pavilion("Ancient Tools", 5.0)
        );

        Ticket ticket1 = new Ticket.TicketBuilder(pavilions1).build();
        System.out.println(ticket1);

        List<Pavilion> pavilions2 = Arrays.asList(
                new Pavilion("Art Gallery", 10.0),
                new Pavilion("Science Exhibit", 8.0)
        );

        GroupTicket groupTicket1 = new GroupTicket.GroupTicketBuilder(pavilions2, 8).build();
        System.out.println(groupTicket1);

        GroupTicket groupTicket2 = new GroupTicket.GroupTicketBuilder(pavilions1, 15).build();
        System.out.println(groupTicket2);
    }
}