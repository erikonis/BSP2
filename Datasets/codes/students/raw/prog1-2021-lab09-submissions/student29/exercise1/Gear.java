package lu.uni.programming1.lab9.exercise1;

public class Gear extends Items{
    private int citical_hit;
    private int determination;
    private int direct_hit;

    public Gear(String name_, int value_, rarity rarity_, int citical_hit_,
            int determination_, int direct_hit_) {
        super(name_, value_, rarity_);
        this.citical_hit = citical_hit_;
        this.determination = determination_;
        this.direct_hit = direct_hit_;
    }

    public int getCitical_hit() {
        return citical_hit;
    }

    public void setCitical_hit(int citical_hit) {
        this.citical_hit = citical_hit;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getDirect_hit() {
        return direct_hit;
    }

    public void setDirect_hit(int direct_hit) {
        this.direct_hit = direct_hit;
    }

    
    
}
