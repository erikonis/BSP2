import java.util.ArrayList;
import java.util.List;

public class Pilot {
    private String name;
    private int compatibility;
    private List<PilotComponent> components = new ArrayList<>();

    public Pilot(String name, int compatibility) {
        if (compatibility < 0 || compatibility > 100) {
            throw new IllegalArgumentException("Compatibility must be between 0 and 100 (inclusive).");
        }
        this.name = name;
        this.compatibility = compatibility;
    }

    public String getName() {
        return name;
    }

    public int getCompatibility() {
        return compatibility;
    }

    public void addComponent(PilotComponent component) {
        this.components.add(component);
    }

    public boolean onStart(EvaUnit<?> unit, int stability, int roll) {
        boolean result = true;
        for (PilotComponent component : components) {
            result = result && component.onStart(unit, this, stability, roll);
        }
        return result;
    }

    public boolean onManeuver(EvaUnit<?> unit, Obstacle obstacle) {
        boolean result = true;
        for (PilotComponent component : components) {
            result = result && component.onManeuver(unit, this, obstacle);
        }
        return result;
    }

    // Convenience methods to access component functionalities
    public <T extends PilotComponent> T getComponent(Class<T> type) {
        for (PilotComponent component : components) {
            if (type.isInstance(component)) {
                return type.cast(component);
            }
        }
        return null;
    }
}