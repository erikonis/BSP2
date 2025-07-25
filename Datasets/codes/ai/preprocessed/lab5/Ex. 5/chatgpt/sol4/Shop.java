public class Shop {
    private GiveawayManager giveawayManager;

    public Shop(int localNumberOfGiveaways) {
        this.giveawayManager = new GiveawayManager(localNumberOfGiveaways);
    }

    public void buy(Item item) {
        System.out.println("Price of purchased item: " + item.getPrice() + "€");

        if (giveawayManager.awardGiveaway(item)) {
            System.out.println("Congratulations, you won a giveaway!");
        } else {
            System.out.println("No giveaway this time.");
        }
    }

    public int getLocalGiveawaysLeft() {
        return giveawayManager.localNumberOfGiveaways;
    }
}
 {

}