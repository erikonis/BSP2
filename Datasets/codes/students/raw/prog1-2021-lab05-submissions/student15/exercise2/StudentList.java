package exercise2;

public class StudentList {
    
    private int counter;
    private int size = 0;
    private int n=0;
    private String firstName = null;
    private String lastName = null; 

    private String[][] studentsnames = new String[size][2];
    int lastposition; 

    public StudentList(int size) {
        this.setSize(size);
        counter = 0;
        studentsnames = new String[size][2];
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public int getCounter() {
        return counter;
    }


    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getSize() {
        return size;
    }


    public void setSize(int size) {
        this.size = size;
    }

    public void add(String firstName,String lastName){
        if(counter <15){
            studentsnames[counter][0]=firstName;
            studentsnames[counter][1]=lastName;
            ++counter;
        }else{
            System.out.println("There is no space for new students.");
        }
    }

    public void remove(String firstName,String lastName){
        n=search(firstName,lastName);
        studentsnames[n][0]=null;
        studentsnames[n][1]=null;
        int l = size-1; 
        if(n!=size){ 
            for(int k=n;k<l;k++){
                studentsnames[k][0]=studentsnames[k+1][0];
                studentsnames[k][1]=studentsnames[k+1][1];
                lastposition=k+1; 
            }
            studentsnames[lastposition][0]=null;
            studentsnames[lastposition][1]=null;
        }
    }
    
    public int search(String firstName,String lastName){
        for (int i=0; i<size;++i) {
            if (firstName.equals(studentsnames[i][0]) == true) {
                if (lastName.equals(studentsnames[i][1]) == true) {
                    int n = i;
                    System.out.println("The name exists in the list and its location is "+n);
                }
        
            }        
        }
        return n;      
    }

    public void report(){
        for(int i=0; i<studentsnames.length;++i){
            System.out.println(studentsnames[i][0]+" "+studentsnames[i][1]);
        }
    }

    public void removeall(){
        for(int i=0; i<studentsnames.length;++i){
            studentsnames[i][0]=null;
            studentsnames[i][1]=null;
        }
    }
}
