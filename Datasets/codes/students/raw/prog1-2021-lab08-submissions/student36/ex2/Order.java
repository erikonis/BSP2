package ex2;



public class Order {
    private String product;
    private Double unitprice;
    private int amount;

    public Order(String product, Double unitprice, int amount){
        this.product = product;
        this.unitprice = unitprice;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public int getAmount() {
        return amount;
    }
    public static void name() {
        
    }

}
