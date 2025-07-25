package exercises.Exercise1;

public class MainClass {
    public static void main(String[] args) {
        
        Pavilion pav1 = new Pavilion("pav1", 12);
        Pavilion pav2 = new Pavilion("pav2", 45);
        Pavilion pav3 = new Pavilion("pav3", 78);
        Pavilion pav4 = new Pavilion("pav4", 23);

        Ticket t = new Ticket(10);
        GroupTicket gt = new GroupTicket(10, 8);
        t.add(pav1);
        t.add(pav2);
        t.add(pav3);
        t.add(pav4);
        System.out.print(t.toString());
        System.out.println(gt.calculateTotalPrice());
    }
}
