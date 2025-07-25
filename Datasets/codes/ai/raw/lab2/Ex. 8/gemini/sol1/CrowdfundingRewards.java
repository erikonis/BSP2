import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(Stringargs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter pledge amount (10, 20, 50, 100, 200, or 500 EUR): ");
        int amount = scanner.nextInt();

        switch (amount) {
            case 10:
                System.out.println("Rewards:");
                System.out.println("- Beer with TAs");
                break;
            case 20:
                System.out.println("Rewards:");
                System.out.println("- Beer with TAs");
                System.out.println("- Your name in ASCII art");
                break;
            case 50:
                System.out.println("Rewards:");
                System.out.println("- Beer with TAs");
                System.out.println("- Your name in ASCII art");
                System.out.println("- Public display of your donation on Moodle");
                break;
            case 100:
                System.out.println("Rewards:");
                System.out.println("- Beer with TAs");
                System.out.println("- Your name in ASCII art");
                System.out.println("- Public display of your donation on Moodle");
                System.out.println("- Uni.lu USB Stick of 128GB");
                break;
            case 200:
                System.out.println("Rewards:");
                System.out.println("- Beer with TAs");
                System.out.println("- Your name in ASCII art");
                System.out.println("- Public display of your donation on Moodle");
                System.out.println("- Uni.lu USB Stick of 128GB");
                System.out.println("- Uni.lu Smartphone cover");
                System.out.println("- Keychain \"I love Programming 1\"");
                break;
            case 500:
                System.out.println("Rewards:");
                System.out.println("- Beer with TAs");
                System.out.println("- Your name in ASCII art");
                System.out.println("- Public display of your donation on Moodle");
                System.out.println("- Uni.lu USB Stick of 128GB");
                System.out.println("- Uni.lu Smartphone cover");
                System.out.println("- Keychain \"I love Programming 1\"");
                System.out.println("- Autograph of your professors");
                System.out.println("- Five free lunches at the \"Food house\"");
                break;
            default:
                System.out.println("Invalid pledge amount. Please choose from 10, 20, 50, 100, 200, or 500 EUR.");
        }
    }
}