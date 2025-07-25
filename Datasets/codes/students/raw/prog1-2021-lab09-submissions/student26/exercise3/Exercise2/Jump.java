package lu.uni.programming1.lab9.exercise3.Exercise2;

public class Jump extends Action{
    public Jump(Character person){
        super(person);
    }

    @Override
    public String execute(){
        return super.execute() + " jumps.";
    }
}
