public abstract class Actions {
    
    public Character character;

    public Actions(Character character) {
        this.character = character;
    }
    
    public abstract void execute();
}
