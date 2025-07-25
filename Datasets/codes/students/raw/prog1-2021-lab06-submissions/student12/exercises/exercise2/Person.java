package exercises.exercise2;

public class Person
{
    private String name;
    private String passportNumber;

    public Person(String pName, String pPP)
    {
        name = pName;
        passportNumber = pPP;
    }

    public String getName()
    {
        return name;
    }

    public String getPassportNumber()
    {
        return passportNumber;
    }

    public void setNumber(String pPP)
    {
        passportNumber = pPP;
    }
}
