public enum DeliveryType {
    EXPRESS (100, "Handling in 1 day"),
    PRIORITY (50, "Handling in 3 days"),
    CLASSIC (10, "Handling in 5 days"),
    NORUSH (0, "Handling in 8 days");

    private int cost;
    private String duration;

    private DeliveryType(int cost, String duration) {
        this.cost = cost;
        this.duration = duration;
    }

    public int getCost() {
        return cost;
    }

    public String getDuration() {
        return duration;
    }
}
