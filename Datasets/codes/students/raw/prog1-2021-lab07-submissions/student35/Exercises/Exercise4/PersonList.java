package Exercises.Exercise4;

public class PersonList {
    protected Person[] arPerson;
    protected int size;

    public PersonList(int pSize)
    {
        arPerson = new Person[pSize];
        size = pSize;
    }

    public void add(Person p)
    {
        for (int i = 0; i < size; i++) 
        {
            if(arPerson[i] == null)
            {
                arPerson[i] = p;
                return;
            }
        }
        System.out.println("The list is full!");
    }

    public void delete(int index)
    {
        int find = index;

        for (int i = 0; i < size; i++) 
        {
            if(i == find)
            {
                arPerson[i] = null;
            }

            if(i != 0 && arPerson[i-1] == null)
            {
                Person tmp = arPerson[i-1];
                arPerson[i-1] = arPerson[i];
                arPerson[i] = tmp;
            }
        }
    }

    public int search(Person p)
    {
        for (int i = 0; i < size; i++)
        {
            if(arPerson[i] == p)
            {
                return i;
            }
        }
        System.out.println("There is no such person in the list!");
        return -1;
    }
}
