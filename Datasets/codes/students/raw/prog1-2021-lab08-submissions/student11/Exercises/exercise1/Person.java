package Exercises.exercise1;

public class Person extends Item
{
    private String lastName;
    private String pronoun;
    private Countries c;
    private Adress adress;

    public Person(Adress pA, String pIName,String pP, String pLN, Countries pCountry)
    {
        super(pIName);
        adress = pA;
        pronoun = pP;
        lastName = pLN;
        c = pCountry;
    }

    public Countries getC()
    {
        return c;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getPronoun()
    {
        return pronoun;
    }

    public String getAdress()
    {
        return adress.getAddress();
    }

    public String getItemName()
    {
        return super.getItemName();
    }
}
