package solution4;

import java.util.Objects;

public class Pavilion implements Comparable<Pavilion> {
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
    public int compareTo(Pavilion other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pavilion pavilion = (Pavilion) o;
        return Double.compare(pavilion.price, price) == 0 && Objects.equals(name, pavilion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return name + " (€" + price + ")";
    }
}
