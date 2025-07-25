package lu.uni.programming1.lab6.ex2;

public class Ticket {

    private int eTicketNumber;
    private Flight flight;
    private Passenger passenger;

    public Ticket(int eTicketNumber, Flight flight, Passenger passenger) {
        this.eTicketNumber = eTicketNumber;
        this.flight = flight;
        this.passenger = passenger;
    }

    public int geteTicketNumber() {
        return this.eTicketNumber;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    @Override
    public String toString() {
        return String.format("eTicket Nr. %s\nPassenger: %s (Passport %s, Loyalty Card Number: %d)\nFlight: %s",
                this.eTicketNumber, this.getPassenger(), this.getPassenger().getPassportNumber(),
                this.getPassenger().getLoyaltyCardNumber(), this.getFlight());
    }

}