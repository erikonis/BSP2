package lu.uni.programming1.lab8.exercise4;

public class Launcher {
    public static void main(String[] args) {
        Supermarket Auchan = new Supermarket();
        LoyaltyCard dadsCard = new LoyaltyCard();

        Auchan.buy(35, dadsCard);
        Auchan.buy(6.18, dadsCard);
        Auchan.buy(20.95, dadsCard);

        Auchan.redeem(15.50, dadsCard);
        Auchan.redeem(19.25, dadsCard);

        LoyaltyCard momsCard = new LoyaltyCard(dadsCard.getUUID(), 0);
        Auchan.redeem(1, momsCard);
    }
}
