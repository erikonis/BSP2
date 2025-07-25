package lu.uni.programming1.lab9.exercise1;

import java.util.ArrayList;

public class Inventory {
    private String content = "";
    private String text = "";

    ArrayList<Items> alItem = new ArrayList<>();
    Items item;
    private int capacity;

    public Inventory(int capacity){
        this.capacity = capacity;
    }

    public boolean add(Items item){
        if(alItem.size() < capacity){
            alItem.add(item);
            text += "\n Added item to inventory; " + item.toString();
            return true;
        }
        return false;
    }

    public int drop(Items item){
        String additive = "";
        int cnt = 0;
        for(int i=0; i<alItem.size(); i++){
            if(alItem.get(i).equals(item)){
                additive = alItem.get(i).toString();
                alItem.remove(i);
                cnt++;
            }
        }
        text += "\n Dropped " + cnt + " instances of item: " + additive;
        return cnt;
    }

    public boolean drop(int index){
        if(index >= alItem.size() || index < 0){ //assuming that we give the indexes from 0 above
            return false;
        }else{ 
            text += "\n Removed the item: " + alItem.get(index).toString();
            alItem.remove(index);
            return true;
        }
    }

    public void use(int index){
        if(index >= alItem.size() || index < 0){
            return;
        }else if(alItem.get(index) instanceof Usable){
            alItem.get(index).use();
            if(alItem.get(index).getCharge() >= 0){
            text += "\n Used the item " + alItem.get(index).getName() + ". (" + alItem.get(index).getCharge() + " charges left)";
            }else{
                alItem.remove(index);
                text += "\n The item " + alItem.get(index).getName() + " has no charges left and has been removed!";
            }
        }else{
            text += "\n The item " + alItem.get(index).getName() + " can not be used!";
        }
    }

    public boolean sell(int index){
        String additive = "";
        if(index >= alItem.size() || index < 0){
            return false;
        }else{
            additive = alItem.get(index).toString();
            if(alItem.get(index) instanceof Sellable){
                text += "\n Sold the item: " + alItem.get(index).toString();
                alItem.remove(index);
                return true;
            }else{
                text += "\n The following item cannot be sold: " + additive;
            }
        }
        return false;
    }

    public Items getItem() {
        return item;
    }

    public void setItem(Items item) {
        this.item = item;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String toString(){
        for(int i=0; i<alItem.size(); i++){
            content += "\n {" + i + "} " + alItem.get(i).toString();
        }
        System.out.println("------------------------------------");
        return text + "\n Inventory (" + alItem.size() + ")" + content;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((alItem == null) ? 0 : alItem.hashCode());
        result = prime * result + ((item == null) ? 0 : item.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Inventory other = (Inventory) obj;
        if (alItem == null) {
            if (other.alItem != null)
                return false;
        } else if (!alItem.equals(other.alItem))
            return false;
        if (item == null) {
            if (other.item != null)
                return false;
        } else if (!item.equals(other.item))
            return false;
        return true;
    }

}
