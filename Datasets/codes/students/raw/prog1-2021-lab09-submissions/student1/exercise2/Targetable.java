package lu.uni.programming1.lab9.exercise2;

public class Targetable implements Actions  {

    private String name;
    Character character;
    private int power;

    public Targetable(int power){
        this.power = power;
        character = null;
    }
    public String getName() {
        return name;
    }

    public void target(Character character){
        this.character = character;
    }

    @Override
    public void execute(){

        if(character != null){
            character.setCurrHealth(character.getCurrHealth()+power);
            Logger.save(event);
        }
    }
    
}
