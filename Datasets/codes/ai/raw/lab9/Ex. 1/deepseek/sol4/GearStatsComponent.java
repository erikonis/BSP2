package components;

import ecs.Component;

public class GearStatsComponent extends Component {
    private final int criticalHit;
    private final int determination;
    private final int directHit;

    public GearStatsComponent(int criticalHit, int determination, int directHit) {
        this.criticalHit = criticalHit;
        this.determination = determination;
        this.directHit = directHit;
    }

    public int getTotalStats() {
        return criticalHit + determination + directHit;
    }
}