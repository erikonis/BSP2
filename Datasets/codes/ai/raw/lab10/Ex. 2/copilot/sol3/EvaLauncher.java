import java.util.Random;

// Abstract Pilot class
abstract class Pilot {
    protected String name;
    protected int compatibility;

    public Pilot(String name, int compatibility) {
        this.name = name;
        this.compatibility = compatibility;
    }

    public String getName() {
        return name;
    }

    public int getCompatibility() {
        return compatibility;
    }

    public abstract void adjustCompatibility();
}

// HumanPilot class
class HumanPilot extends Pilot {
    private int sanity;

    public HumanPilot(String name, int compatibility) {
        super(name, compatibility);
        this.sanity = 100;
    }

    public int getSanity() {
        return sanity;
    }

    public void decreaseSanity(int amount) {
        sanity = Math.max(sanity - amount, 0);
    }

    @Override
    public void adjustCompatibility() {
        // HumanPilot compatibility remains stable
    }
}

// DummyPilot class
class DummyPilot extends Pilot {
    private Random random = new Random();

    public DummyPilot(String name, int compatibility) {
        super(name, compatibility);
        adjustCompatibility();
    }

    @Override
    public void adjustCompatibility() {
        compatibility -= random.nextInt(6); // Reduce compatibility by 0 to 5
    }
}

// EvaUnit class
class EvaUnit<T extends Pilot> {
    private int unitNumber;
    private T pilot;
    private int syncLevel;
    private boolean status;

    public EvaUnit(int unitNumber, T pilot, int syncLevel) {
        this.unitNumber = unitNumber;
        this.pilot = pilot;
        this.syncLevel = syncLevel;
        this.status = false;
    }

    public void start() {
        if (pilot != null) {
            int stability = Math.abs(syncLevel - pilot.getCompatibility());
            Random random = new Random();
            int roll = random.nextInt(101);

            if (roll <= stability) {
                status = true;
                System.out.println("Eva Unit " + unitNumber + " started successfully.");
                if (pilot instanceof HumanPilot) {
                    ((HumanPilot) pilot).decreaseSanity(5);
                }
            } else {
                System.out.println("Eva Unit " + unitNumber + " failed to start.");
            }
        }
    }

    public void maneuver(Obstacle obstacle) {
        if (status) {
            Random random = new Random();
            int roll = random.nextInt(101);

            if (pilot instanceof HumanPilot) {
                HumanPilot humanPilot = (HumanPilot) pilot;
                if (humanPilot.getSanity() > 0) {
                    roll += 20;
                    humanPilot.decreaseSanity(obstacle.getMentalToll());
                } else {
                    roll = 0;
                }
            }

            if (roll >= 50) {
                System.out.println("Eva Unit " + unitNumber + " successfully maneuvered the obstacle.");
            } else {
                System.out.println("Eva Unit " + unitNumber + " failed to maneuver the obstacle.");
            }
        } else {
            System.out.println("Eva Unit " + unitNumber + " is not started.");
        }
    }
}

// Obstacle class
abstract class Obstacle {
    protected int mentalToll;

    public int getMentalToll() {
        return mentalToll;
    }
}

// ObjectObstacle class
class ObjectObstacle extends Obstacle {
    public ObjectObstacle() {
        this.mentalToll = 0;
    }
}

// AngelObstacle class
class AngelObstacle extends Obstacle {
    private Random random = new Random();

    public AngelObstacle() {
        this.mentalToll = random.nextInt(101); // Mental toll ranges from 0 to 100
    }
}

// Sample launcher
public class EvaLauncher {
    public static void main(String[] args) {
        HumanPilot shinji = new HumanPilot("Shinji", 80);
        DummyPilot dummy = new DummyPilot("Dummy", 70);

        EvaUnit<HumanPilot> unit01 = new EvaUnit<>(1, shinji, 75);
        EvaUnit<DummyPilot> unit02 = new EvaUnit<>(2, dummy, 60);

        unit01.start();
        unit02.start();

        Obstacle objectObstacle = new ObjectObstacle();
        Obstacle angelObstacle = new AngelObstacle();

        unit01.maneuver(objectObstacle);
        unit01.maneuver(angelObstacle);

        unit02.maneuver(objectObstacle);
        unit02.maneuver(angelObstacle);
    }
}