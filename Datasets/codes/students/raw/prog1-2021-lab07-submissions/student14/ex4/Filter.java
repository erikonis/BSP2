import java.util.ArrayList;

public abstract class Filter {
    private String name;

    public Filter(String name) {
        this.name = name;
    }

    public abstract ArrayList<Person> adaptArray(ArrayList<Person> array, int v1, int v2);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printArray(ArrayList<Person> array) {
        System.out.println(name + ": [ ");
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) != null) {
                System.out.println(array.get(i).toString());
            }
        }
        System.out.println("]");
    }
}
