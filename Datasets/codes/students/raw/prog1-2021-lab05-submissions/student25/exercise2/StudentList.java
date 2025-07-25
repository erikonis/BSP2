package lu.uni.programming1.lab5.exercise2;

public class StudentList {

    private int numberOfStudents = 0;
    private int capacity;
    private String studentName;
    private String[] listOfNames;

    public StudentList(int capacity) {
        this.capacity = capacity;
        listOfNames = new String[capacity];
    }

    public void addStudent(String firstName, String lastName) {
        this.studentName = firstName + " " + lastName;
        if (placeLeft()) {
            listOfNames[numberOfStudents] = studentName;
            incrementStudents();
        } else {
            System.err.println("There is no place left for " + studentName);
        }

    }

    public void incrementStudents() {
        numberOfStudents += 1;
    }

    public void decrementStudents() {
        numberOfStudents -= 1;
    }

    public boolean placeLeft() {
        if (numberOfStudents < capacity) {
            return true;
        } else {
            return false;
        }
    }

    public void getNames() {
        for (int i = 0; i < listOfNames.length; i++) {
            System.out.println(listOfNames[i]);
        }
    }

    public void removeAllStudents() {
        for (int i = 0; i < listOfNames.length; i++) {
            listOfNames[i] = null;
        }
        numberOfStudents = 0;
    }

    public void removeStudent(int i) {
        listOfNames[i - 1] = null;
        for (int j = i; j < listOfNames.length; j++) {
            listOfNames[j - 1] = listOfNames[j];
        }
        listOfNames[capacity - 1] = null;
        decrementStudents();
    }

    public void showStudent(int i) {
        System.out.println(listOfNames[i - 1]);
    }

}
