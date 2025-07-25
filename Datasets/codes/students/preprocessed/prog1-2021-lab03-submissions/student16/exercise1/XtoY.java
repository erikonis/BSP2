import java.util.Scanner;

public class XtoY {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
	System.out.print("Please enter x, y and d: ");

	int x = scanner.nextInt();

	int y = scanner.nextInt();

	int d = scanner.nextInt();

    for (int i=x; i<y+1; i+=d){
        System.out.print(i + " ");
    }
    
    scanner.close();
}
}
    
