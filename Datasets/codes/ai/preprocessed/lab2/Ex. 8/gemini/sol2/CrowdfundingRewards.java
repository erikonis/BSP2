import java.util.Scanner;

public class CrowdfundingRewards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount you want to pledge (10, 20, 50, 100, 200, or 500): ");
        int pledgeAmount = scanner.nextInt();

        System.out.println("\nRewards for your pledge of " + pledgeAmount + "€:");

        switch (pledgeAmount) {
            case 500:
                System.out.println("- Autograph of your professors");
                System.out.println("- Five free lunches at the \"Food house\"");
                // Fall-through to include lower tier rewards
            case 200:
                System.out.println("- Uni.lu Smartphone cover");
                System.out.println("- Keychain \"I love Programming 1\"");
                // Fall-through to include lower tier rewards
            case 100:
                System.out.println("- Uni.lu USB Stick of 128GB");
                // Fall-through to include lower tier rewards
            case 50:
                System.out.println("- Public display of your donation on Moodle");
                // Fall-through to include lower tier rewards
            case 20:
                System.out.println("- Your name in ASCII art");
                // Fall-through to include lower tier rewards
            case 10:
                System.out.println("- Beer with TAs");
                break; // Exit the switch statement after processing the valid amount
            default:
                System.out.println("Error: " + pledgeAmount + "€ donations are not allowed!");
        }

        scanner.close();
    }
}