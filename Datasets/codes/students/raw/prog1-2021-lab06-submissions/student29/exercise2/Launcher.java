package lu.uni.programming1.lab6.exercise2;

public class Launcher {
    public static void main(String[] args) {

        //2° The classes flight and airport can manage passaengers or pilots in a set of fights. I chose to use the class airport
        //The advantage is that I can manage multiple flights that are going away from that airport but not those that are coming in
        //Another disadvantage of my solution is that when outputting, you have to type who the pilot is and who the passenger is

        //creating instances of airport
        Airport Luxembourg = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport Frankfurt = new Airport("Frankfurt", "Germany", "FRA");
        Airport Amsterdam = new Airport("Amsterdam", "Netherlands", "AMS");

        //Pilots
        Pilot Bob = new Pilot("Bob", "3262542183", "Luxair");
        Pilot Alexandra = new Pilot("Alexandra", "16818", "Lufthansa");

        //Passengers
        Passenger Dan = new Passenger("Dan", "415646886", 651656611);
        Passenger Tina = new Passenger("Tina", "525948864", 454654465);

        //creating instances of flight
        Flight LuNe = Luxembourg.flyTo(Amsterdam, Dan, Alexandra);
        Flight LuDe = Luxembourg.flyTo(Frankfurt, Tina, Bob);
        Flight NeDe = Amsterdam.flyTo(Frankfurt, Dan, Alexandra);

        System.out.println(LuNe.toString(Dan, Alexandra) + "\n");
        System.out.println(LuDe.toString(Tina, Bob) + "\n");
        System.out.println(NeDe.toString(Dan, Alexandra) + "\n");
    }
}
