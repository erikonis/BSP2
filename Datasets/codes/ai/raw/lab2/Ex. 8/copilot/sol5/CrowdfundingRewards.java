import java.util.Scanner;

public class CrowdfundingRewards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the donation amount
        System.out.print("Enter the amount you want to pledge: ");
        int amount = scanner.nextInt();

        try {
            // Create a Donation object
            Donation donation = new Donation(amount);

            // Display the rewards
            for (Reward reward : donation.getRewards()) {
                System.out.println(reward.getDescription());
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
