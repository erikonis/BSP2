package exercise2;

public class Ability extends Actions {

    AbilityName name;

    Records record=Records.getInstance();

    public Ability(AbilityName abName, Character character){
        super(character);
        this.name = abName;
    }

    @Override
    public void execute() {
        record.addRecord(character.getName()+" has executed the ability action "+this.name+"\n");
        
    }
    public void execute(String s) {
        record.addRecord(character.getName()+" has executed the ability action "+this.name+s+"\n");
        
    }
}
