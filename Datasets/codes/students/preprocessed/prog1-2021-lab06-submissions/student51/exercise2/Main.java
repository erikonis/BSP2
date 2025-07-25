public class Main {
    public static void main(String[] args) {
        Airport origin = new Airport("Luxembourg", "Luxembourg", "AKL1524863");
        Airport destination = new Airport("Paris", "France", "AKF124832564");
        Pilot p = new Pilot("Joe", "5698416519841", "TAP");
        Pilot c = new Pilot("Biden", "1298715654135", "LuxAir");
        Flight f = new Flight("A1875611", origin, destination, 10, p, c);
        Passenger pass = new Passenger("Rolf", "147841655481", 184816);
        f.addPassenger(pass);
        Passenger pass2 = new Passenger("Pit", "1478411723", 1158426);
        f.addPassenger(pass2);
        Passenger pass3 = new Passenger("Matt", "562874225", 20152031);
        f.addPassenger(pass3);
        System.out.println(f.toString());
    }
}
