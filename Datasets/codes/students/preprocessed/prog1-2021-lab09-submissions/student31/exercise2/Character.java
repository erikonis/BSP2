public class Character {

    private String name;


    private double maxHealthCounter;

    private double currentHealthCounter; 

    private Ability charAbility; 



    public Character() {
    }

    public Character(String name, double maxHealthCounter, double currentHealthCounter, Ability charAbility) {
        this.name = name;
        this.maxHealthCounter = maxHealthCounter;
        this.currentHealthCounter = currentHealthCounter;
        this.charAbility=charAbility;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public double getMaxHealthCounter() {
        return this.maxHealthCounter;
    }

    public void setMaxHealthCounter(double maxHealthCounter) {
        this.maxHealthCounter = maxHealthCounter;
    }

    public double getCurrentHealthCounter() {
        return this.currentHealthCounter;
    }

    public void setCurrentHealthCounter(double currentHealthCounter) {
        this.currentHealthCounter = currentHealthCounter;
    }

    public Character name(String name) {
        setName(name);
        return this;
    }

    public Character maxHealthCounter(double maxHealthCounter) {
        setMaxHealthCounter(maxHealthCounter);
        return this;
    }

    public Character currentHealthCounter(double currentHealthCounter) {
        setCurrentHealthCounter(currentHealthCounter);
        return this;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (o == this)
    //         return true;
    //     if (!(o instanceof Character)) {
    //         return false;
    //     }
    //     Character character = (Character) o;
    //     return Objects.equals(name, character.name) && maxHealth == character.maxHealth && maxHealthCounter == character.maxHealthCounter && currentHealthCounter == character.currentHealthCounter;
    // }

    // @Override
    // public int hashCode() {
    //     return Objects.hash(name, maxHealth, maxHealthCounter, currentHealthCounter);
    // }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", maxHealthCounter='" + getMaxHealthCounter() + "'" +
            ", currentHealthCounter='" + getCurrentHealthCounter() + "'" +
            "}";
    }



    
}
