package Exercise4;

public abstract class FilterTemplate {
    //what sould every filter have

    Person per[];
    Person result[];
    
    public FilterTemplate(Person person[]) {
    
        per = person;
    }
    public void check(){

    }
    public Person[] getResult() {
        return result;
    }    
}
