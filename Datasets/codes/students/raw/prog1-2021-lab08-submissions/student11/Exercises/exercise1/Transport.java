package Exercises.exercise1;

public enum Transport
{
    EXPRESS(1, 100, "Express"), PRIORITY(3, 50, "Priority"),
    CLASSIC(5, 10, "Classic"), NORUSH(8, 0, "NoRush");

    private int days;
    private int shippingPrice;
    private String name;

    Transport(int days, int shippingPrice, String name)
    {
        this.days = days;
        this.shippingPrice = shippingPrice;
        this.name = name;
    }

    public int getDays()
    {
        return days;
    }
    
    public int getShippingPrice()
    {
        return shippingPrice;
    }

    public String getName()
    {
        return name;
    }
}