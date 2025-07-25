package lu.uni.programming1.lab7.exercise4;

public class filter {
    
    private PersonsInSchool people[];

    public filter(PersonsInSchool[] people) {
        this.people = people;
    }

    public void lecturerfilter(){   
        for (int i = 0; i < people.length; i++){
            if (people[i].getteacher() == true && people[i].getstudent() == false){
                System.out.println( people[i].getName());
        }

    }
    }
    public void studentfilter(){   
        for (int i = 0; i < people.length; i++){
            if (people[i].getteacher() == false && people[i].getstudent() == true){
                System.out.println( people[i].getName());
        }
    }

    }

    public void TAfilter(){   
        for (int i = 0; i < people.length; i++){
            if (people[i].getteacher() == true && people[i].getstudent() == true){
                System.out.println( people[i].getName());
        }
    }

    }

   
    public void juniorfilter(){  
        int currentyear = 2021; 
        for (int i = 0; i < people.length; i++){
            int old = currentyear - people[i].getyearBirth();
            if (old>=18&&old<28){
                System.out.println( people[i].getName());
        }

    }
    }

    public void middlefilter(){  
        int currentyear = 2021; 
        for (int i = 0; i < people.length; i++){
            int old = currentyear - people[i].getyearBirth();
            if (old>=28&&old<55){
                System.out.println( people[i].getName());
        }

    }
    }

    public void seniofilter(){  
        int currentyear = 2021; 
        for (int i = 0; i < people.length; i++){
            int old = currentyear - people[i].getyearBirth();
            if (old>=55){
                System.out.println( people[i].getName());
        }

    }
    }


    
}
