public class Character { // player’s character
    String name;
    int healthpoints; // current healthcounter
    int maxhealthpoints; // maximum healthcounter

    Character(String name, int healthpoints, int maxhealthpoints) {
        this.name = name;
        this.healthpoints = healthpoints;
        this.maxhealthpoints = maxhealthpoints;
    }

    public String getName() {
        return this.name;
    }

    public int gethealthpoints() {
        return this.healthpoints;
    }

    public void sethealthpoints(int healthpoints) {
        this.healthpoints = healthpoints;
    }

    public int getMaxhealthpoints() {
        return this.maxhealthpoints;
    }
}
