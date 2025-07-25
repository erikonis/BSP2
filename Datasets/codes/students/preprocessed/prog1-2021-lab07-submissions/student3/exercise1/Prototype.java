import java.util.Scanner;

public class Prototype {
    
    public static void main(String[] args) {
        Action left = new Action("left", 10);
        Action right = new Action("right", 10);
        Action back = new Action("back", 10);
        Action front = new Action("forward", 10);
        Action lowphoto = new Action("take a low quality photo", 40);
        Action highphoto = new Action("take a high quality photo", 60);
        Action rock = new Action("pick a rock", 150);
        
        int batterylife = 3000;
        int move=0;
        int nmoves = 0;
        
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("The differents actions possible and their battery's consomations are: ");
            Robot Robot1 = new Robot("Boby", batterylife);
            System.out.println("1: "+left);
            pause(100);
            System.out.println("2: "+right);
            pause(100);
            System.out.println("3: "+back);
            pause(100);
            System.out.println("4: "+front);
            pause(100);
            System.out.println("5: "+lowphoto);
            pause(100);
            System.out.println("6: "+highphoto);
            pause(100);
            System.out.println("7: "+rock);
            pause(100);

            System.out.println("----------------------");

            System.out.println(Robot1);

            System.out.println("What's Bobys' next move ?");
            move = scan.nextInt();

            switch (move) {
                case 1:
                System.out.println("\nBoby moves to the left and lose 10 Battery life\n");
                batterylife -= 10;
                nmoves ++;
                pause(1000);
                    break;
                case 2:
                System.out.println("\nBoby moves to the right and lose 10 Battery life\n");
                batterylife -= 10;
                nmoves ++;
                pause(1000);
                    break;
                case 3:
                System.out.println("\nBoby moves to the back and lose 10 Battery life\n");
                batterylife -= 10;
                nmoves ++;
                pause(1000);
                    break;
                case 4:
                System.out.println("\nBoby moves to the front and lose 10 Battery life\n");
                batterylife -= 10;
                nmoves ++;
                pause(1000);
                    break;
                case 5:
                System.out.println("\nBoby takes a low quality picture and lose 40 Battery life\n");
                batterylife -= 40;
                nmoves ++;
                pause(1000);
                    break;
                case 6:
                System.out.println("\nBoby takes a high quality picture and lose 10 Battery life\n");
                batterylife -= 60;
                nmoves ++;
                pause(1000);
                    break;
                case 7:
                System.out.println("\nBoby became Hulk and lift the rock and lose 150 Battery life\n");
                batterylife -= 150;
                nmoves ++;
                pause(1000);
                    break;
            }
        }while (batterylife > 0 && nmoves < 11);

        if (batterylife == 0) {
            System.out.println("Oh no, Boby doesn't have any battery any more!! ENDGAME!!\n");
        } else {
            System.out.println("Boby has "+batterylife+" battery left but doesn't have any moves anymore\n");
        }
        
        scan.close();
    }
    public static void pause(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
