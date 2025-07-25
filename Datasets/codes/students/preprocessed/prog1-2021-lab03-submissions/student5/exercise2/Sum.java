import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("number:");
        int number = scanner.nextInt();

        int total = 0;
        
        System.out.println("  for loop:");
        for (int i = 0; i <= number ; i++){
            total = total + i;
            System.out.println(total);
        }

        int i=0;
        total = 0;
        System.out.println("  while loop:");
        while (i <= number){
            total = total + i;
            i++;
            System.out.println(total);
        }

        i = 0;
        total = 0;
        System.out.println("  do-while loop:");
        do{
            total = total + i;
            i++;
            System.out.println(total);
        }while (i <= number);


        scanner.close();
    }
}