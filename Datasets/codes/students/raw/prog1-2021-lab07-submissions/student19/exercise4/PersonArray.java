package exercise4;

import java.util.Date;

public class PersonArray extends Filters {
    private Person[] array;
    private Date date = new Date();

    public PersonArray() {
        array = new Person[10];
    }

    public void add(Person p) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = p;
            }
        }
    }

    // Did not manage to complete exercise, so program wont work correctly

    @Override
    public String lecturer() {
        String names = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].isteacher()) {
                names += array[i].getName();
            }
        }
        return names;
    }

    @Override
    public String student() {
        String names = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].isStudies()) {
                names += array[i].getName();
            }
        }
        return names;
    }

    @Override
    public String TA() {
        String names = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].isStudies() && array[i].isteacher()) {
                names += array[i].getName() + "; ";
            }
        }
        return names;
    }

    @Override
    public String junior() {
        String names = "";
        /*
         * for (int i = 0; i < array.length; i++) { int year= array[i].getYear();
         * if(date.after(new Date)){ names += array[i].getName() + "; "; } }
         */
        return names;
    }

    @Override
    public String middle() {
        String names = "";
        /*
         * for (int i = 0; i < array.length; i++) { if(array[i].isteacher()){ names +=
         * array[i].getName(); } }
         */
        return names;
    }

    @Override
    public String senior() {
        String names = "";
        /*
         * for (int i = 0; i < array.length; i++) { if(array[i].isteacher()){ names +=
         * array[i].getName(); } }
         */
        return names;
    }

}
