package lu.uni.programming1.lab7.exercise4;

public class BooleanFilter extends Filter{
    private String condition;
    private int meetCrit = 0;

    public BooleanFilter(String condition) {
        this.condition = condition;
    }

    public Person[] applyFilter(Person[] people){
        Person[] tempArr = new Person[people.length];
        if(condition.equals("lecturer")) {      // Applies Lecturer Filter
            tempArr = lecturer(people);
        }else if(condition.equals("student")) {     // Applies Student Filter
            tempArr = student(people);
        }else if(condition.equals("ta")) {      // Applies TA Filter
            tempArr = ta(people);
        }
        else{
            System.out.println("ERROR: INVALID CRITERIA");
        }
        // Creates new filtered array with the size of the amount of people that meet the criteria
        Person[] filtered = new Person[meetCrit];
        // Fills final array with the people that meet the criteria to avoid null elements in array (get "cut" of)
        for(int j = 0; j < filtered.length; j++) {
            filtered[j] = tempArr[j];
        }
        return filtered;
    }

    public Person[] lecturer(Person[] people) {
        Person[] tempArr = new Person[people.length];
        meetCrit = 0;
        for(int i = 0; i < people.length; i++) {
            // Lecturer -> only teaches
            if(!people[i].isStudies() && people[i].isTeaches()){
                // To avoid shifting the elements to the left after this loop I keep track of the position the people need to be stored in with a counter meetCrit
                tempArr[meetCrit] = people[i];
                meetCrit++;
            }
        }
        return tempArr;
    }

    public Person[] student(Person[] people) {
        Person[] tempArr = new Person[people.length];
        meetCrit = 0;
        for(int i = 0; i < people.length; i++) {
            // Student -> only studies
            if(people[i].isStudies() && !people[i].isTeaches()){
                tempArr[meetCrit] = people[i];
                meetCrit++;
            }
        }
        return tempArr;
    }

    public Person[] ta(Person[] people) {
        Person[] tempArr = new Person[people.length];
        meetCrit = 0;
        for(int i = 0; i < people.length; i++) {
            // TA -> studies and teaches
            if(people[i].isStudies() && people[i].isTeaches()){
                tempArr[meetCrit] = people[i];
                meetCrit++;
            }
        }
        return tempArr;
    }
}
