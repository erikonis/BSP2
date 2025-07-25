public class Main {public static void main(String[] args) {
    Airport Airport1 = new Airport("Sandweiler","Luxembourg","LUX");
    Airport Airport2 = new Airport("Istanbul","Turkey","IST");

    Flight flight = new Flight("12345",Airport1,Airport2);

    Passenger Passenger1 = new Passenger("John","1111",flight,10);
    Passenger Passenger2 = new Passenger("Lisa","2222",flight,20);
    Passenger Passenger3 = new Passenger("Tom","3333",flight,30);
    Passenger Passenger4 = new Passenger("Simon","4444",flight,40);

    Pilot Pilot1 = new Pilot("Murat","5555",flight,"Turkish Airlines");
    Pilot Pilot2 = new Pilot("Eren","6666",flight,"Turkish Airlines");

    System.out.println(flight.toString());
    System.out.println(Pilot1.toString());
    System.out.println(Pilot2.toString());
    System.out.println(Passenger1.toString());
    System.out.println(Passenger2.toString());
    System.out.println(Passenger3.toString());
    System.out.println(Passenger4.toString());

}
    
}
