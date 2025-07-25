package exercise1;

import java.util.Scanner;

public class NtoM {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
	System.out.print("Please enter n: ");

	int n = scanner.nextInt();

	System.out.print("Please enter m: ");

	int m = scanner.nextInt();

    for (int i=n; i<m+1;++i){
        System.out.print(i + " ");
    }
    
    scanner.close();
}
    
}
