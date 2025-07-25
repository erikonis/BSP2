package lu.uni.programming1.lab6.exercise2;

public class Launcher {

    public static void main(String[] args) {
    Airport London = new Airport("London", "UK", "002UK");
    Airport Lux = new Airport("Luxembourg", "LUX", "005LUX");
    Airport Cologne = new Airport("Cologne", "DEU", "008DEU");
    Airport Paris = new Airport("Paris", "FR", "001FR");

    Passenger A = new Passenger("John A.", "A212325", 00234);
    Passenger B = new Passenger("Maria B.", "A219125", 00202);
    Passenger C = new Passenger("Lucia C.", "A093285", 00503);
    Passenger D = new Passenger("Gina D.", "A090005", 00723);
    Passenger E = new Passenger("Sofia H.", "A023811", 10873);
    Passenger F = new Passenger("Andrea T.", "A029812", 11843);

    Pilot W = new Pilot("Luis K.", "A212325", "KLM");
    Pilot X = new Pilot("Pablo P.", "A219125", "AirFrance");
    Pilot Y = new Pilot("Sabine J.", "A093285", "Iberia");
    Pilot Z = new Pilot("Lucia M", "A090005", "Lufthansa");

   // Question 2: I used the class flight to set the flight. So I added an array of passengers and an array of pilots as attributes for the flight class. 
   //Those arrays should be created using a function call "addpassenger" and "addpilots", respectively that are defined in the Flight class.
   //The advantage is that we can create a flight with the list of passengers and pilots and if is needed eliminate passengers/pilots, clear the list, select the origin and destination airports, etc.
   //However, we can not assign several flights to a pilot, i.e. we can not see how many (and which) flights, a pilot made.

    Passenger[] listofPassengers = new Passenger[5];
    Pilot[] listofPilotts = new Pilot [2];


  
    Flight FL1 = new Flight("AE450", London, Lux, listofPassengers, listofPilotts);

    FL1.addpassenger(A);
    FL1.addpassenger(B);
    FL1.addpassenger(C);
    FL1.addpassenger(D);
    FL1.addpassenger(E);
    FL1.addpilots(W);
    FL1.addpilots(X);

    System.out.println(FL1);

        
        
    }
    
}
