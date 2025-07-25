package exercise1;

public class Item {

    private int price;
    private String name;

    public Item(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }
}
