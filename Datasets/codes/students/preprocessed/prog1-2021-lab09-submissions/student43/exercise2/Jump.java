public class Jump extends Action{

    public Jump(Character character) {
        super(character);
    }
    
    public String toString(){
        return super.toString()+" jumped.";
    }
}
