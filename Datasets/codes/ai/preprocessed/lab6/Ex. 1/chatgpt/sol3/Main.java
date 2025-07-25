import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Pavilion> pavilions = new HashSet<>();
        pavilions.add(new Pavilion("History Pavilion", 10));
        pavilions.add(new Pavilion("Art Pavilion", 12));
        pavilions.add(new Pavilion("Science Pavilion", 8));
        pavilions.add(new Pavilion("Nature Pavilion", 7));
        pavilions.add(new Pavilion("Art Pavilion", 12)); // Duplicate (will be ignored)

        Ticket singleTicket = new Ticket(pavilions);
        System.out.println(singleTicket);

        GroupTicket groupTicket = new GroupTicket(pavilions, 15);
        System.out.println(groupTicket);
    }
}