import java.util.Scanner;

public class Launcher {

    public static boolean allowed(String command) {
        return (command.equals("w") || command.equals("a") || command.equals("s") || command.equals("d") || command.equals("e") || command.equals("h") || command.equals("l") || command.equals("0"));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Robot robot = new Robot();
        Controller controller = new Controller(robot);

        System.out.println("What do you want the robot to do?\n");
        System.out.println("Enter \"w\" to go backwards, \"a\" to go left, \"s\" to go forward or \"d\" to go right.");
        System.out.println("You can also enter \"h\" or \"l\" to take respectively a high or low resolution image and \"e\" to take a rock.");
        System.out.println("To stop entering commands enter \"0\".");
        

        //adding commands to controller
        String command = "";
        boolean finished = false;

        while (!finished) {
            for (int i = 0; i < 10 && !command.equals("0") ; i++) {
                
                command = "";

                while (!allowed(command)) {
                    command = scanner.nextLine();
                    if (!allowed(command)) {
                        System.out.println("Please enter a letter of those mentioned in the beginning:");
                    }
                } 

                if (command.equals("w")) {
                    controller.addCommand("back");
                }
                else if (command.equals("a")) {
                    controller.addCommand("left");
                }
                else if (command.equals("s")) {
                    controller.addCommand("forward");
                }
                else if (command.equals("d")) {
                    controller.addCommand("right");
                }
                else if (command.equals("e")) {
                    controller.addCommand("take");
                }
                else if (command.equals("h")) {
                    controller.addCommand("hi-res photo");
                }
                else if (command.equals("l")) {
                    controller.addCommand("lo-res photo");
                }

            }

            System.out.print(controller.execute());
            System.out.print("To enter again up to 10 commands, enter \"true\" or \"false\": ");
            finished = !scanner.nextBoolean();
            command = "";

        }

        scanner.close();
    }
}
