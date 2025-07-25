package exercise2;

public class Jump extends Actions{
    
    public Jump(Character character) {
        super(character);
    }
    
    Records record = Records.getInstance();

    @Override
    public void execute() {
        record.addRecord("Jump action executed by " + character.getName()+"."+"\n");
        
    }
}
