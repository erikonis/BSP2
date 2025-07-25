package lu.uni.programming1.lab7.exercise1;

public class ActionPicture extends Action {

    boolean highRes;

    public ActionPicture(boolean highRes) {
        this.highRes = highRes;
    }

    @Override
    public void execute() {
        if (highRes) {
            System.out.println("Took a high res picture");
        } else {
            System.out.println("Took a low res picture");
        }

    }

}
