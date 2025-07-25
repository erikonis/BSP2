
public class PersonList
{
    private Person[] arPerson;
    private int size;

    public PersonList(int pS)
    {
        size = pS;
        arPerson = new Person[size];
    }

    public void add(Person p)
    {
        for (int i = 0; i < size ; i++)
        {
            if(arPerson[i] == null)
            {
                arPerson[i] = p;
                System.out.println("Person succesfully added!");
                return;
            }
        }
        System.out.println("The list is full!");
    }

    public int search(Person p)
    {
        for (int i = 0; i < size; i++)
        {
            if(arPerson[i] != null && p.getPassportNumber() == arPerson[i].getPassportNumber())
            {
                return i;
            }
        }
        System.out.println("This person is currently not in our system");
        return -1;
    }

    public void remove(Person p)
    {
        int found = search(p);

        for (int i = 0; i < size; i++)
        {
            if(found == i)
            {
                arPerson[i] = null;
            }
        }
    }

    public void clear()
    {
        arPerson = new Person[size];
    }

    public String printList()
    {
        String list = "";

        for (int i = 0; i < size; i++)
        {
            if(arPerson[i] != null)
            {
                list += arPerson[i].getName();

                if(i != size-1 && arPerson[i+1] != null)
                {
                    list += ", ";
                }
            }
        }
        return list;
    }
}
