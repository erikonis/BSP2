package lu.uni.programming1.lab9.exercise2;

public class Ability implements executable{

    private String ability;
    private Character player;
    
    public Ability(String ability, Character player) {
        this.ability = ability;
        this.player = player;
    }

    public String useAbility(){
        return "The character " + player.getName() + "use the " + ability + "ability";
    }

    public String getAbility() {
        return ability;
    }

    public Character getPlayer() {
        return player;
    }
    
}
