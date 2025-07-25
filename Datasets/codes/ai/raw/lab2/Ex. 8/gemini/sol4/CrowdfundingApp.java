import java.util.Scanner;
import java.util.Set;

public class CrowdfundingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RewardManager rewardManager = new RewardManager();
        Set<Integer> allowedAmounts = rewardManager.getAllowedAmounts();

        System.out.print("Enter the amount you want to pledge (");
        boolean first = true;
        for (int amount : allowedAmounts) {
            if (!first) {
                System.out.print(", ");
            }
            System.out.print(amount);
            first = false;
        }
        System.out.print("): ");

        int pledgeAmount = scanner.nextInt();

        System.out.println("\nRewards for your pledge of " + pledgeAmount + "€:");

        if (allowedAmounts.contains(pledgeAmount)) {
            rewardManager.displayRewards(pledgeAmount);
        } else {
            System.out.println("Error: " + pledgeAmount + "€ donations are not allowed!");
        }

        scanner.close();
    }
}