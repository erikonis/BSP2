public class Main {
    
    public static void main(String[] args) {
        
        Pavilion p1= new Pavilion("pav1", 23);
        Pavilion p2= new Pavilion("pav2", 13);
        Pavilion p3= new Pavilion("pav3", 22);
        Pavilion p4= new Pavilion("pav4", 22);
        

        Pavilion[] list= new Pavilion[4];

        list[0]= p1;
        list[1]= p2;
        list[2]= p3;
        list[3]= p4;

        /*Ticket t1 = new Ticket(list);

        System.out.println(t1);*/

        GroupTicket t1 = new GroupTicket(list, 6);

        System.out.println(t1);
    }
}
