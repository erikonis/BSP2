public class ability extends action{

    protected String abilityName;

    public ability(character player, String abilityName) {
        super(player);
        this.abilityName = abilityName;
    }

    

    public String getAbilityName() {
        return abilityName;
    }



    @Override
    public void execute(log log)
    {
        log.addAction(new ability(getPlayer(),abilityName));
    }

    public String toString()
    {
        String description = (player.getName() + " used the ability " + getAbilityName() + ".");
        return description;
    }

    
}
