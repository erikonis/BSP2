import java.util.Random;

public class HumanManeuverEffectComponent implements PilotComponent {
    private final Random random = new Random();

    @Override
    public boolean onStart(EvaUnit<?> unit, Pilot pilot, int stability, int roll) {
        return true; // Doesn't affect start directly
    }

    @Override
    public boolean onManeuver(EvaUnit<?> unit, Pilot pilot, Obstacle obstacle) {
        SanityComponent sanityComp = pilot.getComponent(SanityComponent.class);
        int pilotRoll = random.nextInt(101);
        System.out.println("Human Pilot " + pilot.getName() + " rolls " + pilotRoll + " for maneuver.");
        int effectiveRoll = (sanityComp != null && sanityComp.canAct()) ? pilotRoll + 20 : 0;
        return effectiveRoll >= 50;
    }
}