import model.*;

import java.util.ArrayList;
import java.util.List;

public class RewardService {
    public List<Reward> getRewardsForPledge(Pledge pledge) {
        List<Reward> allRewards = new ArrayList<>();
        int amount = pledge.getAmount();

        for (RewardTier tier : RewardTier.values()) {
            if (amount >= tier.getAmount()) {
                allRewards.addAll(tier.getRewards());
            }
        }

        return allRewards;
    }
}