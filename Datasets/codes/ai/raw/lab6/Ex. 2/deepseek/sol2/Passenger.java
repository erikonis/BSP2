import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {
    private final int loyaltyCardNumber;
    private final List<Flight> flights = new ArrayList<>();

    public Passenger(String name, String passportNumber, int loyaltyCardNumber) {
        super(name, passportNumber);
        this.loyaltyCardNumber = loyaltyCardNumber;
    }

    public int getLoyaltyCardNumber() { return loyaltyCardNumber; }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights); // Return copy for encapsulation
    }
}