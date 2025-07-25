package lu.uni.programming1.lab6.ex2;

public class Demo {

    public static void main(String[] args) {

        Airport laGuardia = new Airport("New York", "USA", "LGA");
        Airport seattle = new Airport("Seattle", "USA", "SEA");
        Flight awe1549 = new Flight("AWE1549", laGuardia, seattle);

        Passenger johnDoe = new Passenger("John Doe", "ABC321", 12345);
        Pilot sully = new Pilot("Chelsey Sullenberger", "XYZ654", "US Airways");

        Ticket ticket = new Ticket(90817263, awe1549, johnDoe);

        Logbook log = new Logbook(sully, 2);
        log.fly(awe1549);
        log.fly(awe1549);
        log.fly(awe1549);
        log.fly(awe1549);
        log.fly(awe1549);

        System.out.println(ticket);
        System.out.println();
        System.out.println(log);
    }
}