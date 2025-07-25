public class Jump implements Action{

    public Log doAction(Character user){
        String s = "";
        s +=    "Action: Jump" + " User: " + user.getName() + " (" +  user.getCurrHP() + "/" + user.getMaxHP() + " HP)";
        return new Log(s);
    }
}
