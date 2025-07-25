package exercise2;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private String number;
    private Airport origin;
    private Airport destination;
    private List<FlightParticipant> participants = new ArrayList<>();

    public void addParticipant(FlightParticipant participant) {
        participants.add(participant);
    }
}
