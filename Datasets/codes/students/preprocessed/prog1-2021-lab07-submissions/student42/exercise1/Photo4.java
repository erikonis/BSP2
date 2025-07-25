public class Photo4 extends Action {
    boolean resolution;

    // low resolution photo 40 seconds
    public Photo4(boolean resolution) {
        super.ActionName = "Photo";
        super.cost = 40;
        this.resolution = resolution;
    }

    // taking a high resolution photo takes 60 seconds
    public int execute() {
        if (resolution) {
            cost = 60;
        } else {
            return cost;
        }
        return cost;
    }

    public String text() {
        String s = " ";
        if (resolution) {
            s = "High-resolution photo has taken.";
        } else {
            s = "Low-resolution photo has taken.";
        }
        return s + " With this move the battery is reduced by: -" + cost + " seconds";
    }
}
