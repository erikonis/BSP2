package lu.uni.programming1.lab6.Exercise1;

public class Test {     
public static void main(String[] args) {
     Pavilion pav1 = new Pavilion(60, "art"); //initialise pavilion elements in main
     Pavilion pav2 = new Pavilion(70, "dino");
     Pavilion pav3 = new Pavilion(80, "clothes");
     Pavilion pav4 = new Pavilion(90, "toys");
     Pavilion[] pav = { pav1, pav2, pav3, pav4 };   //add elements to pav array 

    
        Ticket ticket = new Ticket(pav);    //initialise objects
        GroupTicket gT = new GroupTicket(pav);  
       
        
        System.out.println(ticket); //print out ticket
        System.out.println("-----------------");
        System.out.println(gT);

    }

}
