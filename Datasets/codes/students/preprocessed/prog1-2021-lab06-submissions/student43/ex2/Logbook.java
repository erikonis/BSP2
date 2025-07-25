public class Logbook {

    private Pilot owner;
    private Flight[] flights;

    public Logbook(Pilot owner, int pages) {
        this.owner = owner;
        this.flights = new Flight[pages];
    }

    public Pilot getOwner() {
        return this.owner;
    }

    public Flight[] getFlights() {
        return this.flights;
    }

    public void fly(Flight flight) {
        // check for free page
        boolean added = false;
        for (int i = 0; i < this.flights.length; i++) {
            if (this.flights[i] == null) {
                this.flights[i] = flight;
                added = true;
                break;
            }
        }

        if (!added) {
            System.err.println("Logbook is full!");
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder(String.format("LOGBOOK\nPilot: %s\nFlights:\n", this.owner));
        for (Flight f : this.flights) {
            if (f != null) {
                s.append("- " + f);
            }
        }
        return s.toString();
    }
}