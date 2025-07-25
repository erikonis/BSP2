import java.util.Scanner;

public class NtoM {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter N value: ");
        int N = scanner.nextInt();
        System.out.print("Please enter M value: ");
        int M = scanner.nextInt();
        scanner.close();

        for (int num=N ; num<=M ; ++num) {
            System.out.println(num);
            }   
    }
    
}
