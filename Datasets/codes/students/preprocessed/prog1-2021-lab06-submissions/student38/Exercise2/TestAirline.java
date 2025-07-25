public class TestAirline {


    public static boolean Fly (boolean b) {b=!b; return b;}

    public static void main(String[] args) {
        
        boolean arewethereyet=false;
        String company = "JavaLine";
        String pilotName = "Java M.";
        String pilotPassportNo = "123456789";

        String passenger1name = "Celebrity 1";
        String passenger1passportno ="4321";
        String passenger2name = "Celebrity 2";
        String passenger2passportno = "5432";

        Person one = new Person(pilotName, pilotPassportNo);
        Person two = new Person(passenger1name, passenger1passportno);
        Person three = new Person(passenger2name, passenger2passportno);

        Pilot javalinepilot = new Pilot(one.name, one.passportNumber, company);
        
        Passenger pas1 = new Passenger(two.name, two.passportNumber, 7654);
        Passenger pas2 = new Passenger(three.name, three.passportNumber, 87665);

        Passenger[] testpassengers = {pas1, pas2};

        String oa = "Los Angeles"; String oaC = "USA"; String oaIAC= "849327289";
        String da = "Melbourne"; String daC = "Australia"; String daIAC ="5443453";


        Airport oaObj = new Airport(oa, oaC, oaIAC);
        Airport daObj = new Airport(da, daC, daIAC);

        Flight ourTestFlight = new Flight("9739457839", oaObj, daObj);

        BoardThePlane boardItAlready = new BoardThePlane(ourTestFlight.number, ourTestFlight.origin, ourTestFlight.destination, javalinepilot, testpassengers);


        System.out.println(" Ladies and gentlemen, this is your captain " + boardItAlready.pilot.name + " speaking, we are ready for take off! ");

        System.out.println( pas2.name+             ": Are we there yet?  \n " + pas1 +"   We've arrived! I can't believe it's " +(  Boolean.toString(   Fly(arewethereyet))   )       +"! "+ ourTestFlight.destination + " is amazing! "       );


    }
    
}
