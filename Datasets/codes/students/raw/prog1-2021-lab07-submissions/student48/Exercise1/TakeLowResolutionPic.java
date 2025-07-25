package lu.uni.programming1.lab7.Exercise1;

public class TakeLowResolutionPic extends Action {
    
    @Override
    void doAction() {
        cost = 40;
        action = "You took a low resolution picture";
        leftoverBattery = leftoverBattery - cost;
        System.out.println(action + " and you have taken " + cost + " seconds.");
    }

    public TakeLowResolutionPic() {
    }
    
}
