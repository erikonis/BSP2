import java.util.Objects;

public class Order {
    private String productName;
    private Double unitPrice;
    private int amount;
    private Double totalCost;

    public Order(String name, Double price, int amount) {
        // This method requires a body instead of a semicolon = {}
        this.productName = name;
        this.unitPrice = price;
        this.amount = amount;
        this.totalCost = this.getAmount() * this.getUnitPrice();
        // QUESTION: quand est ce que dois mettre quelque chose dans
        // les parenthese et quand est ce que ca doit rester
        // vide
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public String setProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Order order = (Order) o;

        return Objects.equals(productName, order.getProductName()) && Objects.equals(unitPrice, order.getUnitPrice())
                && Objects.equals(amount, order.getAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, unitPrice, amount);
    }

    @Override
    public String toString() {
        return "Order : " + amount + " " + productName + " x " + unitPrice + " EURO = " + totalCost + " EURO";
    }
}
