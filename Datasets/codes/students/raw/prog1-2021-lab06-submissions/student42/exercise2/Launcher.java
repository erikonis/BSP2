package lu.uni.programming1.lab6.exercise2;

public class Launcher {

    public static void main(String[] args) {

        // I think the class Pilot should manage the participations of the passengers and the pilots.

        // The problem is that this solution makes the code bloated, creating more classes is probably a good idea.
        // Therefore the code is not optimized as well as it should be.
        // Too much code probably means that errors are tougher to track down.

        // The good thing is that all the things we need to manage the flight are contained in one class.
        // The design is straighforward and relatively simple to implement.
    

        Passenger[] pass = new Passenger[8];
        pass[0] = new Passenger("Arnold", "1", 1001);
        pass[1] = new Passenger("Sylvester", "2", 1002);
        pass[2] = new Passenger("Bruce", "3", 1003);
        pass[3] = new Passenger("JC", "4", 1004);

        Pilot[] pilot = new Pilot[3];
        pilot[0] = new Pilot("Leslie", "10", "JapanAir");
        pilot[1] = new Pilot("Mitch", "20", "JapanAir");
        pilot[2] = new Pilot("Jerry", "30", "JapanAir");

        Airport ori = new Airport("Tokyo", "Japan", "HND");
        Airport dest = new Airport("Shanghai", "China", "PVG");

        Flight test = new Flight("1", ori, dest, pass, pilot);
        System.out.println("\n" + test + "\n");

        // Test of setters :

        Airport osa = new Airport("Osaka", "Japan", "ITM");
        Airport chi = new Airport("Beijing", "China", "PEK");

        test.setNumber("2");

        test.setOrigin(osa);

        test.setDestination(chi);

        pass[0].setPassportNumber("11");

        System.out.println("\n" + test + "\n");

        // Test of getters not used : 

        System.out.println(ori.getCity());
        System.out.println(ori.getCountry());
        System.out.println(ori.getIataCode() + "\n");

        System.out.println(test.getOrigin());
        System.out.println(test.getDestination() + "\n");

        System.out.println(pass[0].getLoyaltyCardNumber());

        System.out.println(pass[0].getPassportNumber());

        System.out.println(pilot[0].getAirline() + "\n");

    }
    
}
