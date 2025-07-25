import java.util.Scanner;

class Rectangle {
    int xmin, ymin, xmax, ymax;

    public Rectangle(int xmin, int ymin, int xmax, int ymax) {
        this.xmin = xmin;
        this.ymin = ymin;
        this.xmax = xmax;
        this.ymax = ymax;
    }

    public boolean contains(int x, int y) {
        return x >= xmin && x <= xmax && y >= ymin && y <= ymax;
    }
}

public class PointInsideRectangleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rectangle (xmin ymin xmax ymax): ");
        Rectangle rect = new Rectangle(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

        System.out.print("Enter point coordinates: ");
        int xP = scanner.nextInt(), yP = scanner.nextInt();
        scanner.close();

        System.out.println(rect.contains(xP, yP) ? "Point is inside." : "Point is outside.");
    }
}