public class targetable extends ability{

    private character target;
    private int value;

    public targetable(character player, String abilityName, character target, int value) {
        super(player, abilityName);
        this.target = target;
        this.value = value;
    }

    @Override
    public void execute(log log)
    {
        target.setCurrentHealth(target.getCurrentHealth() - value);
        log.addAction(new targetable(getPlayer(), getAbilityName(), target, value));
        if (target.getCurrentHealth() <= 0)
        {
            log.addAction(new die(target));
        }
    }

    public String toString()
    {
        String description = (player.getName() + " used the ability " + getAbilityName() + " on " + target.getName() + " and dealt " + value + " damage.");
        return description;
    }
    
}
