public class Pavilion {

    private String name;
    private double price;

    public Pavilion(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public Pavilion() {
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}