package lu.uni.programming1.lab8.exercise1;

public enum country {
    LUXEMBOURG(0), FRANCE(30), BELGIUM(50), GERMANY(40);

    private int price;

    public int getPrice() {
        return price;
    }

    private country(int price){
        this.price = price;
    }

}
