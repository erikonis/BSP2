public class Passenger extends Person {
    private int loyaltyCardNumber;
    private List<Flight> flights;

    public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
        this.flights = new ArrayList<>();
    }

    public int getLoyaltyCardNumber() {
        return loyaltyCardNumber;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void addFlight(Flight flight) {
        this.flights.add(flight);
    }

    public void removeFlight(Flight flight) {
        this.flights.remove(flight);
    }

    @Override
    public String toString() {
        return super.toString() + ", Loyalty Card: " + loyaltyCardNumber;
    }
}