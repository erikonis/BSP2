package Exercise2;

public class StudentList {

    private Student[] studentList;
    private int n;

    public StudentList(int size)
    {
        studentList= new Student[size];
        this.n=0;
    }

    public boolean add(Student s)
    {
        if(n<studentList.length)
        {
            studentList[n]= s;
            n++;
            return true;
        }
        System.out.println("Error! No more space left!");
        return false;
    }

    public boolean remove(Student s)
    {
        for(int i=0; i< n; i++)
        {
            if(studentList[i].equals(s))
            {
                studentList[i]=null;
                while(i<n-1)
                {
                    studentList[i]=studentList[i+1];
                    studentList[i+1]=null;
                    i++;
                }
                Student[] newList= new Student[studentList.length];
                int j=0;
                while(studentList[j]!=null)
                {
                    newList[j]=studentList[j];
                    j++;
                }
                studentList= newList;   
                n--;
                return true;
            }
        }
        return false;
    }

    public void search(Student s)
    {
        boolean found=false;
        for(int i=0; i< n; i++)
        {
            if(studentList[i].equals(s))
            {
                System.out.println("Student found at index: " + i);
                found=true;
            }
        }   
        if(found==false)
        {
            System.out.println("Student not found!");
        }
    }

    public void report()
    {
        for(int i=0; i< n; i++)
        {
            System.out.println(studentList[i]);
        }
    }

    public boolean removeAll()
    {
        studentList=new Student[studentList.length];
        return true;
    }
}
