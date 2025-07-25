import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read point coordinates
        System.out.print("Enter point x coordinate: ");
        double xP = scanner.nextDouble();
        System.out.print("Enter point y coordinate: ");
        double yP = scanner.nextDouble();
        
        // Read rectangle coordinates
        System.out.print("Enter rectangle xmin: ");
        double xmin = scanner.nextDouble();
        System.out.print("Enter rectangle ymin: ");
        double ymin = scanner.nextDouble();
        System.out.print("Enter rectangle xmax: ");
        double xmax = scanner.nextDouble();
        System.out.print("Enter rectangle ymax: ");
        double ymax = scanner.nextDouble();
        
        // Validate rectangle coordinates
        if (xmin >= xmax || ymin >= ymax) {
            System.out.println("Invalid rectangle coordinates: xmin must be less than xmax and ymin must be less than ymax");
            return;
        }
        
        // Check if point is inside rectangle
        boolean isInside = (xP >= xmin) && (xP <= xmax) && (yP >= ymin) && (yP <= ymax);
        
        // Display result
        System.out.printf("Point (%.2f, %.2f) is %s the rectangle (%.2f, %.2f, %.2f, %.2f)%n",
                         xP, yP, 
                         isInside ? "inside" : "outside",
                         xmin, ymin, xmax, ymax);
    }
}