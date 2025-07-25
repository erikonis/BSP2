import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controller controller = new Controller();
        int moveNumber;
        int batteryLife = 3000;
    
 

        for (moveNumber = 9; moveNumber >=0; moveNumber--) {
            System.out.println("What do you want to do? These are the different options: ");
            System.out.println(
                    "1 to move forwards, 2 to move backwards, 3 to move left, 4 to move right, 5 to pick up a rock, 6 to take a high resolution picture and 7 to take a low resolution picture.");
            int answer = scanner.nextInt();
            System.out.println("You have "+moveNumber+" turns left");
            switch (answer) {
            case 1:
                controller.goForwards();
                batteryLife -= 10;
                break;
            case 2:
                controller.goBackwards();
                batteryLife -= 10;
                break;
            case 3:
                controller.goLeft();
                batteryLife -= 10;
                break;
            case 4:
                controller.goRight();
                batteryLife -= 10;
                break;
            case 5:
                controller.pickRock();
                batteryLife -= 150;
                break;
            case 6:
                controller.takeHighResPic();
                batteryLife -= 60;
                break;
            case 7:
                controller.takeLowResPic();
                batteryLife -= 40;
                break;
            default:
                System.out.println("This is not an option");
                break;
           
            }
            scanner.close();
        }
        System.out.println("There are no more moves left. This is the remaining battery life: " + batteryLife);
        
    }
    

}
