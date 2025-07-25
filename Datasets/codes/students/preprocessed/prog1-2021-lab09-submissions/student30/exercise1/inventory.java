import java.util.LinkedList;
import java.util.List;

public class inventory {
    items item;
    int i = 0;
    int inventory = 1000;// max capacity of items
    List<items> allitems = new LinkedList<items>();

    public void printinv(items item) {
        if (item.getTypes() == types.GEAR) {

            System.out.println(
                    "{" + i + "}" + " [" + item.getRarity() + "] " + item.getName() + " (" + item.getCost() + " Gold) "
                            + item.getCritical_hit() + " Critical Hit / " + item.getDetermination()
                            + " Determination / "
                            + item.getDirect_hit() + " Direct hit");

        } else if (item.getTypes() == types.CONSUMABLE) {
            System.out.println(
                    "{" + i + "}" + " [" + item.getRarity() + "] " + item.getName() + " (" + item.getCost() + " Gold)");
        } else {
            System.out.println(
                    "{" + i + "}" + " [" + item.getRarity() + "] " + item.getName() + " (" + item.getCost() + " Gold)");
        }

        i++;
    }

    public List<items> getAllitems() {
        return allitems;
    }

    boolean add(items item) {
        allitems.add(item);

        return true;
    }

    int drop(items item) {
        allitems.remove(item);
        return 0;
    }

    boolean drop(int index) {

        return true;
    }

    void use(int index) {
        System.out.println("The item " + allitems.get(index).getName() + "is used.");
    }

    boolean sell(int index) {

        return true;
    }
}
