package lu.uni.programming1.lab9.exercise2;

public class Character {

    private String name;
    private int MaxHealth;
    private int CurrentHealth;

    public Character(String name, int MaxHealth) {
        this.name=name;
        this.MaxHealth=MaxHealth;
        CurrentHealth=MaxHealth;
    }

    public String GetName() {
        return name;
    }

    public void TakeDamage(int damage, Logger log) {
        if (damage>=0) {
            CurrentHealth-=damage;
            if (CurrentHealth<=0) {Die(log);}
        }
        else {Heal(damage*(-1));}
    }

    public void Heal(int heal) {
        CurrentHealth+=heal;
        if (CurrentHealth>MaxHealth) {CurrentHealth=MaxHealth;}
    }

    // For testing.
    public void PrintHealth() {
        System.out.println(CurrentHealth);
    }

    public void Die(Logger log) {
        String temp = name + " has died.";
        log.Log(temp);
    }
    
}
