package exercise2;

public class Ability extends Action{
    private String name;

    public Ability(Character character,String name) {
        super(character);
        this.name = name;
    }

    public String toString(){
        return super.toString()+" used the ability "+name;
    }
    
}
