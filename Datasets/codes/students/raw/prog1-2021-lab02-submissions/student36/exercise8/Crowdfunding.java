package lu.uni.programming1.lab2.exercise8;

import java.util.Scanner;

/**
 *  Class for Exercise 8
 */
public class Crowdfunding {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: put your code here
        System.out.println("Please enter your donation: ");
        int money = scanner.nextInt();
        int reward;
        reward = switch (money){
            case 10 ->1;
            case 20 -> 2;
            case 50 -> 3;
            case 100 -> 4;
            case 200 -> 5;
            case 500 -> 6;
            default -> 7;                       
        };

        if(reward == 1)
        {
            System.out.println("Your reward is: - Beer with TAs");
        }
        if(reward == 2)
        {
            System.out.println("Your reward is: - Beer with TAs");
            System.out.println(("                - Your name in ASCII art"));
        }
        if(reward == 3)
        {
            System.out.println("Your reward is: - Beer with TAs");
            System.out.println(("                - Your name in ASCII art"));
            System.out.println(("                - Public display of your donation on Moodle"));
        }
        if(reward == 4)
        {
            System.out.println("Your reward is: - Beer with TAs");
            System.out.println(("                - Your name in ASCII art"));
            System.out.println(("                - Public display of your donation on Moodle"));
            System.out.println(("                - Uni.lu USB Stick of 128GB"));
        }
        if(reward == 5)
        {
            System.out.println("Your reward is: - Beer with TAs");
            System.out.println(("                - Your name in ASCII art"));
            System.out.println(("                - Public display of your donation on Moodle"));
            System.out.println(("                - Uni.lu USB Stick of 128GB"));
            System.out.println(("                - Uni.lu Smartphone cover"));
            System.out.println(("                - Keychain 'I love Programming 1'"));
        }
        if(reward == 6)
        {
            System.out.println("Your reward is: - Beer with TAs");
            System.out.println(("                - Your name in ASCII art"));
            System.out.println(("                - Public display of your donation on Moodle"));
            System.out.println(("                - Uni.lu USB Stick of 128GB"));
            System.out.println(("                - Uni.lu Smartphone cover"));
            System.out.println(("                - Keychain 'I love Programming 1'"));
            System.out.println(("                - Autograph of your professors"));
            System.out.println(("                - Five free lunches at the 'Food house'"));
            // I made so many System.out.println 's because it makes it easier to read for use  
        }
        if(reward == 7)
        {
            System.out.println(money + "€ donations are not allowed!");
        }

        scanner.close();
    }
}

