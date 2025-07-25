package lu.uni.programming1.lab9.exercise1;

public class Trash extends Item{
    
    public Trash(){

    }

    public Trash(Rarity rarity, String name, int value){
        super(rarity, name, value);
        
    }
    @Override
    public void use(){
        System.out.println("The trash item "+name+" can not be used.");
    }
    @Override
    public String toString() {
        return "["+rarity+"] "+name+" ("+value+" Gold)";
    }
}
