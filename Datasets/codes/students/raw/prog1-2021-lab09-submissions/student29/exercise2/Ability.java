package lu.uni.programming1.lab9.exercise2;

public class Ability extends Actions implements Targetable{
    private String name;
    private Character target;
    private int Value;



    public Ability(Character character_, String name, Character target, int value) {
        super(character_);
        this.name = name;
        this.target = target;
        Value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getTarget() {
        return target;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    

    public void setValue(int value) {
        Value = value;
    }

    public int getValue() {
        return Value;
    }


    
    
}
