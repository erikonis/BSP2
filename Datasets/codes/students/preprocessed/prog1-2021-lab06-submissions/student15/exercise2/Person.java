public class Person {
    private String name;
    private String passportNumber;
    private Flight flight;

    public Person(String name, String passportNumber, Flight flight) {
        this.setName(name);
        this.setPassportNumber(passportNumber);
        this.setFlight(flight);
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlight(Flight flight){
        this.flight = flight;
    }

    public String toString() {
        return "\nName: " + getName() + "\nPassport Number: " + getPassportNumber();
    }
}
