package exercise5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pavilion> pavilions = new ArrayList<>();
        pavilions.add(new Pavilion("History Pavilion", 10));
        pavilions.add(new Pavilion("Art Pavilion", 12));
        pavilions.add(new Pavilion("Science Pavilion", 8));
        pavilions.add(new Pavilion("Nature Pavilion", 7));

        Ticket singleTicket = new Ticket(pavilions);
        System.out.println(singleTicket);

        GroupTicket groupTicket = new GroupTicket(pavilions, 8);
        System.out.println(groupTicket);
    }
}
