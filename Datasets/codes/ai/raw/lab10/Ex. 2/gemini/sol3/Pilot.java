import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.Random;

public class Pilot {
    private String name;
    private int compatibility;
    private BiFunction<EvaUnit<?>, Integer, Boolean> startAction;
    private BiFunction<EvaUnit<?>, Obstacle, Boolean> maneuverAction;
    private Consumer<Integer> sanityReducer;
    private java.util.function.Supplier<Integer> sanityGetter;
    private java.util.function.Supplier<Boolean> canActChecker;

    public Pilot(String name, int compatibility,
                 BiFunction<EvaUnit<?>, Integer, Boolean> startAction,
                 BiFunction<EvaUnit<?>, Obstacle, Boolean> maneuverAction,
                 Consumer<Integer> sanityReducer,
                 java.util.function.Supplier<Integer> sanityGetter,
                 java.util.function.Supplier<Boolean> canActChecker) {
        if (compatibility < 0 || compatibility > 100) {
            throw new IllegalArgumentException("Compatibility must be between 0 and 100 (inclusive).");
        }
        this.name = name;
        this.compatibility = compatibility;
        this.startAction = startAction;
        this.maneuverAction = maneuverAction;
        this.sanityReducer = sanityReducer;
        this.sanityGetter = sanityGetter;
        this.canActChecker = canActChecker;
    }

    public String getName() {
        return name;
    }

    public int getCompatibility() {
        return compatibility;
    }

    public boolean canStart(EvaUnit<?> unit, int stability, int roll) {
        return startAction.apply(unit, roll);
    }

    public boolean canManeuver(EvaUnit<?> unit, Obstacle obstacle) {
        return maneuverAction.apply(unit, obstacle);
    }

    public void reduceSanity(int amount) {
        if (sanityReducer != null) {
            sanityReducer.accept(amount);
        }
    }

    public int getSanity() {
        return sanityGetter != null ? sanityGetter.get() : Integer.MAX_VALUE; // Dummy pilots effectively have infinite sanity
    }

    public boolean canAct() {
        return canActChecker == null || canActChecker.get(); // Dummy pilots always can act
    }
}