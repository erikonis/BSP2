package lu.uni.programming1.lab9.exercise2;

public class Ability implements Action{
    String name;

    Character character;

    int power=0;

    public Ability(String name, Character character)
    {
        this.name = name;
        this.character = character;
    }

    public void use()
    {
        character.getLogger().addLog(character.getName()+" used "+name);
    }

    public String getName(){return name;}

    public void targetable(Character target){};

    public void setPower(int power){this.power = power;};
    
}
