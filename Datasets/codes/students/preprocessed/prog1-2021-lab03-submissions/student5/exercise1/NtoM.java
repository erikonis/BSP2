import java.util.Scanner;

public class NtoM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		//starting value
        System.out.println("start:");
        int start = scanner.nextInt();

		//ending value
        System.out.println("end:");
        int end = scanner.nextInt();

		//print everything from starting value to ending value
		System.out.println("counter:");
        for (int i = start; i <= end; i++){
            System.out.println(i);
        }   
        
        scanner.close();
    }
    
    
}
