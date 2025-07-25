public class PersonsInSchool extends Person{

   private boolean student; 
   private boolean teacher;

    public PersonsInSchool(String name, int yearBirth, int monthBirth, int dayBirth, boolean Student_, boolean teacher_)
    {
       super(name, yearBirth, monthBirth, dayBirth);
       this.teacher = teacher_;
       this.student = Student_;
    }

    public boolean getstudent() {
      return student;
    }

    public boolean getteacher() {
      return teacher;
    }

    public String getDescription()
    {
       return "teacher: " + teacher + " student: " + student;
    } 

    
}
