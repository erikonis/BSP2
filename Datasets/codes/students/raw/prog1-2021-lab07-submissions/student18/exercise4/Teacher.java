public class Teacher extends Filter{

    public Teacher() {
        super("Teacher");
    }

    public boolean matchesFilter(Person person){
        if(person.isTeacher()){
            return true;
        }
        else{
            return false;
        }
    }
}
