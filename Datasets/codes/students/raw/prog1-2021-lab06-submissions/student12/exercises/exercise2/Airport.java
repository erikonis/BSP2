package exercises.exercise2;

public class Airport
{
    private String city;
    private String country;
    private String iataCode;

    public Airport(String pCity, String pCountry, String pIata)
    {
        city = pCity;
        country = pCountry;
        iataCode = pIata;
    }

    public String getCity()
    {
        return city;
    }

    public String getCountry()
    {
        return country;
    }

    public String getIataCode()
    {
        return iataCode;
    }
}
