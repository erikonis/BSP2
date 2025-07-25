import java.util.Scanner;

public class CrowdfundingRewards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your donation amount (10, 20, 50, 100, 200, 500): ");
        int donation = scanner.nextInt();

        System.out.println("\nYour rewards:");
        switch (donation) {
            case 500:
                System.out.println("- Autograph of your professors");
                System.out.println("- Five free lunches at the \"Food house\"");
            case 200:
                System.out.println("- Uni.lu Smartphone cover");
                System.out.println("- Keychain \"I love Programming 1\"");
            case 100:
                System.out.println("- Uni.lu USB Stick of 128GB");
            case 50:
                System.out.println("- Public display of your donation on Moodle");
            case 20:
                System.out.println("- Your name in ASCII art");
            case 10:
                System.out.println("- Beer with TAs");
                break;
            default:
                System.out.println("❌ Invalid donation amount. Please choose from 10, 20, 50, 100, 200, or 500 euros.");
        }

        scanner.close();
    }
}
