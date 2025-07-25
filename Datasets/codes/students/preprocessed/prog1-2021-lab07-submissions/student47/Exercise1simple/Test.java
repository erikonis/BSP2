public class Test {
        static int i;

        public static void main(String[] args) {

                // add the actions
                int actions[] = { 4, 4, 4, 1, 7, 1, 1, 5, 3, 3, 1, 4 };
                Robot r1 = new Robot("Sara");
                Controller c1 = new Controller(r1);

                for (i = 0; i < actions.length; i++) {

                        {
                                action(c1, actions[i]);

                                if ((i + 1) % 10 == 0)
                                        c1.printSet();
                        }
                }
                c1.printSet();
                c1.exit();

        }

        public static void printInstructions() {
                System.out.println("Choose an action for the robot to execute:");
                System.out.println("1 for moving forward");
                System.out.println("2 for moving back");
                System.out.println("3 for moving right");
                System.out.println("4 for moving left");
                System.out.println("5 for taking a high quality pic");
                System.out.println("6 for taking a low quality pic");
                System.out.println("7 for picking up a rock");

        }

        public static void action(Action c1, int opt) {
                switch (opt) {
                case 1:
                        c1.goForward();
                        break;
                case 2:
                        c1.goBack();
                        break;
                case 3:
                        c1.goRight();
                        break;
                case 4:
                        c1.goLeft();
                        break;
                case 5:
                        c1.takePicHigh();
                        break;
                case 6:
                        c1.takePicLow();
                        break;
                case 7:
                        c1.pickRock();
                        break;
                default:
                        i--;
                        System.out.println("Impossible action!");
                        break;

                }
        }
}
