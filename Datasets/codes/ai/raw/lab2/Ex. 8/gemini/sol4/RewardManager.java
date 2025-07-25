import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class RewardManager {
    private final Map<Integer, RewardTier> rewardTiers;

    public RewardManager() {
        this.rewardTiers = new HashMap<>();
        initializeRewardTiers();
    }

    private void initializeRewardTiers() {
        RewardTier tier10 = new RewardTier(10);
        tier10.addReward(new Reward("Beer with TAs"));
        rewardTiers.put(10, tier10);

        RewardTier tier20 = new RewardTier(20);
        tier20.addReward(new Reward("Your name in ASCII art"));
        rewardTiers.put(20, tier20);

        RewardTier tier50 = new RewardTier(50);
        tier50.addReward(new Reward("Public display of your donation on Moodle"));
        rewardTiers.put(50, tier50);

        RewardTier tier100 = new RewardTier(100);
        tier100.addReward(new Reward("Uni.lu USB Stick of 128GB"));
        rewardTiers.put(100, tier100);

        RewardTier tier200 = new RewardTier(200);
        tier200.addReward(new Reward("Uni.lu Smartphone cover"));
        tier200.addReward(new Reward("Keychain \"I love Programming 1\""));
        rewardTiers.put(200, tier200);

        RewardTier tier500 = new RewardTier(500);
        tier500.addReward(new Reward("Autograph of your professors"));
        tier500.addReward(new Reward("Five free lunches at the \"Food house\""));
        rewardTiers.put(500, tier500);
    }

    public Set<Integer> getAllowedAmounts() {
        return rewardTiers.keySet();
    }

    public void displayRewards(int pledgeAmount) {
        Set<Integer> sortedAmounts = new TreeSet<>(rewardTiers.keySet());
        for (int tierAmount : sortedAmounts) {
            if (pledgeAmount >= tierAmount) {
                RewardTier tier = rewardTiers.get(tierAmount);
                for (Reward reward : tier.getRewards()) {
                    System.out.println(reward);
                }
            }
        }
    }
}