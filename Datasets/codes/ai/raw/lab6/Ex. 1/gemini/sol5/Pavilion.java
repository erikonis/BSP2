import java.util.Objects;

public class Pavilion {
    private final String name;
    private final double price;

    public Pavilion(String name, double price) {
        this.name = Objects.requireNonNull(name, "Pavilion name cannot be null");
        if (price < 0) {
            throw new IllegalArgumentException("Pavilion price cannot be negative (was " + price + ")");
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pavilion other = (Pavilion) o;
        return Double.compare(other.price, price) == 0 && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Pavilion{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
