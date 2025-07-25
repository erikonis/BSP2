public class Rectangle {
    private double xmin;
    private double ymin;
    private double xmax;
    private double ymax;

    public Rectangle(double xmin, double ymin, double xmax, double ymax) {
        this.xmin = xmin;
        this.ymin = ymin;
        this.xmax = xmax;
        this.ymax = ymax;
    }

    public boolean containsPoint(Point point) {
        return (point.getX() >= xmin && point.getX() <= xmax &&
                point.getY() >= ymin && point.getY() <= ymax);
    }
}