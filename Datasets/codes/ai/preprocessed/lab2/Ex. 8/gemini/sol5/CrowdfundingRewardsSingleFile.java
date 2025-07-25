import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CrowdfundingRewardsSingleFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, String[]> rewardTiers = new HashMap<>();
        rewardTiers.put(10, new String[]{"Beer with TAs"});
        rewardTiers.put(20, new String[]{"Your name in ASCII art"});
        rewardTiers.put(50, new String[]{"Public display of your donation on Moodle"});
        rewardTiers.put(100, new String[]{"Uni.lu USB Stick of 128GB"});
        rewardTiers.put(200, new String[]{"Uni.lu Smartphone cover", "Keychain \"I love Programming 1\""});
        rewardTiers.put(500, new String[]{"Autograph of your professors", "Five free lunches at the \"Food house\""});

        Set<Integer> allowedAmounts = rewardTiers.keySet();
        Set<Integer> sortedAmounts = new TreeSet<>(allowedAmounts);

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
            for (int tier : sortedAmounts) {
                if (pledgeAmount >= tier) {
                    String[] rewards = rewardTiers.get(tier);
                    for (String reward : rewards) {
                        System.out.println("- " + reward);
                    }
                }
            }
        } else {
            System.out.println("Error: " + pledgeAmount + "€ donations are not allowed!");
        }

        scanner.close();
    }
}