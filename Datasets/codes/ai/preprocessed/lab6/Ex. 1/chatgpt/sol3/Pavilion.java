import java.util.Objects;

public class Pavilion {
    private String name;
    private double price;

    public Pavilion(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pavilion pavilion = (Pavilion) obj;
        return Double.compare(pavilion.price, price) == 0 && name.equals(pavilion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}