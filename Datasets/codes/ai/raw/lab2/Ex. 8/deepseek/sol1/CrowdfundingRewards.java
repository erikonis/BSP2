import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read pledge amount
        System.out.print("Enter pledge amount (10, 20, 50, 100, 200, or 500): ");
        int amount = scanner.nextInt();

        // Display rewards based on pledge amount
        switch (amount) {
            case 500:
                System.out.println("- Autograph of your professors");
                System.out.println("- Five free lunches at the \"Food house\"");
                // Fall through to include lower rewards
            case 200:
                System.out.println("- Uni.lu Smartphone cover");
                System.out.println("- Keychain \"I love Programming 1\"");
                // Fall through to include lower rewards
            case 100:
                System.out.println("- Uni.lu USB Stick of 128GB");
                // Fall through to include lower rewards
            case 50:
                System.out.println("- Public display of your donation on Moodle");
                // Fall through to include lower rewards
            case 20:
                System.out.println("- Your name in ASCII art");
                // Fall through to include lower rewards
            case 10:
                System.out.println("- Beer with TAs");
                break;
            default:
                System.out.println("Invalid pledge amount. Please enter 10, 20, 50, 100, 200, or 500.");
        }
    }
}