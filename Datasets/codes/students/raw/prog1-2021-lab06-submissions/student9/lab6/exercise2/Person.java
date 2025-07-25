public class Person {
    String name,passportNumber;

    public Person(String name, String passportNumber) {
        this.name = name;
        this.passportNumber = passportNumber;
    }
    public String getName() {
        return name;
    }
    public String getPassportNumber() {
        return passportNumber;
    }
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void fly(Flight flight){
        System.out.println("Passport Number: "+passportNumber);
        System.out.println(name+" is currently in the Airport located in: "+flight.getOrigin().getCity()+", "+flight.getOrigin().getCountry()+", "+flight.getOrigin().getIataCode());
        System.out.println(name+" is taking the flight :"+flight.getNumber());
        System.out.println(name+" is going to :"+flight.getDestination().getCity()+", "+flight.getDestination().getCountry()+", "+flight.getDestination().getIataCode());
    }

    public static void main(String[] args) {
        Pilot p1 = new Pilot("Jonny", "4777894", "Luxair");
        Passenger p2 = new Passenger("Mark", "98484984", 178);
        Airport a1 = new Airport("Luxemburg", "Luxemburg-City", "05491");
        Airport a2 = new Airport("Portugal", "Lisabon", "084916");
        Flight flight1= new Flight("707", a1, a2);
        Flight flight2= new Flight("757", a2, a1);
        p1.fly(flight1);
        p2.fly(flight1);
        p1.fly(flight2);
        p2.fly(flight2);

        // the drawback of making it my way is that the flight is tied to the person so if the pilot flies the person stays
        // i have to do the methode fly() for every person
    }
}
