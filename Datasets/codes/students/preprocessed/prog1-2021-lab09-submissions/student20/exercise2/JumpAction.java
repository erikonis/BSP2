public class JumpAction implements Action{
    private Character player;

    public JumpAction(Character player) {
        this.player = player;
    }

    @Override
    public void execute() {
        System.out.println(player.toString() + " jumped");
    }

    @Override
    public Character getActionCharacter() {
        return player;
    }
    
}
