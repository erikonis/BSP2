public class Ability extends Actions {

    String name;
    
    public Ability(Character hero, String name) {
        this.user=hero;
        this.name=name;
    }

    public void Execute(Logger log) {
        String temp = user.GetName() + " used " + name;
        log.Log(temp);
    }
    
}
