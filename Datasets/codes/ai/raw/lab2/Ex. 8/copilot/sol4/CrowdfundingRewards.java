import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the rewards for each tier
        String[] rewards = {
            "Beer with TAs",
            "Your name in ASCII art",
            "Public display of your donation on Moodle",
            "Uni.lu USB Stick of 128GB",
            "Uni.lu Smartphone cover",
            "Keychain \"I love Programming 1\"",
            "Autograph of your professors",
            "Five free lunches at the \"Food house\""
        };

        // Read the donation amount
        System.out.print("Enter the amount you want to pledge: ");
        int amount = scanner.nextInt();

        // Determine the number of rewards based on the donation amount
        int rewardCount = 0;
        switch (amount) {
            case 500:
                rewardCount = 8;
                break;
            case 200:
                rewardCount = 6;
                break;
            case 100:
                rewardCount = 4;
                break;
            case 50:
                rewardCount = 3;
                break;
            case 20:
                rewardCount = 2;
                break;
            case 10:
                rewardCount = 1;
                break;
            default:
                System.out.println("Error: " + amount + " e donations are not allowed!");
                scanner.close();
                return;
        }

        // Display the rewards
        for (int i = 0; i < rewardCount; i++) {
            System.out.println(rewards[i]);
        }

        scanner.close();
    }
}
