public class Main {
    public static void main(String[] args) {
        Ticket t = new Ticket(5);
        System.out.println(t.toString(t.calculatePrice()));
        GroupTicket gt = new GroupTicket(5, 6);
        System.out.println("--------------------------------------");
        System.out.println(gt.toString());
    }
}
