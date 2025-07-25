public class Rectangle {
    private final double xmin;
    private final double ymin;
    private final double xmax;
    private final double ymax;

    public Rectangle(double xmin, double ymin, double xmax, double ymax) {
        this.xmin = Math.min(xmin, xmax);
        this.ymin = Math.min(ymin, ymax);
        this.xmax = Math.max(xmin, xmax);
        this.ymax = Math.max(ymin, ymax);
    }

    public double getXmin() {
        return xmin;
    }

    public double getYmin() {
        return ymin;
    }

    public double getXmax() {
        return xmax;
    }

    public double getYmax() {
        return ymax;
    }

    public boolean contains(Point p) {
        return p.getX() >= xmin && p.getX() <= xmax &&
               p.getY() >= ymin && p.getY() <= ymax;
    }

    @Override
    public String toString() {
        return "(" + xmin + ", " + ymin + ") - (" + xmax + ", " + ymax + ")";
    }
}