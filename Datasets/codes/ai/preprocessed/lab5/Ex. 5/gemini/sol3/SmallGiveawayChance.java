public package giveaways;

public class SmallGiveawayChance implements GiveawayChance {
    @Override
    public double getChance(double price) {
        return 0.02;
    }
}