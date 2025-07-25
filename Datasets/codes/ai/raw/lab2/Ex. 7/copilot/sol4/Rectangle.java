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

    public boolean contains(Point p) {
        double x = p.getX();
        double y = p.getY();
        return (x >= xmin && x <= xmax && y >= ymin && y <= ymax);
    }
}
