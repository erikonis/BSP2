package exercise1;

public enum Country{
    LUXEMBOURG(0), FRANCE(30), BELGIUM(50), GERMANY(40);
    private int price;

    private Country(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }   
}