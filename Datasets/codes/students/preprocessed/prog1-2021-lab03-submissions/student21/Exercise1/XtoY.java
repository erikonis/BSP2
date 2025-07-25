import java.util.Scanner;

public class XtoY {

    public static void main(String[] args) {

        int x, y, d , number;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Please enter your first value : ");
         x = scanner.nextInt();

         System.out.println("Please enter your second value : ");
         y = scanner.nextInt();

         System.out.println("Please enter the steps : ");

         d = scanner.nextInt();

         System.out.println();
  

        scanner.close();


        for  ( number = x  ; number <= y ; (number) += (d) ){;

            System.out.println(number); }



        
    }
    
}
