package lu.uni.programming1.lab7.Exercise1;

public class TakeHighResolutionPic extends Action {

    @Override
    void doAction() {
        cost = 60;
        action = "You took a high resolution picture";
        leftoverBattery = leftoverBattery - cost;
        System.out.println(action + " and you have taken " + cost + " seconds.");
    }

    public TakeHighResolutionPic() {
    }
    
}
// abstract classes