
public class StudentList {

    private String[] students;

    int counter;
    int size;

    public StudentList(int mysize) {
        counter = 0;
        size = mysize;
        students = new String[mysize];}

    public void addS(String name) {
        if (counter >= size) {System.out.println("List is full !");}
        else{
        students[counter]=name;
        counter++;}
    } 

    public int search(String name) {
        for (int i = 0; i<size; i++) {
            if (students[i]==name) {
                return i;
            }
        }
        return -1;
    }

    public void removeS(String name) {
        if (search(name)>=0) {
            for (int i = search(name); i<size-search(name); i++) {
                if (i+1<size) {students[i] = students[i+1];}
                
            }
            students[students.length-1] = null;
            counter--;
        }
        else {System.out.println("Name not found !");}
    }

    public void reportS() {
        for (int i = 0; i<size; i++) {
            if (students[i]==null) {System.out.println("null");}
            else {System.out.println(students[i]);}
        }
    }

   public void removeAll() {
    for (int i = 0; i<students.length; i++) {
        students[i] = null;
     }
   }

}
