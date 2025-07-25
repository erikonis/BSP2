public class Character{
    private String name;
    private int maxHP;
    private int HP;
    
    Character(String name, int maxHP, int HP) {
        this.name = name;
        this.maxHP = maxHP;
        this.HP = HP;
    }

    public String getName() {return this.name;}
    public int getMaxHP() {return this.maxHP;}
    public int getHP() {return this.HP;}

    public void removeHP(int amount) {
        if (this.HP-amount < 0) {
            this.HP = 0;
        } else if (this.HP-amount > this.maxHP) {
            this.HP = this.maxHP;
        } else {
            this.HP -= amount;
        }
    }

    @Override
    public String toString() {
        return this.name + "(" + this.HP + "/" + this.maxHP + ")";
    }

    public boolean isDead() {
        if (HP == 0) {return true;}
        else {return false;}
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
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
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    
}