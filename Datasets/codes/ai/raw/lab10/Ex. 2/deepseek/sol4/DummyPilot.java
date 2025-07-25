package evangelion.pilots;

import evangelion.obstacles.Obstacle;
import java.util.Random;

public class DummyPilot extends Pilot {
    public DummyPilot(String name, int compatibility) {
        super(name, compatibility - new Random().nextInt(6)); // Random reduction 0-5
    }

    @Override
    public int rollForManeuver(Obstacle obstacle) {
        return random.nextInt(101); // No bonus, no sanity effects
    }
    
    @Override
    public String toString() {
        return "(Dummy) " + super.toString();
    }
}