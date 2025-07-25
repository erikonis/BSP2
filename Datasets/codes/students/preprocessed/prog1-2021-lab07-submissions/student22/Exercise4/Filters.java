public class Filters{
    Person[] array;
    boolean teaches;
    boolean studies;
    
    Filters(Person[] array){
        this.array = array;
    }

    public void teaches(){
        for (int i = 0; i < 7; i++){
            teaches = array[i].getIfTeaches();
            if (teaches == true){
                String name = array[i].getName();
                System.out.println(name);
            }
        }
    }

    public void studies(){
        for (int i = 0; i < 7; i++){
            studies = array[i].getIfStudies();
            if (studies == true){
                String name = array[i].getName();
                System.out.println(name);
            }
        }
    }

    public void TA(){
        for (int i = 0; i < 7; i++){
            studies = array[i].getIfStudies();
            teaches = array[i].getIfTeaches();
            if (studies == true && teaches == true){
                String name = array[i].getName();
                System.out.println(name);
            }
        }
    }

    public void Junior(){
        for (int i = 0; i < 7; i++){
            int age = array[i].getAge();
            if (age < 28){
                String name = array[i].getName();
                System.out.println(name);
            }
        }
    }

    public void Middle(){
        for (int i = 0; i < 7; i++){
            int age = array[i].getAge();
            if (age >= 28 && age < 55){
                String name = array[i].getName();
                System.out.println(name);
            }
        }
    }

    public void Senior(){
        for (int i = 0; i < 7; i++){
            int age = array[i].getAge();
            if (age >= 55){
                String name = array[i].getName();
                System.out.println(name);
            }
        }
    }

    
}
