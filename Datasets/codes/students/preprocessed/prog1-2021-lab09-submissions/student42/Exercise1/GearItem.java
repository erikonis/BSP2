public class GearItem extends Item{

    private int crit_hit,determin,direct_hit;



    public int getCrit_hit() {
        return crit_hit;
    }


    public int getDetermin() {
        return determin;
    }

    public int getDirect_hit() {
        return direct_hit;
    }


    public GearItem(String name, int value, Rarity rarity,int crit_hit, int determin,
            int direct_hit) {
     super(name, value, rarity);
        this.crit_hit = Math.max(crit_hit, 0);
        this.determin = Math.max(determin,0);
        this.direct_hit = Math.max(direct_hit,0);
      
    }
    
  
    public int compareTo(GearItem item)
    {return (this.crit_hit+this.determin+this.direct_hit)-(item.getCrit_hit()+item.getDetermin()+item.getDirect_hit());
        }

    @Override
    public String toString()
    { return super.toString()+" - "+crit_hit+" Critical Hit / "+ determin
+" Determination / "+ direct_hit+" Direct Hit";    }
}

