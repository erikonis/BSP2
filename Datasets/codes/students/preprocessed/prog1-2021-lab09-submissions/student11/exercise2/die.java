public class die extends action{

    public die(character player) {
        super(player);
    }

    @Override
    public void execute(log log)
    {
        log.addAction(new die(getPlayer()));
        getPlayer().setCurrentHealth(getPlayer().getMaxHealth());
    }

    @Override
    public String toString()
    {
        String description = (player.getName() + " died.");
        return description;
    }
    
    
}
