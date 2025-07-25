package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;



/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// TODO: put your code here
    String reward1 ,reward2, reward3, reward4, reward5, reward6;
	reward1 = "beer with TAs ,";
	 reward2 = "your name in ASCII ,";
	 reward3 = "public display of your donation on moodle, ";
	 reward4 = "uni.lu USB Stick of 128GB ,";
	 reward5 = "uni.lu smart phone cover and keychain ' I love programming 1' ";
	 reward6 = "Autograph of your professers and Five free lunches at the 'food house'";
	 System.out.println("enter your donation amount ");
    int amount = scanner.nextInt();
	
	String reward = switch (amount) {
    case 10 -> reward1  ;
    case 20 -> reward1 + reward2;
    case 50 -> reward1 + reward2 + reward3;
    case 100 -> reward1 + reward2 + reward3 + reward4;
    case 200 -> reward1 + reward2 + reward3 + reward4 + reward5;
    case 500 ->  reward1 + reward2 + reward3 + reward4 + reward5 + reward6;

     
			default-> {  
				yield "error";
					
			}	
		 };
		
		 System.out.println("your rewards are : " + reward);
	   
		scanner.close();
	}
}