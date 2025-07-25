import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> items = new ArrayList<>();
    private int space;

    public Inventory(int space) {
        this.space = space;
    }

    public boolean add(Item item) {
        Boolean answer = false;
        if (items.size() < space) {
            items.add(item);
            answer = true;
            System.out.println(" Item added : "+item.toString());
        }
        else
        {
            System.out.println(" Sorry item cannot be added your Inventory is full!");
        }
        return answer;
    }

    public int drop(Item item) {
        int number = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).equals(item)) {
                items.remove(i);
                number += 1;
            }
        }
        return number;
    }

    public boolean drop(int index) {
        boolean answer = false;
        if (index < items.size()) {
            items.remove(index);
            answer = true;
            System.out.println(" The following item has ben dropped: "+items.get(index).toString());
        }
        return answer;
    }

    public void use(int index) {
        if (items.get(index).getClass().getName().equals("Consumable")) {

            if (items.get(index).use() != false) {
                items.get(index).use();

            } else {
                items.remove(index);
            }

        }
    }

    public boolean sell(int index) {
        boolean answer = false;
        Item selling = items.get(index);
        if (selling instanceof Sell) {
            items.remove(index);
            answer = true;
            System.out.println("Item sold:"+items.get(index).toString());

        }
        else
        {
            System.out.println("The following item cannot be sold:"+items.get(index).toString());
        }
        return answer;
    }

    public void sortName(String sorting) {
        if (sorting.equals("ascending")) {
            for (int i = 0; i < items.size() - 1; i++) {
                Item max = items.get(i);
                for (int j = i + 1; j < items.size(); j++) {
                    if (max.getName().compareTo(items.get(j).getName()) < 0) {
                        max = items.get(j);
                        items.set(j, items.get(i));
                        items.set(i, max);
                    }
                }
            }
        }

        if (sorting.equals("descending")) {
            for (int i = 0; i < items.size() - 1; i++) {
                Item min = items.get(i);
                for (int j = i + 1; j < items.size(); j++) {
                    if (min.getName().compareTo(items.get(j).getName()) > 0) {
                        min = items.get(j);
                        items.set(j, items.get(i));
                        items.set(i, min);
                    }
                }
            }
        }
    }

    public void sortValue(String sorting)
    {
        if (sorting.equals("ascending")) {
            for (int i = 0; i < items.size() - 1; i++) {
                Item max = items.get(i);
                for (int j = i + 1; j < items.size(); j++) {
                    if (max.getValue()<items.get(j).getValue()) {
                        max = items.get(j);
                        items.set(j, items.get(i));
                        items.set(i, max);
                    }
                }
            }
        }

        if (sorting.equals("descending")) {
            for (int i = 0; i < items.size() - 1; i++) {
                Item min = items.get(i);
                for (int j = i + 1; j < items.size(); j++) {
                    if (min.getValue()>items.get(j).getValue()) {
                        min = items.get(j);
                        items.set(j, items.get(i));
                        items.set(i, min);
                    }
                }
            }
        } 
    }

}
