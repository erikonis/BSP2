public class Country {
    private String name;
    private int baseFee = 0;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseFee() {
        baseFee = 0;
        if (name.equals("FRANCE")) {
            baseFee = 30;
        } else if (name.equals("BELGIUM")) {
            baseFee = 50;
        } else if (name.equals("GERMANY")) {
            baseFee = 40;
        }
        return baseFee;
    }

}
