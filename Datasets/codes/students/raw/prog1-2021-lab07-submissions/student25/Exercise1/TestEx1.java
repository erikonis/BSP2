package Exercise1;

import java.util.ArrayList;
import java.util.List;

public class TestEx1 {
    public static void main(String[] args) {
        Action left = new Action("left", 10);
        Action right = new Action("right", 10);
        Action back = new Action("back", 10);
        Action forward = new Action("forward", 10);
        Action takeAPhoto = new Action("take a low quality photo", 40);
        Action takeaphoto2 = new Action("take a high quality photo", 60);
        Action pickARock = new Action("pick a rock", 150);

        System.out.println("The differents actions possible and their battery's consomations are: ");

        System.out.println("---" + left);
        System.out.println("---" + right);
        System.out.println("---" + back);
        System.out.println("---" + forward);
        System.out.println("---" + takeAPhoto);
        System.out.println("---" + takeaphoto2);
        System.out.println("---" + pickARock);

        System.out.println("----------------------");

        Robot r2d2 = new Robot("R2D2", 3000);
        System.out.println(r2d2);
        // meme chose que System.out.println(r2d2.toString()); car r2d2 est un String

        List<Action> actionsToPerform = new ArrayList<>();
        actionsToPerform.add(left);
        actionsToPerform.add(left);
        actionsToPerform.add(left);
        actionsToPerform.add(forward);
        actionsToPerform.add(forward);
        actionsToPerform.add(forward);
        actionsToPerform.add(right);
        actionsToPerform.add(right);
        actionsToPerform.add(forward);
        actionsToPerform.add(left);

        actionsToPerform.add(left);

        Controller r2d2Controller = new Controller(r2d2);
        System.out.println(r2d2Controller);
        
        r2d2Controller.executeActions(actionsToPerform);

        System.out.println(r2d2Controller);
        

    }
}
