public class Interaction extends Action {

    private String interaction;
    private int neededBatteryLife = 0;

    public Interaction(int neededBatteryLife, String interaction) {
        super(interaction, neededBatteryLife);
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    @Override
    public String toString() {
        return "Interaction [interaction=" + interaction + ", neededBatteryLife="
                + neededBatteryLife + "]";
    }
}
