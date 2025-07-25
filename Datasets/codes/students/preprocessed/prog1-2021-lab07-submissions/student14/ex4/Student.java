import java.util.ArrayList;

public class Student extends Filter {

    public Student(String name) {
        super(name);
    }

    @Override
    public ArrayList<Person> adaptArray(ArrayList<Person> array, int v1, int v2) {
        ArrayList<Person> temp = new ArrayList<Person>();
        for (int i = 0; i < array.size(); i++) {
            temp.add(array.get(i));
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            if (!temp.get(i).isStudies()||temp.get(i).isTeaches()) {
                temp.remove(i);
            }
        }
        return temp;
    }
}
