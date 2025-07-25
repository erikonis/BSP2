public class Filter extends PersonList
{
    private Person[] modified;
    
    public Filter(int size) {
        super(size);
        modified = arPerson;
    }

    public void searchAgeCategory(int bottomAge, int maxAge)
    {
        Person[] arAgeCategory = new Person[size];
        Person[] arNew;
        int counter =0;

        for (int i = 0; i < size; i++)
        {
            if(modified[i] != null && modified[i].getYears() >= bottomAge
            && modified[i].getYears() <= maxAge)
            {
                arAgeCategory[counter] = modified[i];
                counter++;
            }
        }
        arNew = new Person[counter];
        arNew = arAgeCategory;
        String printedString = printArray(arNew);
        System.out.println(printedString);
        modified = new Person[counter];
        modified = arNew;
    }


    public void searchProffesion(boolean studies, boolean teaches)
    {
        Person[] arProfession = new Person[size];
        Person[] arNew;
        int counter =0;

        for (int i = 0; i < size; i++)
        {
            if(modified[i] != null 
            && modified[i].getTeaches() == teaches
            && modified[i].getStudies() == studies)
            {
                arProfession[counter] = modified[i];
                counter++;
            }
        }
        arNew = new Person[counter];
        arNew = arProfession;
        String printLec = printArray(arNew);

        System.out.println(printLec);
        modified = new Person[counter];
        modified = arNew;
    }

    private String printArray(Person[] ar)
    {
        String firstNameList ="";

        for (int i = 0; i < size; i++)
        {
            if(ar[i] != null)
            {
                firstNameList += ar[i].getFirstName();
                if(i+1 != size-1 && ar[i+1] != null)
                {
                    firstNameList += ", ";
                }
            }
        }

        return firstNameList;
    }

    public void unmodify()
    {//with this you get the unfiltered array again so you can filter it again
        modified = arPerson;
    }

    public String printArray()
    {
        String list = "";

        for (int i = 0; i < size; i++) {
            if(arPerson[i] != null)
            {
                list += arPerson[i].toString();

                if(arPerson[i+1] != null)
                {
                    list += "\n";
                }
            }
        }

        return list;
    }
}
