import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Available pledge amounts: 10, 20, 50, 100, 200, 500 euros");
        System.out.print("Enter your pledge amount: ");
        int amount = scanner.nextInt();
        
        System.out.println("\nFor your pledge of " + amount + " euros, you receive:");
        
        switch (amount) {
            case 500:
                System.out.println("- Autograph of your professors");
                System.out.println("- Five free lunches at the \"Food house\"");
                // Fall through to include lower tier rewards
            case 200:
                if (amount >= 200) {
                    System.out.println("- Uni.lu Smartphone cover");
                    System.out.println("- Keychain \"I love Programming 1\"");
                }
                // Fall through to include lower tier rewards
            case 100:
                if (amount >= 100) {
                    System.out.println("- Uni.lu USB Stick of 128GB");
                }
                // Fall through to include lower tier rewards
            case 50:
                if (amount >= 50) {
                    System.out.println("- Public display of your donation on Moodle");
                }
                // Fall through to include lower tier rewards
            case 20:
                if (amount >= 20) {
                    System.out.println("- Your name in ASCII art");
                }
                // Fall through to include lower tier rewards
            case 10:
                if (amount >= 10) {
                    System.out.println("- Beer with TAs");
                }
                break;
            default:
                System.out.println("Error: " + amount + " euro donations are not allowed!");
                System.out.println("Please choose one of the available amounts.");
        }
    }
}