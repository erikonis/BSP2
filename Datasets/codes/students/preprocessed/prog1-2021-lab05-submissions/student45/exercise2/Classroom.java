/**
 * Classroom
 */
public class Classroom {

    private String[] students;

    private int counter;

    public Classroom (int size)
    {
        counter = 0;
        students = new String[size];       
    }

    public void add(String name)
    {
        if(counter<=students.length-1&&students[counter]==null){
            students[counter]=name;
            counter++;
        }
        else System.out.println("not enough space");
    }

    public void remove(String name)
    {
        if(search(name)!=-1)
        {
            int i = search(name);
            students[search(name)] = null;
            for(int j = i; j<counter;j++)
            {
                students[j]=students[j+1];
            }
            students[counter] = null;
        }
    }

    public int search(String name)
    {
        for(int i=0;i<students.length;i++)
        {
            if(students[i].equals(name)) return i;
        }
        return -1;
    }

    public void report()
    {
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i]);
        }
    }

    public void removeall()
    {
        for(int i=0;i<students.length;i++)
        {
            students[i] = null;
        }
        counter = 0;
    }

}