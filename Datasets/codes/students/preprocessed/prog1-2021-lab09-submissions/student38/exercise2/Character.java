import java.util.ArrayList;

public class Character{
    private String name;
    private int maxHealth;
    private int health;

    private Log logger;

    private ArrayList<Ability> abilities = new ArrayList<>();

    private Jump jump = new Jump(this);

    public Character(String name, int maxHealth, int health, Log logger)
    {
        this.name = name;
        this.maxHealth = maxHealth;
        this.health = health;
        this.logger = logger;
    }

    public boolean healthModifier(int power)
    {
        health += power;
        if(health<0) return true;
        else return false;
    }

    public Log getLogger(){return logger;}

    public String getName(){return name;}

    public void jump(){jump.jump();}

    public void useAbility(String abilityName, Character target)
    {
        for(Ability x: abilities)
        {
            if(x.getName().equals(abilityName))
            {
                if(x instanceof Targetable) 
                {
                    x.targetable(target);
                }
                else
                {
                    x.use();
                }
                break;
            }
        }
    }

    public void setAbilities(Ability[] abilities)
    {
        for(Ability x: abilities)
        {
            this.abilities.add(x);
        }
    }

    public String toString()
    {
        return "character stats: \nname = "+name+"\nmax health = "+maxHealth+"\n health = "+health;
    }

}
