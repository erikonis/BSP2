package lu.uni.programming1.lab9.exercise2;

public class Targetable extends Action
{
    private int damage;
    private Character otherPlayer;

    public Targetable(Character c1, int pDamage, Character ch) {
        super(c1);
        damage = pDamage;
        otherPlayer = ch;
        Logger.add(toArray());
    }

    public int getDamage()
    {
        return damage;
    }

    public String healDamage()
    {
        if(damage<0)
        {
            return "damage";
        }
        return "heal";
    }

    public String toArray()
    {
        otherPlayer.setCurrentHealth(damage);
        String text = super.toArray() + ", target: " + otherPlayer.getName() + ", " + healDamage() + ": " + Math.abs(getDamage());

        if(otherPlayer.checkHealth())
        {
            text += ", player: " + otherPlayer.getName() + " died";
        }

        return text;
    }
}