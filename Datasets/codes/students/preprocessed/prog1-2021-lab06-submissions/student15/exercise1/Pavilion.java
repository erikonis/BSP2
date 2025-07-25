public class Pavilion {
    private String name;
    private double price;

    public Pavilion(String name, double price) {
        this.setName(name);
        this.setPrice(price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
