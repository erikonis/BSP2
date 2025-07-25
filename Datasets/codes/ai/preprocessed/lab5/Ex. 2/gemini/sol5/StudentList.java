import java.util.Arrays;

public class StudentList {
    private String[] names;
    private int count;
    private int maxCapacity;

    public StudentList(int capacity) {
        if (capacity > 0) {
            this.maxCapacity = Math.min(capacity, 15);
            this.names = new String[this.maxCapacity];
            this.count = 0;
        } else {
            System.out.println("Error: Invalid capacity. Student list not initialized.");
        }
    }

    public boolean add(String fullName) {
        if (count < maxCapacity) {
            names[count++] = fullName;
            System.out.println("Student " + fullName + " added successfully.");
            return true;
        } else {
            System.out.println("Warning: Student list is full. Cannot add " + fullName + ".");
            return false;
        }
    }

    public boolean remove(String fullName) {
        int index = find(fullName);
        if (index != -1) {
            names[index] = null;
            for (int i = index; i < count - 1; i++) {
                names[i] = names[i + 1];
            }
            names[count - 1] = null;
            count--;
            System.out.println("Student " + fullName + " removed successfully.");
            return true;
        } else {
            System.out.println("Error: Student " + fullName + " not found.");
            return false;
        }
    }

    public int find(String fullName) {
        for (int i = 0; i < count; i++) {
            if (names[i] != null && names[i].equals(fullName)) {
                return i;
            }
        }
        return -1;
    }

    public void displayList() {
        if (count > 0) {
            System.out.println("Registered Students (" + count + "/" + maxCapacity + "):");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + names[i]);
            }
        } else {
            System.out.println("No students registered.");
        }
    }

    public void clearList() {
        Arrays.fill(names, null);
        count = 0;
        System.out.println("All students removed.");
    }

    public int getCount() {
        return count;
    }
}