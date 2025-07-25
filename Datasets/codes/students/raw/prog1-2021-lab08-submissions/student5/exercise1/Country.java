package lu.uni.programming1.lab8.exercise1;

public enum Country {

    Belgium(50), Germany(40), France(30), Luxembourg(0);

    public int costOfShipping;

    private Country(int costOfShipping) {
        this.costOfShipping = costOfShipping;
    }

    public int getcostOfShipping() {
        return costOfShipping;
    }


    public int getCostOfShipping() {
        return 0;
    }
}
