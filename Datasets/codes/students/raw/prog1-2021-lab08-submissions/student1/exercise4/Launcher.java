package lu.uni.programming1.lab8.exercise4;

public class Launcher {
    public static void main(String[] args) {
        Supermarket Delhaize = new Supermarket();
        LoyaltyCard grandMa = new LoyaltyCard("Grand Ma","48264920875446", 0);

        Delhaize.buy(120, grandMa);
        Delhaize.buy(8.90, grandMa);
        Delhaize.buy(60.65, grandMa);
        Delhaize.redeem(70.10, grandMa);
        Delhaize.redeem(45.40, grandMa);

        LoyaltyCard granDaughter = new LoyaltyCard("Grand Ma",grandMa.getCardID(), 0);
        Delhaize.redeem(1, granDaughter);
    }
}
