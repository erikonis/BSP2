// import java.util.Arrays;
import java.util.Scanner;

public class MainController {

    public static void main(String[] args) {

        String answer;
        Actions action = null;
        int i;
        String[] listOfActions = new String[30];

        Scanner scanner = new Scanner(System.in);

        Robot WallE = new Robot(3000); 

        System.out.println("\nHello, read the manual to use Wall-E, our robot on Mars");
        System.out.println("'left, 'right, 'forward', 'back', 'photohigh' = picture(high res), 'photolow' = picture (low res), 'pick'= pick a rock, 'stop' = to terminate ");
        System.out.println("\nWhat should Wall-E do ?");

        for (int j = 0; j < listOfActions.length; j++) {
            for (i = 0; i < 10; i++) {
                answer = scanner.next();

                switch (answer) {
                case "left", "right", "forward", "back":
                    action = new Moves(answer);
                    break;
                case "photohigh":
                    action = new HighResPictures();
                    break;
                case "photolow":
                    action = new LowResPictures();
                    break;
                case "pick":
                    action = new PickRock();
                    break;
                case "stop":
                    System.out.println("\nEnd of the set of action(s). \nWallE did " + i + " action(s) :");
                    for (int h = 0; h < i; h++) {
                        System.out.println(listOfActions[h]);
                    }
                    System.out.println();
                    WallE.getTheRestoftheBattery(action);
                    return;
                default:
                    System.out.println("Not a valid input.");
                }
                WallE.getBatteryCost(action);
                WallE.minusBatteryLife(action);
                listOfActions[i] = WallE.doAction(action);
            }

            System.out.println("\nEnd of the set of action(s). \nWallE did " + i + " action(s) :");
            for (int h = 0; h < i; h++) {
                System.out.println(listOfActions[h]);
            }
            System.out.println();
            WallE.getTheRestoftheBattery(action);
            System.out.println("--------------");
        }
    
        scanner.close();

    }

}
