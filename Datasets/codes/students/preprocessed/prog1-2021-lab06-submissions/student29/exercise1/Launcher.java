public class Launcher {
    public static void main(String[] args) {

        //Creation of the needed instances of pavilion
        Pavilion pav1 = new Pavilion("pav1", 50);
        Pavilion pav2 = new Pavilion("pav2", 50);
        Pavilion pav3 = new Pavilion("pav3", 70);
        Pavilion pav4 = new Pavilion("pav4", 50);
        Pavilion pav5 = new Pavilion("pav5", 80);

        //Filling the arrays
        Pavilion[] pavilions1 = new Pavilion[5];
        pavilions1[0] = pav1;
        pavilions1[1] = pav5;
        pavilions1[2] = pav4;
        pavilions1[3] = pav3;
        pavilions1[4] = pav2;

        Pavilion[] pavilions2 = new Pavilion[3];
        pavilions2[0] = pav4;
        pavilions2[1] = pav3;
        pavilions2[2] = pav2;


        //Creation of some instances of ticket and groupticket
        Ticket ticket1 = new Ticket(pavilions1);
        GroupTicket grpTicket1 = new GroupTicket(pavilions1, 13);
        GroupTicket grpTicket2 = new GroupTicket(pavilions1, 12);
        GroupTicket grpTicket3 = new GroupTicket(pavilions1, 3);

        Ticket ticket2 = new Ticket(pavilions2);
        GroupTicket grpTicket4 = new GroupTicket(pavilions2, 13);

        //Outputting the tickets
        System.out.println(ticket1);
        System.out.println("----------------------");
        System.out.println(grpTicket1);
        System.out.println("----------------------");        
        System.out.println(grpTicket2);
        System.out.println("----------------------");        
        System.out.println(grpTicket3);
        System.out.println("----------------------");
        System.out.println(ticket2);
        System.out.println("----------------------");
        System.out.println(grpTicket4);       
    }
}
