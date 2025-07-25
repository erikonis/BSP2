package lu.uni.programming1.lab8.exercise1;

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
        return "Item: " +Colors.ANSI_PURPLE+ item + Colors.ANSI_RESET;
    }
    
    
}
