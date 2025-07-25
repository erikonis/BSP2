public enum Transport {
    // enum
    Express("Express", 1, 100),
    Norush("Norush", 8, 0),
    Priority("Priority", 3, 50),
    Classic("Classic", 5, 10);

    Transport(String name, int days, int price) {
        Name = name;
        this.price = price;
        this.days = days;
    }

    private String Name;
    private int price;
    private int days;

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    public int getDays() {
        return days;
    }

}
