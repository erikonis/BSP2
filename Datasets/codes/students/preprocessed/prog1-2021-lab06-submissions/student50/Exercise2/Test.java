public class Test {
    public static void main(String[] args) {
        
    Agency sara = new Agency("Sara");
    Agency ag2= new Agency("NotSara");

    Airport a1= new Airport("Luxembourg", "Luxembourg", "3413fDG");
    Airport a2= new Airport("New York", "USA", "1451safadgf");
    Airport a3= new Airport("Bucharest", "Romania", "12451alallaa");
    Airport a4= new Airport("Bruxelles", "Belgium", "74826AucuneIdee");

    Flight f1= new Flight("FR4715", a1, a2);
    Flight f2= new Flight("FR5147", a2, a1);
    Flight f3= new Flight("NS5547", a3, a4);

    sara.addFlight(f1);
    sara.addFlight(f2);
    ag2.addFlight(f3);

    sara.passToFlight(f1, new Passenger("Sara Vatavu", "DD124315", 42174));
    sara.passToFlight(f1, new Passenger("Elena Ceausescu", "DD122415", 44174));
    sara.passToFlight(f2, new Passenger("Megan Fox", "DD127615", 461774));
    sara.passToFlight(f2, new Passenger("Martin Larsson", "DD128415", 487174));
    ag2.passToFlight(f3, new Passenger("Rasmus Winther", "ZZ14124", 54252));
    ag2.passToFlight(f3, new Passenger("Morgana Demacia", "ZZ14624", 54272));

    sara.pilotToFlight(f1, new Pilot("Love Quinn","ZZ31415", "Ryanair"));
    sara.pilotToFlight(f2, new Pilot("Jhin Zhao", "XZ7411", "LuxAir"));
    sara.pilotToFlight(f3, new Pilot("Joe Goldberg", "HD1080", "Tarom"));

    System.out.println(sara);
    System.out.println(ag2);
    }
}
