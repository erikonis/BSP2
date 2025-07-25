package lu.uni.programming1.lab8.exercise2;

public class Order {

    private String product;
    private double price;
    private int amount;

    public Order(String product, double price, int amount) {
        this.product = product;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + amount;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        return result;
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

        Order other = (Order) obj;
        return product == other.product && price == other.price && amount == other.amount;
    }
    

}