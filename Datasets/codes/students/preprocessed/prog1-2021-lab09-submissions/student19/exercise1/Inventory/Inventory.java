import lu.uni.programming1.lab9.exercise1.Item.Item;
import lu.uni.programming1.lab9.exercise1.Item.Types.Consumable;
import lu.uni.programming1.lab9.exercise1.Item.Types.Trash;
import lu.uni.programming1.lab9.exercise1.Item.Types.Gear;

public class Inventory {
    private Item[] inv;

    public Inventory(int size) {this.inv = new Item[size];}
    public Inventory() {this.inv = new Item[20];}

    public boolean add(Item toAdd) {
        boolean added = false;

        for(int i = 0; i < this.inv.length; ++i) {
            if (this.inv[i] == null) {
                added = true;
                this.inv[i] = toAdd;
                break;
            }
        }

        return added;
    }

    public int drop(Item item) {
        int rm = 0;

        for(int i =0; i<this.inv.length; ++i){
            if (this.inv[i] != null) {
                if (this.inv[i].equals(item)) {
                    this.inv[i] = null;
                    rm += 1;
                }
            }
        }

        return rm;
    }

    public boolean drop(int idx) {
        boolean found = false;

        if (this.inv[idx] != null) {
            this.inv[idx] = null;
            found = true;
        }

        return found;
    }

    public String use(int idx) {
        String msg = "";

        if (this.inv[idx] != null && this.inv[idx] instanceof Consumable) {
            msg = this.inv[idx].use();

            if (this.inv[idx].getCharges() == 0) {
                this.drop(idx);
            }
        }
        return msg;
    }

    public boolean sell(int idx) {
        if (this.inv[idx] != null && this.inv[idx] instanceof Trash) {

            return true;
        } else {return false;}
    }


    @Override
    public String toString() {
        String msg = "";

        for(int i = 0; i < this.inv.length; ++i) {
            if (this.inv[i] != null) {
                msg += i + " :\n" + this.inv[i].toString()+"\n";
            } 
        }
        return msg;
    }

}