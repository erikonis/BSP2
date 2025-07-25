import java.util.List;
import java.util.ArrayList;

public class RewardTier {
    private final int amount;
    private final List<Reward> rewards;

    public RewardTier(int amount) {
        this.amount = amount;
        this.rewards = new ArrayList<>();
    }

    public int getAmount() {
        return amount;
    }

    public void addReward(Reward reward) {
        this.rewards.add(reward);
    }

    public List<Reward> getRewards() {
        return rewards;
    }
}