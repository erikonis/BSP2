import evangelion.pilots.Pilot;

public class ProductionEva<T extends Pilot> extends EvaUnit<T> {
    private int armorIntegrity;

    public ProductionEva(int unitNumber, int syncLevel) {
        super(unitNumber, syncLevel);
        this.armorIntegrity = 100;
    }

    @Override
    public boolean maneuver(Obstacle obstacle) {
        boolean result = super.maneuver(obstacle);
        if (!result) {
            armorIntegrity -= 10;
            System.out.println("Armor damaged! Integrity: " + armorIntegrity + "%");
        }
        return result;
    }
}