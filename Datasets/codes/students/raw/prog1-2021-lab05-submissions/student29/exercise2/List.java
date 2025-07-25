package lu.uni.programming1.lab5.exercise2;

public class List {
    private String list[];

    private int counter;

    List(int size) {
        this.counter = 0;
        this.list = new String[size];
    }

    public void add(String student) {
        if (counter < list.length) {
            list[counter] = student;
            counter += 1;
        } else {
            System.out.println("You cannot add a new student.\nThe maximum ammount of students (" + list.length + ") has been reached.");
        }
    }

    public void remove(String student) {
        boolean found = false;

        int index = search(student);
        if (index != -1) {
            found = true;
            list[index] = "null ";
        }

        
        
        for (int i = index; i < counter && found; i++) {
            //shifts the following names
            if (i < counter-1) {
                list[i] = list[i+1];
            }
            //removes last element
            else {
                list[i] = "null ";
            }
        }

        //decrements the counter if the student was found
        if (found) {
            counter -= 1;
        } else {
            System.out.println("The student " + student + " was not found.");
        }
    }

    public int search(String student) {
        //returns -1 if not found or index if found or if count == 0
        int index = -1;
        boolean found = false;

        if (counter != 0) {
            for (int i = 0; i < list.length && !found; i++) {
                if (!found && list[i].equals(student)) {
                    index = i;
                    found = true;
                }
            }
        }

        return index;
    }

    public void report() {
        for (int i = 0; i < list.length; i++) {
            System.out.println( i + " " + list[i]);
        }
    }

    public void removeAll() {
        for (int i = 0; i < list.length; i++) {
            list[i] = "null ";
        }
        counter = 0;
    }


}
