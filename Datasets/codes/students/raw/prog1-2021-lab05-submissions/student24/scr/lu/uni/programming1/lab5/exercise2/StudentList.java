package scr.lu.uni.programming1.lab5.exercise2;

public class StudentList {
    private int counter;
    private Student[] students;

    public StudentList(int size) {
        counter = 0;
        students = new Student[size];
    }

    public void add(Student s) {
        if (counter != students.length) {
            students[counter] = s;
            counter++;
        } else {
            System.out.println("No more space in classroom");
        }
    }

    public int search(String pFirstName, String pLastName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getFirstName().equals(pFirstName) && students[i].getLastName().equals(pLastName)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(String pFirstName, String pLastName) {
        int index = search(pFirstName, pLastName);
        if (index != -1) {
            students[index] = null;
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }
            students[students.length - 1] = null;
            counter--;
        }else{
            System.out.println("No such student on the list");
        }
    }

    public void removeAll() {
        students = new Student[students.length];
    }

    public void report() {
        for (Student student : students) {
            if (student == null) {
                System.out.println("Empty");
            } else {
                System.out.println(student);
            }
        }
    }

}
