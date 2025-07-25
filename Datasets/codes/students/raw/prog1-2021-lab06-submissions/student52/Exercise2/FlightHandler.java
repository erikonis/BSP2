package lu.uni.programming1.lab6.Exercise2;

import java.util.Date;

public class FlightHandler {
    Date date = new Date();

    FlightHandler() {
    };

    Flight flight;
    String name = "";
    Person j;
    Person k;
    Pilot pilot;

    FlightHandler(Flight flight, Person j, Person k, String name) {// flight has to stay in constructor
        this.name = name;
        this.flight = flight;
        this.j = j;
        this.k = k;
    }

    @Override
    public String toString() {
        return "-- LAX Airport --\nCase Number ****\nCase Handler: " + name + "\nDate: " + date + "\n" + flight + "\n"
                + j + "\n" + k;
    }

}
