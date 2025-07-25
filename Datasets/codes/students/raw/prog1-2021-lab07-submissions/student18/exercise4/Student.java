public class Student extends Filter{
    
    public Student() {
        super("Student");
    }

    public boolean matchesFilter(Person person){
        if(person.isStudent()){
            return true;
        }
        else{
            return false;
        }
    }
}
