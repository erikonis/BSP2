import java.util.Objects;

public class Order {

    private String itemName;
    private Double itemPrice;
    private Integer amount ;
    private double cost=0;

    public Order(String itemName, Double itemPrice, int amount) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.amount = amount;
    }

    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public Double getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getCost(){  
        cost = itemPrice*amount;
        return cost;
    }

    @Override
    public int hashCode() {
        return 7*Objects.hashCode(itemName)
            +11*Double.hashCode(itemPrice)
            +13*Objects.hashCode(amount);
    }    

    @Override
    public boolean equals(Object obj) {
        if (this.hashCode() == obj.hashCode()){
            return true;
        }
        else {
            return false;
        }
    }

}
