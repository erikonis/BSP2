public class Main {
    public static void main(String[] args) {
        Pavilion pavilion1 = new Pavilion("History Pavilion", 10.0);
        Pavilion pavilion2 = new Pavilion("Art Pavilion", 15.0);
        Pavilion pavilion3 = new Pavilion("Science Pavilion", 20.0);
        Pavilion pavilion4 = new Pavilion("Nature Pavilion", 25.0);

        Pavilion[] pavilions = {pavilion1, pavilion2, pavilion3, pavilion4};

        Ticket singleTicket = new Ticket(pavilions);
        System.out.println(singleTicket);

        GroupTicket groupTicket = new GroupTicket(pavilions, 8);
        System.out.println(groupTicket);

        GroupTicket largeGroupTicket = new GroupTicket(pavilions, 15);
        System.out.println(largeGroupTicket);
    }
}