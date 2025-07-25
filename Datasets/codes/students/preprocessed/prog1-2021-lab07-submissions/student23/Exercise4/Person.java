import java.time.LocalDate;

public class Person {
    
    //Attribues
    private String Name;
    private LocalDate Birthday;
    private boolean Studies;
    private boolean Teaches;
    public Person(String name, LocalDate birthday, boolean studies, boolean teaches) {
        Name = name;
        Birthday = birthday;
        Studies = studies;
        Teaches = teaches;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public LocalDate getBirthday() {
        return Birthday;
    }
    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }
    public boolean isStuding() {
        return Studies;
    }
    public void setStudies(boolean studies) {
        Studies = studies;
    }
    public boolean isTeaching() {
        return Teaches;
    }
    public void setTeaches(boolean teaches) {
        Teaches = teaches;
    }

    @Override
    public String toString(){
        String studies = "";
        String teaches = "";
        if(Studies == true){
            studies = "Yes";
        }
        else
        {
            studies = "No";
        }
        if(Teaches == true){
            teaches = "Yes";
        }
        else
        {
            teaches = "No";
        }
        return "Name: " + Name + " Birthday: " + Birthday + "Studies?: " + studies + "Teaches?:" + teaches;
    }

    
}
