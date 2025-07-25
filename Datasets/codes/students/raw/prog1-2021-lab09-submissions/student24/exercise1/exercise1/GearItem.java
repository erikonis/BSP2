package lu.uni.programming1.lab9.exercise1;

//child class of parent class Item
public class GearItem extends Item implements Comparable<Item>{
    int critical_hit,determination,direct_hit;//instance variables


    //constructor
    public GearItem(String name, double value, Rarity rarity, int critical_hit, int determination, int direct_hit) {
        super(name, value, rarity);
        this.critical_hit = critical_hit;
        this.determination = determination;
        this.direct_hit = direct_hit;
    }

    //overriding use function to define custom use
    @Override
    public void use() {

    }


    //overriding showStats () function for displaying stats

    @Override
    public String showStats(){
        return "[" +rarity+"] " + name  + " (" + value + " Gold) - " + critical_hit + " Critical Hit / " + determination + " Determination / " + direct_hit + " Diret Hit";
    }


    //overriding compareTo to have custom comparision
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
