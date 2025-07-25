package lu.uni.programming1.lab9.exercise2;

public class Targetable extends Actions {

    String name;
    int damage;

    public Targetable(Character hero, String name, int damage) {
        this.user=hero;
        this.name=name;
        this.damage=damage;
    }

    public void Execute(Logger log, Character enemy) {
        String temp = user.GetName() + " used " + name + " on " + enemy.GetName();
        log.Log(temp);
        enemy.TakeDamage(damage, log);
    }
    
}
