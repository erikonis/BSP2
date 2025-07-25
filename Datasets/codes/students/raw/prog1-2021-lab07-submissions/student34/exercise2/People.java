package exercise2;

public class People {
    private Person[] personList;
    private int counter = 0;

    public People(int size) {
        personList = new Person[size];
    }

    public void add(Person p) {
        if (counter < personList.length) {
            personList[counter] = p;
            System.out.println("Successfully added!");
            counter++;
        } else {
            System.out.println("There is no place for another Person!");
        }
    }

    public String lecturerFilter(){
        String tmp = "";
        for(int i=0;i<counter;i++){
            if(personList[i].isTeaches() && !personList[i].isStudies()){
                tmp+= personList[i].getName()+" ";
            }
        }
        return tmp;
    }

    public String studentFilter(){
        String tmp = "";
        for(int i=0;i<counter;i++){
            if(personList[i].isStudies() && !personList[i].isTeaches()){
                tmp+= personList[i].getName()+" ";
            }
        }
        return tmp;
    }

    public String taFilter(){
        String tmp = "";
        for(int i=0;i<counter;i++){
            if(personList[i].isStudies() && personList[i].isTeaches()){
                tmp+= personList[i].getName()+" ";
            }
        }
        return tmp;
    }

    public String juniorFilter(){
        String tmp = "";
        for(int i=0;i<counter;i++){
            if(personList[i].getAge()<28){
                tmp+= personList[i].getName()+" ";
            }
        }
        return tmp;
    }

    public String middleFilter(){
        String tmp = "";
        for(int i=0;i<counter;i++){
            if(personList[i].getAge()>=28 && personList[i].getAge()<55){
                tmp+= personList[i].getName()+" ";
            }
        }
        return tmp;
    }

    public String seniorFilter(){
        String tmp = "";
        for(int i=0;i<counter;i++){
            if(personList[i].getAge()>58){
                tmp+= personList[i].getName()+" ";
            }
        }
        return tmp;
    }
}
