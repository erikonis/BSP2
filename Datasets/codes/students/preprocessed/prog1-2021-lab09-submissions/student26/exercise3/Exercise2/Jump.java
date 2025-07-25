public class Jump extends Action{
    public Jump(Character person){
        super(person);
    }

    @Override
    public String execute(){
        return super.execute() + " jumps.";
    }
}
