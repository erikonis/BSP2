public class MediumGiveawayChance implements GiveawayChance {
    @Override
    public double getChance(double price) {
        return 0.05;
    }
}