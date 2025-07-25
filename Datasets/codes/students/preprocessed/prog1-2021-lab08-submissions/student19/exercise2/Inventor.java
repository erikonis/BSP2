import java.util.Objects;

public class Inventor {
    String name;
    double unitprice;
    int amount;


    public String getName() {
        return name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public Inventor(String name, double unitprice, int amount) {
        this.name = name;
        this.unitprice = unitprice;
        this.amount = amount;
    }

    public double getAmountprice() {
        return unitprice * amount;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, unitprice, amount);
    }
    public int getAmount() {
        return amount;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Inventor other = (Inventor) obj;
        if(this.hashCode() == other.hashCode()){
            return true;
        }
        else{
            return false;
        }
    }
}
