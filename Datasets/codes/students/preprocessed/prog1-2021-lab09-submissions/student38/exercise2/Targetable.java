public class Targetable extends Ability
{
    public Targetable(String name, Character character, int power)
    {
        super(name, character);
        super.setPower(power);
    }

    @Override
    public void targetable(Character target)
    {
        target.getLogger().addLog(super.character.getName()+" used "+super.getName()+" into "+target.getName());
        if(target.healthModifier(power)) target.getLogger().addLog(target.getName()+" was killed.");
    }
}
