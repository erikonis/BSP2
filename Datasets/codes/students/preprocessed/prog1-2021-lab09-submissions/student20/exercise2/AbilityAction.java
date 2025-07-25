public class AbilityAction implements Action{
    private Character player;
    private String name;

    public AbilityAction(Character player, String name) {
        this.player = player;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Character getPlayer() {
        return player;
    }

    public void setPlayer(Character player) {
        this.player = player;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Character getActionCharacter() {
        return player;
    }

    @Override
    public void execute() {
        System.out.println(player.toString() + " used " + getName());
    }
}
