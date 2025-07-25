package Exercises.exercise2;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String pName, double pPrice, int pQuantity)
    {
        name = pName;
        price = pPrice;
        quantity = pQuantity;
    }

    public String getObject()
    {
        return quantity + " " + name + " x " + price + " EURO = " + calcTotalPrice() + " EURO";
    }

    public double calcTotalPrice()
    {
        return price*quantity;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(price);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + quantity;
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
        Product other = (Product) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (quantity != other.quantity)
            return false;
        return true;
    }
    /* written during the correction
    public boolean equals(Obj o)
    {
        if(o == this)
        {
            return true;
        }

        if(!(o instanceof Order))
        {
            return false
        }

        Order it = (Order) o;
        return it.getName().equals(this.getName()) && it.getPrice() == this.getPrice() && it.getAmount() == this.getAmount();
    }
    */
    
}
