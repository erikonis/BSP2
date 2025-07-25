import java.util.ArrayList;

public class Senior extends Filter {
    public Senior(String name) {
        super(name);
    }

    public boolean isJunior(int year, int month, int date, int minAge, int maxAge) {
        boolean test = false;
        int yearCheck = 2021-year;

        if(month<11){
            yearCheck++;
        } else if(month == 11 && date < 21){
            yearCheck++;
        }

        if(yearCheck>=maxAge){
            test = true;
        } 

        return test;
    }

    @Override
    public ArrayList<Person> adaptArray(ArrayList<Person> array, int v1, int v2) {
        ArrayList<Person> temp = new ArrayList<Person>();
        for (int i = 0; i < array.size(); i++) {
            temp.add(array.get(i));
        }

        for (int i = temp.size() - 1; i >= 0; i--) {
            if (!isJunior(temp.get(i).getBirthYear(), temp.get(i).getBirthMonth(), 
            temp.get(i).getBirthDay(), v1, v2)) {
                temp.remove(i);
            }
        }
        return temp;
    }
}
