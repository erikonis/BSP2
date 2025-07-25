public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public boolean isInside(Rectangle rectangle) {
        return (x >= rectangle.getXmin() && x <= rectangle.getXmax() &&
                y >= rectangle.getYmin() && y <= rectangle.getYmax());
    }
}