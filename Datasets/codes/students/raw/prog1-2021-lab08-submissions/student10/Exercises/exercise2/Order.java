package Exercises.exercise2;

public class Order {
    private String name;
    private double unitprice;
    private int amount;
    public Order(String name, double unitprice, int amount) {
        this.name = name;
        this.unitprice = unitprice;
        this.amount = amount;
    }
    public double cost()
    {
        return unitprice*amount;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + amount;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(unitprice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Order other = (Order) obj;
        if (amount != other.amount)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(unitprice) != Double.doubleToLongBits(other.unitprice))
            return false;
        return true;
    }
    public double getUnitprice() {
        return unitprice;
    }
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
    
}
