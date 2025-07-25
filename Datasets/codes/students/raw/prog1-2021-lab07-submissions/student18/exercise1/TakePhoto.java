public abstract class TakePhoto extends Action{

    public TakePhoto(int cost) {
        super(cost);
    }

    public abstract void runAction(Robot robot);

}
