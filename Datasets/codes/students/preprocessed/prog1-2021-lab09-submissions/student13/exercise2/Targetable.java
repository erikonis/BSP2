public class Targetable extends Ability{

    private int power;

    public Targetable(String name, int power) {
        super(name);
        this.power=power;
    }
    
    public Recorder execute(Character character, Character target)
    {
        Recorder record;
        if(target == null)
        {
            record = new Recorder(getName(), "failed!", character.getName(), null);
        }
        
        if(target.getCurrenthealth()-power<=0)
        {
            target.setCurrenthealth(0);
            record = new Recorder(getName(), "Target was killed!", character.getName(), target.getName());
            if(character.equals(target))
            {
                record = new Recorder(getName(), "Character killed himself!", character.getName(), target.getName());
            }
        }
        else
        {
            target.setCurrenthealth(target.getCurrenthealth()-power);
            record = new Recorder(getName(), "successful!", character.getName(), target.getName());
        }
        return record;
    }

}
