package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

        System.out.println("Amount to pledge: ");
        int iamount = console.nextInt();

	String oresult = "N";
// Reward Array

        String rewards[] = { "Beer with TAs", "Your name in ASCII art", "Public display of your donation on Moodle",
"Uni.lu USB Stick of 128GB",
"Uni.lu Smartphone cover & Keychain 'I love Programming 1' ",
"Autograph of your professors & Five free lunches at the 'Food house' ",
"Error "};
int switchvar = 0;

	switch (iamount)
        {
        case 10:
	oresult = "Beer with TAs";
	switchvar = 1;
	break;
        case 20:
	switchvar = 2;
	break; 
        case 50:
	switchvar = 3;
	break;
	case 100:
	switchvar = 4;
	break;
	case 200:
	switchvar = 5;
	break;
	case 500:
	switchvar = 6;
	break;
	default:
	switchvar = 0 ;
	System.out.println("Error in Pledge Denomination");
	break;
 	} 
if (switchvar != 0)
{
       int i;
  
        for (i = 0 ; i < switchvar ; i++) {

	System.out.println("Reward: " + rewards[i]);
  }
}
	}
}
