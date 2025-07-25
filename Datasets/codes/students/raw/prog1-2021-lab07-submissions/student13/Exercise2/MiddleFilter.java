package Exercise2;

public class MiddleFilter implements Filter{
    
    public Person[] filter(Person[] list)
    {
        Person[] filteredList= new Person[list.length];
        for(int i= 0; i< filteredList.length; i++)
        {
            if(list[i]==null)
            {
                break;
            }
            if(list[i].getAge()>=28 && list[i].getAge()<55)
            {
                filteredList[i] = list[i];
            }
        }
        return filteredList;
    }
}
