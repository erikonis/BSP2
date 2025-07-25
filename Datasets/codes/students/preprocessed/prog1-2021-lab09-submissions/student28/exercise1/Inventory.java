import java.util.ArrayList;

    public class Inventory {
    private int capacity;
    private ArrayList<Item> inv;

    public Inventory(int capacity) {
        this.capacity = capacity;
        inv = new ArrayList<>();
    }

    public boolean add(Item e) {
        if(inv.size()<capacity){
            if(e instanceof ConsumableItems){
                ConsumableItems c = (ConsumableItems)e;
                System.out.println("Added item to inventory: " + c.toString());
            }
            if(e instanceof GearItems){
                GearItems g = (GearItems)e;
                System.out.println("Added item to inventory: " + g.toString());
            }
            if(e instanceof TrashItems){
                TrashItems t = (TrashItems)e;
                System.out.println("Added item to inventory: " + t.toString());
            }
            return inv.add(e);
        }
        return false;
    }

    public boolean remove(int index) {
        if(inv.get(index) != null){
            inv.remove(index);
            return true;
        }
        return false;
    }

    public int search(String name) {
        int index = -1;
        for(int i = 0; i< inv.size();i++){
            if(inv.get(i).getName().equals(name)){
                index = i;
            }
        }
        return index;
        
    }
    public Item getItem(int index){
        return inv.get(index);
    }

    public int remove(Item e) {
        int counter = 0;
        for(int i = inv.size()-1; i>=0;i--){
            if(e.equals(inv.get(i))){
                inv.remove(inv.get(i));
                counter++;

            }
        }
        if(e instanceof ConsumableItems){
            ConsumableItems c = (ConsumableItems)e;
            System.out.println("Dropped " + counter + " instances of the item: " + c.toString());
        }
        if(e instanceof GearItems){
            GearItems g = (GearItems)e;
            System.out.println("Dropped " + counter + " instances of the item: " + g.toString());
        }
        if(e instanceof TrashItems){
            TrashItems t = (TrashItems)e;
            System.out.println("Dropped " + counter + " instances of the item: " + t.toString());
        }
        
        return counter;
    }

    public void use(int index){
        Object o = inv.get(index);
        if(o instanceof ConsumableItems){
            ConsumableItems c = (ConsumableItems)o;
            c.setCharges(c.getCharges()-1);;
            if(c.getCharges()== 0){
                System.out.println("Used item has no charges left and has been dropped " + c.toString());
                inv.remove(index);
            }
        }
        if(o instanceof GearItems){
            GearItems g = (GearItems)o;
            System.out.println("The gear item " + g.getName() + " can not be used");
        }
        if(o instanceof TrashItems){
            TrashItems t = (TrashItems)o;
            System.out.println("The trash item " + t.getName() + "can not be used");
        }

    }

    public boolean sell(int index){
    
        if(inv.get(index).getCost()>0 && inv.get(index) instanceof TrashItems ||inv.get(index).getCost()>0 && inv.get(index) instanceof ConsumableItems){
            System.out.println("Item sold: " + inv.get(index));
            inv.remove(index);
            return true;
        }
        else{
            if(inv.get(index) instanceof GearItems){
                System.out.println("The following item cannot be sold: " +inv.get(index) );
                return false;
            }
            else{
                //I think this is good to add because in some games the salesman do not buy Item of the cost 0
                System.out.println("You can not sell that it has no value for the salesman");
                return false;
            }
           
        }

    }
    public void sort(String order) {
        //order defines how to sort the list
        if(order.equals("descending")){
            for(int i = 0; i<inv.size();i++){
                for (int j = 0; j < inv.size(); j++) {
                    if(inv.get(i).getCost()>inv.get(j).getCost()){
                        Item tmp = inv.get(i);
                        inv.set(i, inv.get(j));
                        inv.set(j, tmp);
                    }
                }
            }
        }
        if(order.equals("ascending")){
            for(int i = 0; i<inv.size();i++){
                for (int j = 0; j < inv.size(); j++) {
                    if(inv.get(i).getCost()<inv.get(j).getCost()){
                        Item tmp = inv.get(i);
                        inv.set(i, inv.get(j));
                        inv.set(j, tmp);
                    }
                }
            }
        } 
        
        
    }
     
    @Override
    public String toString(){
        sort("descending");
        String list = "Inventory: (" + capacity +") \n"; 
        for (int i = 0; i < inv.size(); i++) {
            list += "{"+i+"} " + inv.get(i) +"\n";
        }
        return list;
    }
    
}
