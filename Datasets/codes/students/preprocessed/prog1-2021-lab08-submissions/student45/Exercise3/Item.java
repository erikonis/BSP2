public class Item {
    private double price;
    private String name, color;
    private int size;

    public Item(double price, String name, String color, int size) {
        this.price = price;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public int hashCode() {
       //return 1; //18.73s
       //return size; 12.52s
        //return size+(int)price; //8.92s
      //  return size+(int)price+name.length()+color.length();// 15.87s
      //return size+(int)price+name.length(); //8.23s
      return size+(int)price+color.length(); //8.05s
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Item other = (Item) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
            return false;
        if (size != other.size)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Item [color=" + color + ", name=" + name + ", price=" + price + ", size=" + size + "]\n";
    }

    

    
    
}
