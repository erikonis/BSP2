public class Rectangle {
    private double xmin, ymin, xmax, ymax;

    public Rectangle(double xmin, double ymin, double xmax, double ymax) {
        this.xmin = Math.min(xmin, xmax);
        this.ymin = Math.min(ymin, ymax);
        this.xmax = Math.max(xmin, xmax);
        this.ymax = Math.max(ymin, ymax);
    }

    public boolean contains(Point p) {
        return p.getX() >= xmin && p.getX() <= xmax &&
               p.getY() >= ymin && p.getY() <= ymax;
    }
}