package exercise2;

public class testing {
    public static void main(String[] args) {
        Airport a1 = new Airport("city1", "country1", "iataCode1");
        Airport a2 = new Airport("city2", "country2", "iataCode2");
        Airport a3 = new Airport("city3", "country3", "iataCode3");
        Airport a4 = new Airport("city4", "country4", "iataCode4");
        Flight fl1= new Flight("1", a1, a2);
        Flight fl2= new Flight("2", a2, a3);
        Flight fl3= new Flight("3", a3, a4);
        Flight fl4= new Flight("4", a2, a1);
        //a series of test variables and the printers for the flights to show off the program works
        Pilot pil1= new Pilot("name1", "num1", "airline1", fl1,fl2,fl3);
        Passenger pas1= new Passenger("name2", "passportNumber2", "loyaltyCardNumber2", fl1,fl2,fl4);
        pil1.getpilFlights();
        pas1.getpasFlight();

    }
}
