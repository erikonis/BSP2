public class Main {
    public static void main(String[] args) {
        // Creating several airports
        Airport dub = new Airport("Dublin", "Ireland", "DUB");
        Airport muc = new Airport("Munich", "Germany", "MUC");
        Airport lux = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport vce = new Airport("Venice", "Italy", "VCE");

        // Creating several flights and add passengers and pilots
        Flight flight1 = new Flight("LG6541", lux, vce);
        flight1.addPassenger("Daniel Soares", "XN0010390");
        flight1.addPassenger("Sam Sung", "AW456QR54");
        flight1.addPilot("Aiken Fly", "LP2345G57", "Luxair");
        Flight flight2 = new Flight("LG6541", dub, muc);
        flight1.addPassenger("Maya Hee", "I35AZR574");
        flight1.addPilot("Airwrecka McBride", "AQ5463457", "Luxair");

        // Displaying the flights
        System.out.println(flight1.toString());
        System.out.println(flight2.toString());

    }
}
