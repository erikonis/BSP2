import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.util.Scanner;

public class PointInRectangleAWT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter point P coordinates (x y):");
        double xP = scanner.nextDouble();
        double yP = scanner.nextDouble();
        Point2D.Double point = new Point2D.Double(xP, yP);

        System.out.println("Enter rectangle coordinates (xmin ymin xmax ymax):");
        double xmin = scanner.nextDouble();
        double ymin = scanner.nextDouble();
        double xmax = scanner.nextDouble();
        double ymax = scanner.nextDouble();

        // Ensure xmin <= xmax and ymin <= ymax for Rectangle2D
        double rectX = Math.min(xmin, xmax);
        double rectY = Math.min(ymin, ymax);
        double rectWidth = Math.abs(xmax - xmin);
        double rectHeight = Math.abs(ymax - ymin);
        Rectangle2D.Double rectangle = new Rectangle2D.Double(rectX, rectY, rectWidth, rectHeight);

        boolean isInside = rectangle.contains(point);

        System.out.println("Point P" + point + " is " +
                           (isInside ? "inside" : "outside") +
                           " the rectangle at (" + rectX + ", " + rectY + ") with width " + rectWidth + " and height " + rectHeight + ".");

        scanner.close();
    }
}