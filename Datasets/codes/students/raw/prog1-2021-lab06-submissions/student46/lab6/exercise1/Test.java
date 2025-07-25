package lab6.exercise1;



public class Test {
    public static void main(String[] args) {
        Ticket ticket1;
        GroupTicket groupTicket2;

        Pavilion[] pavilions = {new Pavilion("Place1",10),new Pavilion("Place2",15), new Pavilion("Place3",25)};

        ticket1 = new Ticket(pavilions);

        groupTicket2 = new GroupTicket(pavilions,10);
        
        System.out.println(ticket1.toString());
        System.out.println(groupTicket2.toString());
    }
}
