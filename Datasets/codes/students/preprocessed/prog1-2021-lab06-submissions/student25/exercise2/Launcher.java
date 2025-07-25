public class Launcher {
    public static void main(String[] args) {
        Airport lux = new Airport("Luxembourg", "Luxembourg", "LUX");

        Airport sfo = new Airport("San Francisco", "United States of America", "SFO");

        Airport lhr = new Airport("London", "United Kingdom", "LHR");

        Airport bru = new Airport("Brussels", "Belgium", "BRU");

        Passenger pass1 = new Passenger("Mathieu", "B83048392HI", 112595447);

        Passenger pass2 = new Passenger("Yves", "K398338F", 415345);

        Passenger pass3 = new Passenger("Thierry", "L2938359RD", 1536541);

        Passenger pass4 = new Passenger("Stefan", "DL39054930493F", 123465);

        Passenger pass5 = new Passenger("Georges", "D030493045390F", 489453);

        Passenger pass6 = new Passenger("Albert", "P02840833D", 7919492);

        Passenger pass7 = new Passenger("Vlad", "W039402830T", 02214560);

        Pilot pilot1 = new Pilot("Tom", "E39483038402R", "Luxair");

        Pilot pilot2 = new Pilot("Jerry", "E930T4835403T", "Ryanair");

        Passenger passengers[] = {pass1, pass2, pass3, pass4, pass5, pass6, pass7};

        Flight flight1 = new Flight("B334", lux, sfo);

        Flight flight2 = new Flight("P0039", lhr, bru, passengers, pilot1);

        Flight flight3 = new Flight("P0039", bru, lux, passengers, pilot2);

        System.out.println(flight1);

        System.out.println(flight2);

        System.out.println(flight3);
    }
}
