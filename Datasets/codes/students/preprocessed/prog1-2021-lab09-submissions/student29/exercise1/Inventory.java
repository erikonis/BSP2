import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class Inventory {
    private ArrayList<Items> ItemList;
    private int nextComponent;
    private int nrOfComponents;

    public Inventory(int nrOfComponents_) {
        ItemList = new ArrayList<Items>();
        nextComponent = 0;
        this.nrOfComponents = nrOfComponents_;
    }

    public ArrayList<Items> getItemList() {
        return ItemList;
    }

    public void setItemList(ArrayList<Items> itemList) {
        ItemList = itemList;
    }

    public int getNrOfComponents() {
		return nrOfComponents;
	}
	





    public void setNrOfComponents(int nrOfComponents) {
        this.nrOfComponents = nrOfComponents;
    }

    public boolean add(Items item) {
        if (nextComponent > getNrOfComponents(){
            System.err.println("cannot add more items ...");
			return false;
        }
        else{
            getItemList().add(item);
            nextComponent++;
            return true;
        }
		if (item == null) {
			System.err.println("cannot add 'null' item ...");
			return false;
		}
	}
	

    

    
}
