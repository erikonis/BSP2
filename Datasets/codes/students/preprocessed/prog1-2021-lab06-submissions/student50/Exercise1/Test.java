public class Test {
    public static void main(String[] args) {
        Pavilion[] pav1 = {new Pavilion("pav1",138),new Pavilion("pav2",30),new Pavilion("pav3",70),new Pavilion("pav4",50)};
        Pavilion[] pav2 = {new Pavilion("pav1",60),new Pavilion("pav2",50),new Pavilion("pav3",170),new Pavilion("pav4",50),new Pavilion("pav5",60),new Pavilion("pav6",120),new Pavilion("pav7",75)};
        Pavilion[] pav3 = {new Pavilion("pav1",100),new Pavilion("pav2",30),new Pavilion("pav3",70),new Pavilion("pav4",50)};
      
        Ticket t1 = new Ticket(pav1);

        GroupTicket g1= new GroupTicket(pav1, 34);
        GroupTicket g2= new GroupTicket(pav2, 7);
        GroupTicket g3= new GroupTicket(pav3, 18);
        
        System.out.println(t1.toString());
        System.out.println(g1.toString());
        System.out.println(g2.toString());
        System.out.println(g3.toString());



    }
    
}
