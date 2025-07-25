package lu.uni.programming1.lab9.exercise2;

public class Jump implements Action {
    Character character;

    public void jump()
    {
        character.getLogger().addLog(character.getName()+" jumped");;
    }

    public Jump(Character character)
    {
        this.character = character;
    }


}
