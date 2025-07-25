public class order {
    private String orders;
    private double price;
    private int amount;

    public order(String orders, double price, int amount) {
        this.orders = orders;
        this.price = price;
        this.amount = amount;
    }

    public String toString() {
        String myString;
        myString = price + " " + orders + " = " + getTotalPrice() + "€";
        return myString;
    }

    public double getTotalPrice() {
        return price * amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        order other = (order) obj;
        return orders == other.orders && price == other.price && amount == other.amount;
    }

    @Override
    public int hashCode() {
        return orders.hashCode() + Double.valueOf(getTotalPrice()).hashCode();
    }
}