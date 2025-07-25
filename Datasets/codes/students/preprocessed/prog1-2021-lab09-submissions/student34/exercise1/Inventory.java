public class Inventory {

    private Item[] inventory;
    private int needle;
    private int size;

    public Inventory(int size) {
        this.size=size;
        inventory = new Item[size];
        needle = 0;

    }

    public boolean add(Item item) {

        if (needle>=(inventory.length)) {
            return false;
        }
        else {
            inventory[needle]=item;
            needle++;
            return true;
        }

    }

    public boolean Drop(int index) { 
        if (inventory[index]!=null) {

            for (int i = 0 ; i < (size-index-1) ; i++) {
                inventory[index+i] = inventory[index+i+1];
            }
            inventory[inventory.length-1] = null;
            needle--;
            return true;
        }
        else {
            return false;
        }

    }

    public int Drop(Item item) {
        int num = 0;
        for (int i = 0 ; i < size ; i++) {
            if (inventory[i]!=null && inventory[i].equals(item)) {
                Drop(i);
                i--;
                num++;
            }
        }
        return num;

    }

    public void use(int index) {
        if (inventory[index]instanceof Consumable) {
            Consumable temp = (Consumable)inventory[index];
            temp.Use();
            if (temp.getCharges()==0) {
                Drop(index);
            }
            else {
                inventory[index]=temp;
            }
        }
        else {
            System.out.println("Not consumable !");
        }
    }

    public boolean sell(int index) {
        if (inventory[index]instanceof Trash || inventory[index]instanceof Consumable) {
            Drop(index);
            return true;
        }
        else {
            return false;
        }
    }

    public void print() {
        for (int i = 0 ; i < size ; i++) {
            if (inventory[i]!=null) {
            System.out.println(inventory[i]);
            }
            else {
                System.out.println("Empty slot.");
            }
        }
        
    }

    
}
