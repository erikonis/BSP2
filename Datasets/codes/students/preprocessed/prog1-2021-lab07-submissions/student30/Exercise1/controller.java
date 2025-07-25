public class controller {

    public static void main(String[] args) {
        Robot B = new Robot();
        action[] moves = { new move(1), new move(2), new move(2), new pickRock(), new takePic(true) };
        B.executeInstructions(moves);
    }
}