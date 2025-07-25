package Exercises.exercise2;



public class StudentList {

    private Student[] arStudent;
    private int size;
    private int counter =0;

    public StudentList(int pSize)
    {
        size = pSize;
        arStudent = new Student[pSize];
    }

    public void add(Student s)
    {
        if(size > counter)
        {
            arStudent[counter] = s;
            counter++;
        }
        else
        {
            System.out.println("The list is full!");
        }
    }

    public int search(Student s)
    {
        for (int i = 0; i < size; i++) {
            if(s.getFirstName().equals(arStudent[i].getFirstName())
            && s.getLastName().equals(arStudent[i].getLastName()))
            {
                return i;
            }
        }
        System.out.println("There is no such student in the list!");
        return -1;
    }

    public void remove(Student s)
    {
        int removeStudent = search(s);

        for (int i = 0; i < size; i++) {
            if(i == removeStudent)
            {
                arStudent[i] = null;

                if(i != 0 && arStudent[i-1] == null)
                {
                    Student tmp = arStudent[i-1];
                    arStudent[i-1] = arStudent[i];
                    arStudent[i] = tmp;
                }
                counter--;
            }
        }
    }

    public void removeAll()
    {
        arStudent = new Student[size];
        counter =0;
    }

    public void report(Student s)
    {
        int reportedStudent = search(s);

        for (int i = 0; i < size; i++) {
            if(i == reportedStudent)
            {
                System.out.println("The student " + s.getFirstName() + " " + s.getLastName() + " got reported!");
            }
        }
    }

    public String returnList()
    {
        String nameList = "";

        for (int i = 0; i < size; i++) 
        {    
            if(arStudent[i] != null)
            {
                if(i >0)
                {
                    nameList += ", ";
                }
                nameList += arStudent[i].toArray();
            }
            else
            {
                nameList += "";
            }
        }

        return nameList;
    }
}
