package ex1;
public class Main {
    public static void main(String[] args) {
        //System.out.println("Please enter a number: ");

        Pavilion pavillion1= new Pavilion("pav1", 7.0);
        Pavilion pavillion2= new Pavilion("pav2", 14.0);
        Pavilion pavillion3= new Pavilion("pav3", 21.0);
        Pavilion pavillion4= new Pavilion("pav4", 28.0);
        Pavilion pavillion5= new Pavilion("pav5", 35.0);
        Pavilion pavillion6= new Pavilion("pav6", 42.0);
        Pavilion[] pavilion= {pavillion1,pavillion2,pavillion3,pavillion4,pavillion5,pavillion6};
        
        Ticket ticket1= new Ticket(pavilion);

        Groupticket groupticket1= new Groupticket(4, pavilion);
        
        //Output
        
        System.out.println("\n");
        System.out.println(ticket1.toString());
        System.out.println("\n");
        System.out.println("___**Group Ticket**___");
        System.out.println(groupticket1.toString());
        System.out.println("\n");
        

    }
}
