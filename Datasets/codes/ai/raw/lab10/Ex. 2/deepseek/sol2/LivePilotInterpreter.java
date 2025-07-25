import java.util.Random;

public class LivePilotInterpreter implements PilotAlgebra<Pilot> {
    private static final Random random = new Random();

    @Override
    public Pilot createHumanPilot(String name, int compatibility, int sanity) {
        return new HumanPilot(name, compatibility, sanity);
    }

    @Override
    public Pilot createDummyPilot(String name, int compatibility) {
        return new DummyPilot(name, compatibility);
    }

    @Override
    public String getName(Pilot pilot) {
        return pilot.getName();
    }

    @Override
    public int getEffectiveCompatibility(Pilot pilot) {
        return pilot.getEffectiveCompatibility();
    }

    @Override
    public int rollManeuver(Pilot pilot, Obstacle obstacle) {
        return pilot.rollManeuver(obstacle);
    }

    @Override
    public void onStartAttempt(Pilot pilot) {
        pilot.onStartAttempt();
    }

    @Override
    public boolean canOperate(Pilot pilot) {
        return pilot.canOperate();
    }

    private static class HumanPilot implements Pilot {
        private final String name;
        private final int baseCompatibility;
        private int sanity;

        HumanPilot(String name, int compatibility, int sanity) {
            this.name = name;
            this.baseCompatibility = compatibility;
            this.sanity = sanity;
        }

        @Override
        public String getName() { return name; }

        @Override
        public int getEffectiveCompatibility() { return baseCompatibility; }

        @Override
        public int rollManeuver(Obstacle obstacle) {
            if (sanity <= 0) return 0;
            int roll = random.nextInt(101);
            sanity -= obstacle.getMentalToll();
            return roll + 20;
        }

        @Override
        public void onStartAttempt() {
            sanity = Math.max(0, sanity - 5);
        }

        @Override
        public boolean canOperate() {
            return sanity > 0;
        }
    }

    private static class DummyPilot implements Pilot {
        private final String name;
        private final int baseCompatibility;

        DummyPilot(String name, int compatibility) {
            this.name = name;
            this.baseCompatibility = compatibility;
        }

        @Override
        public String getName() { return name; }

        @Override
        public int getEffectiveCompatibility() {
            return Math.max(0, baseCompatibility - random.nextInt(6));
        }

        @Override
        public int rollManeuver(Obstacle obstacle) {
            return random.nextInt(101);
        }

        @Override
        public void onStartAttempt() {}

        @Override
        public boolean canOperate() {
            return true;
        }
    }
}