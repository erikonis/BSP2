package lu.uni.programming1.lab5.exercise2;


public class StudentList {
    private static String[] arStudentList;
    private static int counter;

    public StudentList() {
        arStudentList = new String[15];
        counter = 0;
    }

    public void add(String student){
        int i = 0;
        while(arStudentList[i]!=null && i<15){
            i++;
        }
        if(i<15){
            arStudentList[i] = student;
            counter++;
        }
        else{
            System.out.println("The list is full");
        }
    }

    public void remove(String student){
        int i = 0;
        while(arStudentList[i]!=student && arStudentList[i]!=null && i<15){
            i++;
        }
        if(i<15 && arStudentList[i]!=null){
            arStudentList[i]=null;
            for (int j = i; j < counter-1; j++) {
                arStudentList[j]= arStudentList[j+1];
            }
            counter--;
        }
        else{
            System.out.println("The list does not contain this student");
        }
    }

    public int size(){
        return counter;
    }

    public String get(int index){
        return arStudentList[index];
    }

    public void search(String student){
        int i = 0;
        while(arStudentList[i]!= student){
            if(arStudentList[i].isEmpty()){
                System.err.println("This student is not in the list !!");
            }
            else{
                i++;
            }
        }
        System.out.println("The student has been found at place "+i);
    }

    public void removeAll(){
        arStudentList = new String[15];
        counter=0;
    }

    public void print(){
        for (String string : arStudentList) {
            System.out.print(string+";");
        }
    }
    
}
