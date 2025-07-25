import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pavilion pavilion1 = new Pavilion("History Pavilion", 10.0);
        Pavilion pavilion2 = new Pavilion("Art Pavilion", 15.0);
        Pavilion pavilion3 = new Pavilion("Science Pavilion", 20.0);
        Pavilion pavilion4 = new Pavilion("Nature Pavilion", 25.0);

        List<Pavilion> pavilions = Arrays.asList(pavilion1, pavilion2, pavilion3, pavilion4);

        Ticket singleTicket = new Ticket.Builder()
                .setPavilions(pavilions)
                .build();
        System.out.println(singleTicket);

        GroupTicket groupTicket = new GroupTicket.Builder()
                .setPavilions(pavilions)
                .setNumberOfVisitors(8)
                .build();
        System.out.println(groupTicket);

        GroupTicket largeGroupTicket = new GroupTicket.Builder()
                .setPavilions(pavilions)
                .setNumberOfVisitors(15)
                .build();
        System.out.println(largeGroupTicket);
    }
}