package lu.uni.programming1.lab7.exercise4;

public class AgeFilter extends Filter {
    private int min = -1;
    private int max = -1;


    public AgeFilter(String condition)  {
        if(condition.equals("junior")) {
            min = 18;
            max = 28;
        }else if(condition.equals("middle")) {
            min = 28;
            max = 55;
        }else if(condition.equals("senior")) {
            min = 55;
            max = Integer.MAX_VALUE; // If humans live longer in the future
        }else{
            System.out.println("ERROR: INVALID CRITERIA");
        }
    }

    // Basically the same concept as BooleanFilter but in one method
    public Person[] applyFilter(Person[] people){
        Person[] tempArr = new Person[people.length];
        int meetCrit = 0;
        for(int i = 0; i < people.length; i++) {
            if(people[i].getAge() >= min && people[i].getAge() < max) {
                tempArr[meetCrit] = people[i];
                meetCrit++;
            }
        }
        Person[] filtered = new Person[meetCrit];
        for(int j = 0; j < filtered.length; j++) {
            filtered[j] = tempArr[j];
        }
        return filtered;
    }
}
