package lu.uni.programming1.lab6.exercise2;

public class Main {
    public static void main(String[] args) {
        
        Airport origin = new Airport("Frankfurt", "Germany", "AP-01234A");
        Airport destination = new Airport("Milano", "Italy", "AP-51234C");

        Passenger[] passengers = new Passenger[3];
        Passenger JD = passengers[0] = new Passenger("John Doe", "12345", 543);
        Passenger GS = passengers[1] = new Passenger("Gilles Silvestri", "75849", 129);
        Passenger MH = passengers[2] = new Passenger("Mark Hamill", "85718", 421);

        Pilot LS = new Pilot("Linus Sebastian", "74895", "Lufthansa");
        Pilot JL = new Pilot("Jake Lafr", "76759", "Lufthansa");

        Flight FL1234 = new Flight("FL1234", origin, destination);

        FL1234.setPilot(LS);
        FL1234.setCopilot(JL);
        FL1234.setPassengers(passengers);
        System.out.println(FL1234.toString());
    }
}
