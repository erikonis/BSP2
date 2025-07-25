package lu.uni.programming1.lab9.exercise2;

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
