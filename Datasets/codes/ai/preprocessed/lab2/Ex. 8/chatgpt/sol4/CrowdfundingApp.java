import java.util.Scanner;

public class CrowdfundingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RewardManager manager = new RewardManager();

        System.out.print("Enter your donation amount (10, 20, 50, 100, 200, 500): ");
        int amount = scanner.nextInt();

        if (manager.isValidAmount(amount)) {
            System.out.println("\nYour rewards:");
            for (String reward : manager.getRewardsFor(amount)) {
                System.out.println("- " + reward);
            }
        } else {
            System.out.println("❌ Invalid donation amount. Please choose from 10, 20, 50, 100, 200, or 500 euros.");
        }

        scanner.close();
    }
}