package lu.uni.programming1.lab8.Exercise1;

public class Item {
    private String item;

    public Item(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Item: " + item;
    }
    
    
}
