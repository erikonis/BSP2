import java.util.Scanner;

public class Kellacci {
    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);
 System.out.print("n = ");
       long n = scanner.nextInt();
       long k1 = 1;
       long k2 = 1;
       System.out.println("the numbers of the sequence are : ");
       for (int i = 0 ; i <=n ; ++i){
          Long kn = (k1 -1) + (k2 *2);
          k2= k1;
          k1 = kn;
          System.out.println(kn);


       }

        


       
                
              
             



      
          
     
      
 

















 scanner.close();
    }

    
}
