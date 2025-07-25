public class PointInRectangleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner);

        Point pointP = inputHandler.readPoint();
        Rectangle rectangle = inputHandler.readRectangle();

        if (rectangle.contains(pointP)) {
            System.out.println("Point P" + pointP + " is inside the rectangle " + rectangle + ".");
        } else {
            System.out.println("Point P" + pointP + " is outside the rectangle " + rectangle + ".");
        }

        scanner.close();
    }
}