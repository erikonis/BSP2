public class museum {
    public static void main(String[] args) {
        int nbrPerson = 15;

        Pavilion pav1 = new Pavilion("pav1", 50);
        Pavilion pav2 = new Pavilion("pav2", 71.5);
        Pavilion pav3 = new Pavilion("pav3", 62);
        Pavilion pav4 = new Pavilion("pav4", 38.5);

        Pavilion[] pavArray = new Pavilion[4];
        pavArray[0] = pav1;
        pavArray[1] = pav2;
        pavArray[2] = pav3;
        pavArray[3] = pav4;

        Ticket ticket = new Ticket(pavArray);
        System.out.println(ticket.toString());
        
        System.out.println("\n----------------------------------------------------------------\n");

        GroupTicket groupTicket = new GroupTicket(nbrPerson, pavArray);
        System.out.println(groupTicket.toString());
    }
}
