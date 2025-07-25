package exercise2;

import java.util.ArrayList;
import java.util.List;

class Airport {
    private String city;
    private String country;
    private String iataCode;

    public Airport(String city, String country, String iataCode) {
        this.city = city;
        this.country = country;
        this.iataCode = iataCode;
    }

    public String getCity() { return city; }
    public String getCountry() { return country; }
    public String getIataCode() { return iataCode; }
}

class Flight {
    private String number;
    private Airport origin;
    private Airport destination;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public String getNumber() { return number; }
    public Airport getOrigin() { return origin; }
    public Airport getDestination() { return destination; }

    public void setNumber(String number) { this.number = number; }
    public void setOrigin(Airport origin) { this.origin = origin; }
    public void setDestination(Airport destination) { this.destination = destination; }
}

class Person {
    private String name;
    private String passportNumber;

    public Person(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }

    public String getName() { return name; }
    public String getPassportNumber() { return passportNumber; }
    public void setPassportNumber(String passportNumber) { this.passportNumber = passportNumber; }
}

class Passenger extends Person {
    private int loyaltyCardNumber;

    public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() { return loyaltyCardNumber; }
}

class Pilot extends Person {
    private String airline;

    public Pilot(String name, String passportNumber, String airline) {
        super(name, passportNumber);
        this.airline = airline;
    }

    public String getAirline() { return airline; }
    public void setAirline(String airline) { this.airline = airline; }
}

class FlightManagement {
    private List<Flight> flights = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();
    private List<Pilot> pilots = new ArrayList<>();

    public void addFlight(Flight flight) { flights.add(flight); }
    public void addPassenger(Passenger passenger) { passengers.add(passenger); }
    public void addPilot(Pilot pilot) { pilots.add(pilot); }
}

public class Main {
    public static void main(String[] args) {
        Airport lux = new Airport("Luxembourg City", "Luxembourg", "LUX");
        Airport paris = new Airport("Paris", "France", "CDG");
        Flight flight1 = new Flight("LX123", lux, paris);

        Passenger passenger = new Passenger("John Doe", "P12345", 5678);
        Pilot pilot = new Pilot("Captain Smith", "P67890", "Lux Airlines");

        FlightManagement management = new FlightManagement();
        management.addFlight(flight1);
        management.addPassenger(passenger);
        management.addPilot(pilot);

        System.out.println("Flight system initialized with sample data.");
    }
}
