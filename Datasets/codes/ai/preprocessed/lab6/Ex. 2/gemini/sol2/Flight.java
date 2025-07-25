import java.util.Objects;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;

    public Flight(String number, Airport origin, Airport destination) {
        this.number = Objects.requireNonNull(number, "Flight number cannot be null");
        this.origin = Objects.requireNonNull(origin, "Origin airport cannot be null");
        this.destination = Objects.requireNonNull(destination, "Destination airport cannot be null");
        if (origin.equals(destination)) {
            throw new IllegalArgumentException("Origin and destination airports cannot be the same.");
        }
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
        this.number = Objects.requireNonNull(number, "Flight number cannot be null");
    }

    public void setOrigin(Airport origin) {
        this.origin = Objects.requireNonNull(origin, "Origin airport cannot be null");
        if (this.origin.equals(this.destination)) {
            throw new IllegalArgumentException("Origin and destination airports cannot be the same.");
        }
    }

    public void setDestination(Airport destination) {
        this.destination = Objects.requireNonNull(destination, "Destination airport cannot be null");
        if (this.destination.equals(this.origin)) {
            throw new IllegalArgumentException("Origin and destination airports cannot be the same.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(number, flight.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "number='" + number + '\'' +
                ", origin=" + origin +
                ", destination=" + destination +
                "}";
    }
}