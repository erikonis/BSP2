public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = number;
        this.origin = origin;
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public Airport getOrigin() {
        return origin;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String passportNumber) {
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
}