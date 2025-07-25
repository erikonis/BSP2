public class Character
{
    private String name;
    private int maxHealth;
    private int currentHealth;

    public Character(String pName, int pMH, int pCH)
    {
        name = pName;
        maxHealth = pMH;
        currentHealth = pCH;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int damage)
    {
        int tmp = currentHealth + damage;

        currentHealth = Math.min(Math.max(0, tmp), getMaxHealth());
    }

    public boolean checkHealth()
    {
        if(getCurrentHealth() <= 0)
        {
            return true;
        }
        return false;
    }
}