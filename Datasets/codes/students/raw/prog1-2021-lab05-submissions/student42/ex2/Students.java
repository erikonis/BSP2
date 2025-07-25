package lu.uni.programming1.lab5.ex2;

public class Students {
    private String names[]; // represents the list of names to be managed by the class
    private int counter; // represents the number of elements present in the list

    public String[] getNames() {
        return names;
    }

    public Students(int n) {
        /*
         * The moment the object is created the counter is initialized with 0 and the
         * array with the size provided in input by the user.
         */
        counter = 0;
        names = new String[n];
    }

    public Students() {
        this(15);
    }

    public void add(String name) {
        if (counter == names.length) {
            System.out.println("you reach the maximum, you can not add anymore");
        } else {
            names[counter] = name;
            counter++;
        }
    }

    public void remove(String name) {
        // Step 1: search name (if exists)
        if (this.contains(name)) {
            for (int i = 0; i < counter; i++) {
                if (names[i] == name) {
                    // Step 2: remove the name
                    names[i] = null;

                    // Step 3: Shift the following ones ( if there is any)
                    for (int j = i + 1; j < counter; j++) {
                        names[j - 1] = names[j];
                    }

                    // Step 4: Remove the last element
                    names[counter - 1] = null;

                    // Step5: Decrement counter
                    counter--;
                    System.out.println(name + " deleted from the list!");
                }
            }
        }
    }

    public boolean contains(String name) {
        boolean found = false;
        for (int i = 0; i < counter; i++) {
            if (names[i].equals(name)) {
                found = true;
                break;
            }
        }
        System.out.println("Is " + name + " in the list: " + found);
        return found;
    }

    // Empty the list and counter is 0.
    public void cleanList() {
        names = new String[names.length];
        counter = 0;
        System.out.println("List is empty...");
    }

    // Print all the students in the list.
    public void printList() {
        for (int i = 0; i < counter; i++) {
            System.out.println("Names[" + i + "]" + names[i]);
        }
        System.out.println("--------------------------");
    }
}