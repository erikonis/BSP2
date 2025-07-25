import java.util.Scanner;

public class DivThreeMoreDigits {public static void main(String[] args) {

    long digit;
    long sum = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a long number : ");
	long number = scanner.nextLong();
    long num = number;

    while(number > 0){   
        digit=number%10;    
        sum = sum + digit;  
        number=number/10;    
    }
    if(sum%3==0){
        System.out.println("The number " + num + " is divisible by 3.");
    }else{
        System.out.println("The number " + num + " is not divisible by 3.");
    }

	scanner.close();
	
}
    
}
