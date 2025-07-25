public class StudentList {

    // Constructor

    public StudentList(int size) {
        students = new Student[size];
    }

    int i = 0;
    Student students[];

    // Method to add a student

    void addStudent(String firstName, String lastName) {
        Student s = new Student(firstName, lastName);
        students[i] = s;
        i++;
    }

    // Method to search for a student

    int lookForStudent(String first, String last) {
        for (int h = 0; h < i; h++) {
            if ((students[h].firstName.equals(first)) && (students[h].lastName.equals(last))) {
                System.out.println("Your student was found, line " + h + " inside the file. \n ");
                return h;
            }
        }
        System.out.println("We can't find your student. \n");
        return -1;
    }

    // Method to remove a student

    void rmOneStudent(String firstName, String lastName) {
        int h = this.lookForStudent(firstName, lastName);
        students[h] = null;

        if (h<(students.length-1)){
            do {
            students[h] = students[++h];
            } while (h < students.length-1);
        }
    
        students[students.length-1] = null;
        --i;
        System.out.println();
    }

    // Method to report a student

    void reportallStudents() {
        System.out.println("\n The list of the student :");
        for (int j = 0; j < i; j++) {
            System.out.println(students[j].firstName + " " + students[j].lastName);
        }
        System.out.println();
    }

    // Methode to remove all the student

    void getrmAllStudents() {
        students = new Student[students.length];
        i = 0;

    }

}
