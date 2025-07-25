public enum Countries
{
    LUX(0, "Luxemburg"), FR(30 , "France"),
    BEL(50, "Belgium"), GER(40, "Germany");

    private int pay;
    private String name;

    Countries(int pay, String name)
    {
        this.pay = pay;
        this.name = name;
    }

    public int getPay()
    {
        return pay;
    }

    public String getName()
    {
        return name;
    }
}