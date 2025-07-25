package lu.uni.programming1.lab9.exercise1;

import java.util.Comparator;

public class NameComparator implements Comparator<Item> {

    @Override
    public int compare(Item i1, Item i2) {
        return i1.getName().compareTo(i2.getName());
    }
    
}
