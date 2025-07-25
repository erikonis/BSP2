package lu.uni.programming1.lab7.exercise1;

public class LowResPictures extends Actions {

    @Override
    public int getBatteryCost() {
        return 40;
    }

    @Override
    public String getAction(){
        return "Robot took low resolution photo";
    } 
    
}
