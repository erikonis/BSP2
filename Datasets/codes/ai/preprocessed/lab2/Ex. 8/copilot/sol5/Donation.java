import java.util.ArrayList;
import java.util.List;

public class Donation {
    private int amount;
    private List<Reward> rewards;

    public Donation(int amount) {
        this.amount = amount;
        this.rewards = new ArrayList<>();
        initializeRewards();
    }

    private void initializeRewards() {
        switch (amount) {
            case 500:
                rewards.add(new Reward("Autograph of your professors"));
                rewards.add(new Reward("Five free lunches at the \"Food house\""));
            case 200:
                rewards.add(new Reward("Uni.lu Smartphone cover"));
                rewards.add(new Reward("Keychain \"I love Programming 1\""));
            case 100:
                rewards.add(new Reward("Uni.lu USB Stick of 128GB"));
            case 50:
                rewards.add(new Reward("Public display of your donation on Moodle"));
            case 20:
                rewards.add(new Reward("Your name in ASCII art"));
            case 10:
                rewards.add(new Reward("Beer with TAs"));
                break;
            default:
                throw new IllegalArgumentException("Error: " + amount + " e donations are not allowed!");
        }
    }

    public List<Reward> getRewards() {
        return rewards;
    }
}