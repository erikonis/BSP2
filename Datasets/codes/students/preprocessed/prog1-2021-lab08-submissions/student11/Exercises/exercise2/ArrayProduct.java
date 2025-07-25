import java.util.ArrayList;


public class ArrayProduct
{
    private ArrayList<Product> alProducts;
    private String orderName;

    public ArrayProduct(String pName)
    {
        alProducts = new ArrayList<>();
        orderName = pName;
    }

    public void delete(Product p)
    {
        for (int i = 0; i < alProducts.size(); i++) {
            if(p.equals(alProducts.get(i)))
            {
                alProducts.remove(p);
            }
        }
    }

    public void add(Product p)
    {
        boolean testIfDouble = false;
        for (int i = 0; i < alProducts.size(); i++)
        {
            if(alProducts.get(i).equals(p) && alProducts.get(i).hashCode() == p.hashCode())
            {
                testIfDouble = true;
            }
        }

        if(!testIfDouble)
        {
            alProducts.add(p);
        }
    }

    public double totalPrice()
    {
        double total =0;
        for (int i = 0; i < alProducts.size(); i++) {
            total += alProducts.get(i).calcTotalPrice();
        }
        return total;
    }

    public String printArray()
    {
        String text = "Order List for " + orderName + ". You ordered " + alProducts.size() + " diffrent products. Total cost is: " + totalPrice() + " EURO\n";
        for (int i = 0; i < alProducts.size(); i++)
        {
            text += i+1 + ". Order : " + alProducts.get(i).getObject() + "\n";
        }
        return text;
    }


}
