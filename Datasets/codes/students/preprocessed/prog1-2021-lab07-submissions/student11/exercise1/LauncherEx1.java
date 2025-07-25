public class LauncherEx1 {

    public static void main(String[] args) {

        Action right = new right();
        Action forward = new forwards();
        Action back = new back();
        Action left = new left();
        Action low = new low();
        Action high = new high();
        Action rock = new pickRock();
        Action[] set1 = {forward,left,left,left,forward,rock,forward,forward,high,right};

        Controller s1 = new Controller(set1);



        
        
    }
}
