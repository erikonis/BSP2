package lu.uni.programming1.lab6.exercise1;

public class Launcher {

    public static void main(String[] args) {
        Pavilion[] pavs = {new Pavilion("a", 1.0), new Pavilion("b", 1.0)};

        Ticket t = new Ticket(pavs);
        System.out.println(t.toString());

        System.out.println("---------");

        GroupTicket gt = new GroupTicket(pavs, 94654);
        System.out.println(gt.toString());
    }
    
}
