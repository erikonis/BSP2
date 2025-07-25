public class Testprogram {
    public static void main(String[] args) {

        Pavilion[] Pavarray=new Pavilion[5];
        Pavarray[0]=new  Pavilion("pav1", 75);
        Pavarray[1]=new  Pavilion("pav2", 80);
        Pavarray[2]=new  Pavilion("pav3", 75);
        Pavarray[3]=new  Pavilion("pav4", 95);
        Pavarray[4]=new  Pavilion("pav5", 75);

        Ticket ticket=new Ticket(Pavarray);
        System.out.println(ticket.toString());
        Pavarray[0]=new  Pavilion("pav6", 50);
        Pavarray[1]=new  Pavilion("pav7", 80);
        Pavarray[2]=new  Pavilion("pav8", 50);
        Pavarray[3]=new  Pavilion("pav9", 55);
        Pavarray[4]=new  Pavilion("pav10", 75);

        GroupTicket groupticket=new GroupTicket(Pavarray);
        System.out.println(groupticket.toString());
     
    }
}
