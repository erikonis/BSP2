package lu.uni.programming1.lab9.exercice1;

public class gear extends item {
 
    private int critHit;
    private int determination;
    private int dirHit;

    public gear(String name, int value, rarity rarity, int critHit, int determination, int dirHit) {
        super(name, value, rarity);
        this.critHit = Math.max(critHit, 0);
        this.determination = Math.max(determination, 0);
        this.dirHit = Math.max(dirHit, 0);
    }

    public int getCritHit() {
        return critHit;
    }

    public void setCritHit(int critHit) {
        this.critHit = critHit;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getDirHit() {
        return dirHit;
    }

    public void setDirHit(int dirHit) {
        this.dirHit = dirHit;
    }

    @Override
    public String toString()
    {
        String description = (getName() + " [" + getRarity() + "] (" + getValue() + ") - "
         + getCritHit() + " Critical Hit / " + getDetermination() + " Determination / "
         + getDirHit() + " Direct Hit");
        return description;
    }

    @Override
    public void compareTo(item item)
    {
        String conclusion = "";

        if (item instanceof gear)
        {
            int i1 = critHit + determination + dirHit;
            int i2 = (((gear) item).critHit) + (((gear) item).determination) + (((gear) item).dirHit);

            if (i1 > i2)
        {
            conclusion = " is better than ";
        }
        else if (i1 == i2)
        {
            conclusion = " is equal to ";
        }
        else
        {
            conclusion = " is worse than ";
        }
        }
        else
        {
            if (this.getValue() > item.getValue())
            {
                conclusion = " is better than ";
            }
            else if (this.getValue() == item.getValue())
            {
                conclusion = " is equal to ";
            }
            else
            {
                conclusion = " is worse than ";
            }
        }
        System.out.println(toString() + conclusion + item.toString());
    }
    
}
