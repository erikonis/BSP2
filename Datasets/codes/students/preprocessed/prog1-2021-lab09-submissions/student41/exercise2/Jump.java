public class Jump implements Action{
    Character player;

    public Jump(Character player){
        this.player = player;
    }

    public String execute(){
        return "Your character" + player.getName() +  "has jumped!";
    }

}
