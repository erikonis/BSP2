public class Students {
    //array and integer
    private Student[] listOfStudents;
    private int count = 0;
    //
    public Students(int size) {
        listOfStudents = new Student[size];
        for (int i = 0; i < listOfStudents.length; i++) {
            listOfStudents[i] = new Student("","");
        }
    }
    // to add a student
    public void add(Student student){
        //you can add
        if(listOfStudents.length>count)
        {
            listOfStudents[count] = student;
            count++;
        } 
        //you can't add anymore
        else{
            System.out.println("Full");
        }
    }
    //to search after a student
    public int search(Student student){
        int position = -1;
        for (int i = 0; i <= count; i++) {
            if (listOfStudents[i].getFirstName().equals(student.getFirstName()) && listOfStudents[i].getLastName().equals(student.getLastName())) {
                position=i;
            }
        }
        return position;
    }
    //to remove a student
    public void remove(Student student){
        int deleteAt = search(student);
        if (deleteAt!=(-1)) {
            listOfStudents[deleteAt]=null;
            for (int i = deleteAt; i <= count; i++) {
                Student temp = listOfStudents[i];
                listOfStudents[i] = listOfStudents[i+1];
                listOfStudents[i+1] = temp;
            }
            listOfStudents[count] = new Student("","");
            count--;
        } else {
            System.out.println("There is no student with that name in the list!");
        }
    }
    // for the report
    public void report(){
        for (int i = 0; i < count; i++) {
            System.out.println(listOfStudents[i].toString());
        }
    }
    // to remove all students in the list
    //decrement the counter to 0
    public void removeAll(){
        listOfStudents = new Student[listOfStudents.length];
        for (int i = 0; i < listOfStudents.length; i++) {
            listOfStudents[i] = new Student("","");
        }
        count = 0;
    }
}
