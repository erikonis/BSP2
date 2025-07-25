import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter road type id: ");
        int typeId = scanner.nextInt();
        System.out.print("Enter traveling speed: ");
        int speed = scanner.nextInt();

        Road road = SpeedCheck.getRoadById(typeId);
        if (road == null) {
            System.out.println("Unknown road type: " + typeId);
        } else {
            String result = SpeedCheck.checkSpeed(road, speed);
            System.out.println(result);
        }
    }
}