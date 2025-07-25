package lu.uni.programming1.lab9.exercise1;

public class TrashItem extends Item{

    private String name;
    private int value;
    private Rarity rarity;
   

    public TrashItem(String name, int value, Rarity rarity){
        super (name,value,rarity);
        this.name = name;
        this.value = value;
        this.rarity = rarity;
       
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public void setRarity(Rarity rarity) {
        this.rarity = rarity;
    }

    @Override
    public void use(){
        System.out.println("The trash item " + name + " can not be used.");
    }

 

   @Override
    public String toString(){
        return "[" + rarity + "]" + " " + name + " (" + value + " Gold)";
    } 

    
}
