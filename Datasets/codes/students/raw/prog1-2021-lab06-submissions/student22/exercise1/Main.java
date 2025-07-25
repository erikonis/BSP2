package lu.uni.programming.Lab6.exercise1;

public class Main {
    public static void main(String[] args){
        Pavillon pav1 = new Pavillon("pav1", 20);
        Pavillon pav2 = new Pavillon("pav2", 30);
        Pavillon pav3 = new Pavillon("pav3", 10);
        Pavillon pav4 = new Pavillon("pav4", 15);
        Pavillon pav5 = new Pavillon("pav5", 17.5);
        Pavillon pav6 = new Pavillon("pav6", 22.5);
        Pavillon pav7 = new Pavillon("pav7", 25);
        Pavillon pav8 = new Pavillon("pav8", 28.5);
        Pavillon pav9 = new Pavillon("pav9", 20);
        Ticket ticket = new Ticket();
        ticket.add(pav1);
        ticket.add(pav2);
        ticket.add(pav3);
        ticket.add(pav4);
        GroupTicket groupTicket = new GroupTicket(11);
        groupTicket.add(pav5);
        groupTicket.add(pav6);
        groupTicket.add(pav7);
        groupTicket.add(pav8);
        groupTicket.add(pav9);
        ticket.toString();
        groupTicket.toString();
    }

}
