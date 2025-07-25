package lu.uni.programming1.lab8.Exercise2;

public class order {
    private String myOrder;
    private double price;
    private int amount;

    public order(String myOrder, double price, int amount) {
        this.myOrder = myOrder;
        this.price = price;
        this.amount = amount;
    }

    public String toString() {
        String myString;
        myString = " " + myOrder + "\tPrice per unit = " + price + "\tTotal " + " = " + getTotalPrice() + "€";
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
        return myOrder == other.myOrder && price == other.price && amount == other.amount;
    }

    @Override
    public int hashCode() {
        return myOrder.hashCode() + Double.valueOf(getTotalPrice()).hashCode();
    }
}