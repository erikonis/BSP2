public class Student {
     public static void main(String[] args) {
        
    }
    // store the students
    String[][] student; 
	// number of students added
    int counter; 

    public Student() {
        // there can be a maximum of 15 students: student number and names are stored for each student
        student = new String[15][2];
		
		// when the object is initialized, the size of this counter is 0
        counter = 0; 
    }

    // this function stores the student's number and name in the Student array
    public void storeStudents(String number, String name) {

        // if counter is less than maximum 15 students, then store the student
        if (counter < 15) {
            student[counter][0] = number;       // student's number
            student[counter][1] = name;         // student's name

            // increase the counter by 1
            counter += 1;
        }
    }

    // remove the student record from the student array based on the number provided
    public void removeStudent(String number) {
        // iterate though the array and find the student with the number
        for (int i = 0; i < counter; i++) {
            if (student[i][0].equals(number)) {
                // shift all the students to the left
                for (int j = i; j < counter - 1; j++) {
                    student[j] = student[j + 1];
                }

                // decrease the counter
                counter -= 1;

                // break the loop
                break;
            }
        }
    }


    // Print the elements in the student array
    public void printStudents() {
        // Table headers
        System.out.printf("%-5s%-10s%-10s%n", "ID", "Number", "Name");
        // iterate through the array and print all student information
        for (int i = 0; i < counter; i++) {
            System.out.printf("%-5d%-10s%-10s%n", (i + 1), student[i][0], student[i][1]);
        }
    }

    // Returns the numbers of students added
    public int getcounter() {
        return counter;
    }
}
}
