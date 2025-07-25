package giveaways;

public class LargeGiveawayChance implements GiveawayChance {
    @Override
    public double getChance(double price) {
        return 0.10;
    }
}