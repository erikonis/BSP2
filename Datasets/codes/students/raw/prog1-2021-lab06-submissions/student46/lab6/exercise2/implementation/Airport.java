package lab6.exercise2.implementation;

import java.util.ArrayList;

public class Airport {
    
    private String city;
    private String country;
    private String iataCode;

    private ArrayList<Flight> flights = new ArrayList<>();

    public Airport(String city, String country, String iataCode) 
    {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getIataCode() {
        return iataCode;
    }

    public void addFlight(Flight flight)
    {
        flights.add(flight);
    }

    public void addFlights(Flight[] flights)
    {
        for(Flight x : flights)
        {
            this.flights.add(x);
        }
    }

    public String toString()
    {
        String output="";
        int i=1;
        for(Flight x: flights)
        {
            output += "\n\n>Flight number "+i+" :\n"+x.toString();
            i++;
        }

        return output;
    }
}
