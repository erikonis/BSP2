public class Character {
    private String name;
    private int maxHealthcounter;
    private int currentHealthcounter;
    
    public Character(String name, int maxHealthcounter) {
        this.name = name;
        this.maxHealthcounter = maxHealthcounter;
        currentHealthcounter = maxHealthcounter;
    }

    public String getName() {
        return name;
    }

    public int getMaxHealthcounter() {
        return maxHealthcounter;
    }

    public int getCurrentHealthcounter() {
        return currentHealthcounter;
    }

    public void setCurrentHealthcounter(int health) {
        currentHealthcounter = health ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Character other = (Character) obj;
        if (currentHealthcounter != other.currentHealthcounter)
            return false;
        if (maxHealthcounter != other.maxHealthcounter)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

}
