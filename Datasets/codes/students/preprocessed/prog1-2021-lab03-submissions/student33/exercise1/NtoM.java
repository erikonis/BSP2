import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print(" M = ");

      int M = scanner.nextInt();

      System.out.print(" N = "); 

      for ( int N = scanner.nextInt() ; N<= M ; N+=1) {
         System.out.println(N);

     scanner.close();
    } 
    }

    
    }
    

