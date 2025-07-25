 public class Person{

private boolean Lecturer;
private boolean Teacher;
private int age;
private String Name;










public Person(String name,boolean lecturer, boolean teacher, int age) {
    Lecturer = lecturer;
    Teacher = teacher;
    this.age = age;
    Name = name;
}


public String getName() {
    return Name;
}


public boolean getLecturer() {
    return Lecturer;
}

public boolean getTeacher() {
    return Teacher;
}

public int getAge() {
    return age;
}



public void Seniorfilter(){

    if(age>=55){
    
        System.out.println("This person is a Senior and "+getAge()+" years old");}
    }
    

public void Middlefilter(){
    if (28<=age && age<55){
        System.out.println("This person in the category  Middle and "+getAge()+" years old");
    }

}

public void Juniorfilter(){
    if (18<=age && age<28){
        System.out.println("This person is a Junior and "+getAge()+" years old");
        
        
    }
}


public void TAfilter(){

    if(getLecturer()==true&&getTeacher()==true)
    System.out.println("This person is a TA");

}





public void Studentfilter(){
    if (getLecturer()==true && getTeacher()==false){
        System.out.println("This person is a Student");

    }


}
public void Teacherfilter(){

    if (getLecturer()==false && getTeacher()==true){
        System.out.println("This person is a Teacher");

    }
}
public void Test(){

Teacherfilter();
Studentfilter();
TAfilter();
Juniorfilter();
Middlefilter();
Seniorfilter();


}
}



    

