package lu.uni.programming1.lab6.exercise1;

public class Launcher {
    
    public static void main(String[] args) {
        Pavilion pavilion1 = new Pavilion(" pav1 ",5.5);
        Pavilion pavilion2 = new Pavilion(" pav2 ",15);
        Pavilion pavilion3 = new Pavilion(" pav3 ",18.5);
        Pavilion pavilion4 = new Pavilion(" pav4 ",22);
        Pavilion pavilion5 = new Pavilion(" pav5 ",12.5);
        Pavilion[] allPavilion = {pavilion1,pavilion2,pavilion3,pavilion4,pavilion5};
        Ticket ticket = new Ticket(allPavilion);
        GroupTicket gTicket = new GroupTicket(allPavilion);
        System.out.println("===================================================");
        System.out.println(ticket);
        System.out.println("===================================================");
        System.out.println(gTicket);
    }
}
