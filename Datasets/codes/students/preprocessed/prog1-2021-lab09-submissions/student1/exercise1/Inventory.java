import java.util.ArrayList;

public class Inventory {

    private ArrayList <Item> itemarr;
    private int capacity;

    public Inventory(int capacity) {
        itemarr = new ArrayList <Item>();
        this.capacity = capacity;
    }

   public int getCapacity() {
       return capacity;
   }

    public boolean add (Item item) {
        if (itemarr.size() < capacity){
        itemarr.add(item);
        return true;
        }
        return false;
    }

    public int drop(Item item){
        int removeItems = 0;
        for(Item i: itemarr){
            if(i.equals(item)){
                itemarr.remove(item);
                removeItems++;
            }
        }
            return removeItems;
        }

    
    public boolean drop(int index){
        if(index < itemarr.size()){
            itemarr.remove(index);
            return true;
        }
        return false;
   
    }
    public void use (int index){
        if(index >= itemarr.size())
        return;
        //it asks for an empty constructor
        if(itemarr.get(index).getClass() == (new Consumable().getClass())){ //if the class of index is Consumable
        
            Consumable c = (Consumable) itemarr.get(index);
            c.use();
            itemarr.remove(index);

        }else if(itemarr.get(index).getClass() == (new Gear().getClass())){
            Gear g = (Gear) itemarr.get(index);
            g.use();
        }else if(itemarr.get(index).getClass() == (new Trash().getClass())){
            Trash t=(Trash) itemarr.get(index);
            t.use();
        }   
       
    }
    // public boolean sell(int index){
    //     for(Item i: itemarr){
    //         if(i.equals()){
    //             itemarr.remove(item);
    //             removeItems++;
    //         }
    
    //     return true;
    // }
}
