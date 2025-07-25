import java.util.*;

public class RewardManager {
    private final Map<Integer, List<String>> rewardTiers;

    public RewardManager() {
        rewardTiers = new HashMap<>();
        rewardTiers.put(10, List.of("Beer with TAs"));
        rewardTiers.put(20, List.of("Your name in ASCII art"));
        rewardTiers.put(50, List.of("Public display of your donation on Moodle"));
        rewardTiers.put(100, List.of("Uni.lu USB Stick of 128GB"));
        rewardTiers.put(200, List.of("Uni.lu Smartphone cover", "Keychain \"I love Programming 1\""));
        rewardTiers.put(500, List.of("Autograph of your professors", "Five free lunches at the \"Food house\""));
    }

    public boolean isValidAmount(int amount) {
        return rewardTiers.containsKey(amount);
    }

    public List<String> getRewardsFor(int amount) {
        List<Integer> allowed = List.of(10, 20, 50, 100, 200, 500);
        List<String> result = new ArrayList<>();
        for (int tier : allowed) {
            if (tier <= amount) {
                result.addAll(rewardTiers.getOrDefault(tier, Collections.emptyList()));
            }
        }
        return result;
    }
}
