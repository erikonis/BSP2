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
