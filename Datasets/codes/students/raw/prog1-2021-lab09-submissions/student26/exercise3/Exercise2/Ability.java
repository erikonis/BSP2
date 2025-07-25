package lu.uni.programming1.lab9.exercise3.Exercise2;

public class Ability extends Action{
    String ability;

    public Ability(Character person, String ability){
        super(person);
        this.ability = ability;
    }

    @Override
    public String execute(){
        return super.execute() + " uses " + ability;
    }
}
