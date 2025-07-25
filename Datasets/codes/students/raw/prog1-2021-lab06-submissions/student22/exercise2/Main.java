package lu.uni.programming.Lab6.exercise2;

public class Main {
    public static void main(String[] args){
        Airport luxembourg = new Airport("Luxembourg", "Luxembourg", "LUX");
        Airport tokyo = new Airport("Tokyo", "Japan", "HND");
        Airport washington = new Airport("Washington DC", "USA", "DCA");

        Passenger pass1 = new Passenger("Thomas Cornette", "623454234534", 476407079);
        Passenger pass2 = new Passenger("Michael Jackson", "345738597223", 343479787);
        Pilot pilot = new Pilot("Michel Michel", "570890898230", "Ryan air");

        Flight flight1 = new Flight("4141414", tokyo, luxembourg);
        Flight flight2 = new Flight("5424314", washington, tokyo);
        Flight flight3 = new Flight("4146222", tokyo, washington);

        flight1.flightParticipation(pass1);
        flight1.flightParticipation(pilot);
        flight2.flightParticipation(pass2);
        flight3.flightParticipation(pilot);
    }
}
