public class RewardManager {
    public static void displayRewards(int amount) {
        for (Reward reward : Reward.values()) {
            if (amount >= reward.getAmount()) {
                System.out.println(reward.getDescription());
            }
        }
    }
}