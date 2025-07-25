import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read pledge amount
        System.out.print("Enter pledge amount (10, 20, 50, 100, 200, or 500): ");
        int amount = scanner.nextInt();

        // Display rewards
        RewardManager.displayRewards(amount);
    }
}