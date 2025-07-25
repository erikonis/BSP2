package lu.uni.programming1.lab6.Exercise1;

public class Test {

    public static void main(String[] args) {
        Pavilion povi1 = new Pavilion(" Dino ", 25);
        Pavilion povi2 = new Pavilion("Science ", 45);
        Pavilion povi3 = new Pavilion("Auto ", 65);
        Pavilion povi4 = new Pavilion("Covid", 10);
        Pavilion[] paviall = {povi1,povi2,povi3,povi4};
        Ticket ticket = new Ticket(paviall);
        GroupTicket GT = new GroupTicket(paviall);

        System.out.println(ticket);
        System.out.println(GT);



    }
    
}
