package exercise2;

public abstract class Action{
    Character character;

    public Action(Character character){
        this.character = character;
        Logger.add(this);
    }

    public String toString(){
        return character.toString();
    }
}
