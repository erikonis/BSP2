public class Launcher {

    public static void main(String[] args) {

        Pavillion pav1 = new Pavillion("pav1", 26.0);
        Pavillion pav2 = new Pavillion("pav2", 29.0);
        Pavillion pav3 = new Pavillion("pav3", 21.0);
        Pavillion pav4 = new Pavillion("pav4", 19.5);
        Pavillion pav5 = new Pavillion("pav5", 15.0);
        Pavillion pav6 = new Pavillion("pav6", 29.5);
        Pavillion pav7 = new Pavillion("pav7", 25.0);
        Pavillion pav8 = new Pavillion("pav8", 24.0);
        Pavillion pav9 = new Pavillion("pav9", 6.5);

        Pavillion pavillons1[] = {pav1, pav2, pav3, pav4};

        Pavillion pavillons2[] = {pav5, pav6, pav7, pav8, pav9};

        Pavillion pavillons3[] = {pav1, pav4, pav6};

        GroupTicket ticketGroup1 = new GroupTicket(pavillons1,7);

        GroupTicket ticketGroup2 = new GroupTicket(pavillons2, 14);

        Ticket ticket = new Ticket(pavillons3);

        System.out.println(ticketGroup1);
        System.out.println(ticketGroup2);
        System.out.println(ticket);

        System.out.println(ticket.totalPrice());

        System.out.println(ticketGroup1.totalPrice());

        System.out.println(pav2.getName());

        System.out.println(pav6.getPrice());

    }

}
