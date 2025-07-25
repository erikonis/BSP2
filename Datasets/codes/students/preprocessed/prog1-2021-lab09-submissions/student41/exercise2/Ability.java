public class Ability implements Action{
    Character player;
    String name;

    public Ability(String name, Character player){
        this.name = name;
        this.player = player;
    }

    public String execute(){
        return "The ability " + getName() + " has been executed by " + player.getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
