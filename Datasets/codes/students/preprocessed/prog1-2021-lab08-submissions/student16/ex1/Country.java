public enum Country {
    // enum
    LUX("Lux", 0),
    GER("Ger", 40),
    BEL("Belgium", 30),
    FRA("France", 50);

    Country(String name, int pay) {
        Name = name;
        Pay = pay;
    }

    private int Pay;
    private String Name;

    public int getPay() {
        return Pay;
    }

    public String getName() {
        return Name;
    }

}
