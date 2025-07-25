import java.util.Scanner;
public class Controller extends Maze{
    String input;
    boolean Left;
    boolean Right;
    boolean Down;
    boolean Up;
    Scanner scanner = new Scanner(System.in);
    Controller(String input, boolean L, boolean R, boolean D, boolean U){
        super(L,R,D,U);
        this.Left = L;
        this.Right = R;
        this.Down = D;
        this.Up = U;
        this.input = input;
    }

    public void takePicture(){
        System.out.println("can take picture of very ugly alien, option(1): high res picture, option (2): low res picture");
        int yOrNo = scanner.nextInt();
        if (yOrNo == 1){
            System.out.println("takes high res picture of alien... " + "\n" + "\"ew... digusting... it would look better with a mask on...\"");
            time -= 60;
        }
        if (yOrNo == 2){
            System.out.println("takes low res picture of alien... " + "\n" + "\"jeez... at least the quality hides it's face...\"");
            time -= 40;
        }
        else{
            System.out.println("no picture taken... " + "\n" + "the alien looks at you manacingly...");
        }
    }

    public void picksUpRock(){
        System.out.println("a wild rock appears, pick up? (y/n)");
        String yOrNo = scanner.nextLine();
        if (yOrNo.contains("y")){
        System.out.println("picks up rock... " + "\"it looks like a normal rock...\"");
        time -= 150;
        }
        else {
            System.out.println("doesn't pick up the useless rock..." + "\"who needs rocks either way...\"");
        }
    }

    public void goDirection(){
        if (input.contains("down") && Down == true){
            System.out.println("goes down...");
            time -= 10;
            System.out.println(time);
        }

        if (input.contains("up") && Up == true){
            System.out.println("goes up...");
            time -= 10;
            System.out.println(time);
        }

        if (input.contains("right") && Right == true){
            System.out.println("goes right...");
            time -= 10;
            System.out.println(time);
        }

        if (input.contains("left") && Left == true){
            System.out.println("goes left...");
            time -= 10;
            System.out.println(time);
        }
    }
}