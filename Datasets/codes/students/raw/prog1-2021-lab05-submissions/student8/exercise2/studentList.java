package lu.uni.programming1.lab5.exercise2;

import java.util.Scanner;

public class studentList {
    private int counter, maxStudents;
    private String[] array;

    public studentList() {
        this.counter = 0;
        Scanner scann = new Scanner(System.in);
        System.out.println("Maxium number of students:");
        this.maxStudents = scann.nextInt();
        this.array = new String[this.maxStudents];
        scann.close();
    }

    public void addStudent(String newStudent) {
        if (counter >= maxStudents) {
            System.out.println("Student list is full");
        } else {
            array[counter] = newStudent;
            counter++;
        }
    }

    public void report() {
        System.out.println("This is the list of current students: ");
        for (int i = 0; i < counter; i++) {
            System.out.println(array[i]);
        }
    }

    public int search(String searchStudent) {
        int returnValue = -1;

        for (int i = 0; i < counter; i++) {
            if (array[i] == searchStudent) {
                returnValue = i;
            }
        }
        return returnValue;
    }

    public void remove(String removeStudent) {
        int removedIndex = search(removeStudent);
        if (removedIndex > 0) {
            array[removedIndex] = null;
            for (int i = removedIndex; i < counter - 1; i++) {
                array[i] = array[i + 1];
            }
            counter--;
        } else {
            System.out.println("This student is not in our list to remove!!");
        }
    }

    public void removeAll() {
        this.counter = 0;
    }
}