package exercise2;

public class StudentList {
    private String[] list;
    private int counter = 0;

    public StudentList(int size) {
        list = new String[size];
    }

    public String add(String name) {
        if (counter < list.length) {
            list[counter] = name;
            counter++;
            return "Student " + name + " added.";
        } else {
            return "There is no more space on this list.";
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < list.length) {
            list[index] = null;
            counter--;
        }
        for (int i = 0; i < list.length-1; i++) {
            if (list[i] == null) {
                list[i] = list[i + 1];
            }
            if (i != 0 ) {
                if (list[i] == list[i - 1] && i < list.length - 1) {
                    list[i] = list[i + 1];
                }
            }
        }

    }

    public int search(String name) {
        int found = -1;
        for (int i = counter - 1; i >= 0; i--) {
            if (list[i].equals(name)) {
                found = i;
            }
        }
        return found;
    }

    public String report() {
        String text = "";
        if (list == null) {
            return "The list is empty.";
        } else {
            for (int i = 0; i < counter; i++) {
                text += list[i];
                if (i == counter - 1) {
                    text += ".";
                } else {
                    text += ", ";
                }
            }
        }
        return text;
    }

    public String removeAll() {
        list = null;
        return "The list was deleted. Create a new one to add students.";
    }
}
