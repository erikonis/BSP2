
public class Launcher {

    public static void main(String[] args) {
        
        Pavilion museum[] = new Pavilion[6];

        museum[0] = new Pavilion("pav1", 10);
        museum[1] = new Pavilion("pav2", 20);
        museum[2] = new Pavilion("pav3", 30);
        museum[3] = new Pavilion("pav4", 40);
        museum[4] = new Pavilion("pav5", 40);
    
        Ticket test = new Ticket(museum);
        System.out.println("\n" + test);

        int groupnumb = 8;

        GroupTicket test2 = new GroupTicket(museum, groupnumb);
        System.out.println("\n" + test2);
        

    }

    


}

    
    

