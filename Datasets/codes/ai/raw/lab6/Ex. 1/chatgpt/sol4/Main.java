package solution4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Pavilion> pavilions = new HashSet<>();
        pavilions.add(new Pavilion("History", 10.0));
        pavilions.add(new Pavilion("Science", 15.0));
        pavilions.add(new Pavilion("Art", 12.0));
        pavilions.add(new Pavilion("Technology", 20.0));

        Ticket ticket = new Ticket(pavilions);
        System.out.println(ticket);
    }
}
