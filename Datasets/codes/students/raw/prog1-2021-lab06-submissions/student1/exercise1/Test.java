package lu.uni.programming1.lab6.exercise1;

public class Test {
    public static void main(String[] args) {

        //nb Pavilions one person wants to visit
        Ticket t1 = new Ticket(5);
        System.out.println(t1);

        //nb of pavilions and how many people on the group
        GroupTicket gt1 = new GroupTicket(5,7);
        System.out.println("\n" + gt1);
        
        
    }
}
