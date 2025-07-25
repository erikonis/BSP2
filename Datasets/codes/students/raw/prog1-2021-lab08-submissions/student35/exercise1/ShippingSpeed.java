package exercise1;

public enum ShippingSpeed {
    EXPRESS ("Express [100 EURO]", "1 day", 100),
    PRIORITY ("Priority [50 EURO]", "3 days", 50),
    CLASSIC ("Classic [10 EURO]", "5 days", 10),
    NORUSH ("No Rush [0 EURO]", "8 days", 0);

    private final String name;
    private final String handlingtime;
    private final int cost;
    ShippingSpeed(String name, String handlingtime, int cost){
        this.cost = cost;
        this.name = name;
        this.handlingtime = handlingtime;
    }
    //another enum holding this time the various speeds of shipping, handling times and costs. including their getters
    public String getName() {
        return name;
    }
    public String getHandlingtime() {
        return handlingtime;
    }
    public int getCost() {
        return cost;
    }

}
