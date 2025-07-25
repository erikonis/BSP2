
public class GearItem extends Item implements Comparable<Item>{
    int critical_hit,determination,direct_hit;

    public GearItem(String name, double value, Rarity rarity, int critical_hit, int determination, int direct_hit) {
        super(name, value, rarity);
        this.critical_hit = critical_hit;
        this.determination = determination;
        this.direct_hit = direct_hit;
    }

    @Override
    public void use() {

    }



    @Override
    public String showStats(){
        return "[" +rarity+"] " + name  + " (" + value + " Gold) - " + critical_hit + " Critical Hit / " + determination + " Determination / " + direct_hit + " Diret Hit";
    }


    @Override
    public int compareTo(Item item) {
        if (item instanceof GearItem){
            GearItem o = (GearItem) item;
            int sum = critical_hit+determination+direct_hit;
            int sumo = o.critical_hit+o.determination+o.direct_hit;
            if (sum>sumo){
                return 1;
            }
            else if (sumo>sum){
                return -1;
            }
            else {
                return 0;
            }
        }else{
            return Double.compare(this.value,item.value);
        }
    }
}
