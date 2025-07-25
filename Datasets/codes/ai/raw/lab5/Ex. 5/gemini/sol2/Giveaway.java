package giveaways;

public class Giveaway {
    private String type;

    private Giveaway(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static Giveaway createGiveaway(double price) {
        if (price < 20) {
            return new Giveaway("Small");
        } else if (price >= 20 && price <= 100) {
            return new Giveaway("Medium");
        } else {
            return new Giveaway("Large");
        }
    }
}