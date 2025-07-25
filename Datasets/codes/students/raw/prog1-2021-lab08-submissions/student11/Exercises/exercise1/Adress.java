package Exercises.exercise1;

public class Adress
{
    private String adress;

    public Adress(String street, int streetNumber, int postalCode, String comunity)
    {
        adress = street + ". " + streetNumber + ", " + postalCode + ", " + comunity;
    }

    public String getAddress()
    {
        return adress;
    }
}
