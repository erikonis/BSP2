public class Item {

    public enum Rarity{
        WHITE,
        PINK,
        GREEN,
        BLUE,
        PURPLE;



    

        Rarity(){
            
            
        }
        
        
    }

    private String name;
    private int value;
    private Rarity rarity;
    private int charge;

    public Item(String name, int value, Rarity rarity){
        this.name = name;
        this.value = value;
        this.rarity = rarity;
    } 

    public Item(){

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

    public void use(){

    }

    public int getCharge(){
        return charge;
    }


  


   // @Override
    public String toString(){
       return rarity + " " + name + " (" + value + " Gold)";
    }

}
