import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CrowdfundingRewardsMap {
    public static void main(String[] args) {
        Map<Integer, String> rewards = new HashMap<>();
        rewards.put(10, "Beer with TAs");
        rewards.put(20, "Your name in ASCII art");
        rewards.put(50, "Public display of your donation on Moodle");
        rewards.put(100, "Uni.lu USB Stick of 128GB");
        rewards.put(200, "Uni.lu Smartphone cover\nKeychain \"I love Programming 1\"");
        rewards.put(500, "Autograph of your professors");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter donation amount: ");
        int amount = scanner.nextInt();
        scanner.close();

        System.out.println("Your rewards:");
        for (int key : rewards.keySet()) {
            if (amount >= key) System.out.println(rewards.get(key));
        }
    }
}