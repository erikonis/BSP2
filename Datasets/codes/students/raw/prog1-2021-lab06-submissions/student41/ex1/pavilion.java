package ex1;
/**
 * pavilion
 */
public class pavilion {

    private String name;
    private int price;

    public pavilion(String name, int price) {
        this.name =name;
        this.price = price;
    }
    public String name() {
        return name;  
    }
    public int getPrice() {
        return price;
    } 
}