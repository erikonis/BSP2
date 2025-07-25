import java.util.ArrayList;
import java.util.List;

public enum RewardTier {
    TIER_10(10, new Reward("Beer with TAs")),
    TIER_20(20, new Reward("Your name in ASCII art")),
    TIER_50(50, new Reward("Public display of your donation on Moodle")),
    TIER_100(100, new Reward("Uni.lu USB Stick of 128GB")),
    TIER_200(200,
        new Reward("Uni.lu Smartphone cover"),
        new Reward("Keychain \"I love Programming 1\"")),
    TIER_500(500,
        new Reward("Autograph of your professors"),
        new Reward("Five free lunches at the \"Food house\""));

    private final int amount;
    private final List<Reward> rewards;

    RewardTier(int amount, Reward... rewards) {
        this.amount = amount;
        this.rewards = new ArrayList<>();
        for (Reward reward : rewards) {
            this.rewards.add(reward);
        }
    }

    public int getAmount() {
        return amount;
    }

    public List<Reward> getRewards() {
        return new ArrayList<>(rewards);
    }

    public static RewardTier fromAmount(int amount) {
        for (RewardTier tier : values()) {
            if (tier.amount == amount) {
                return tier;
            }
        }
        return null;
    }

    public static boolean isValidAmount(int amount) {
        return fromAmount(amount) != null;
    }
}