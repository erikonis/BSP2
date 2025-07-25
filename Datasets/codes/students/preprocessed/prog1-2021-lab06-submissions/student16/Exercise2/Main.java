public class Main {

    public static void main(String[] args) {

        Airport a1= new Airport("Lux", "Lux", "iataCode");
        Airport a2= new Airport("Brüssle", "Belgium", "iataCode2");

        Pilot p1= new Pilot("Kevin", "Reti32onr", "Lufthansa");
        Pilot c1= new Pilot("Joao", "j32iorh98gw", "Lufthansa");

        Flight f = new Flight("H5R2", a1, a2, 100, p1, c1);

        Passenger pa1= new Passenger("Filomeno", "eigre0rehge0", 5542615);
        Passenger pa2= new Passenger("Tim", "egrrger", 5155);
        Passenger pa3= new Passenger("Mark", "eg4ihg40", 98562);

        f.add(pa1);
        f.add(pa2);
        f.add(pa3);

        System.out.println(f);
    }
    
}
