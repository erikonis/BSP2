package lu.uni.programming1.lab7.exercise2;

public class filter {

    private person[] list;

    public filter(person[] list)
    {
        this.list = list;
    }
    
    public person[] getList() {
        return list;
    }

    public void setList(person[] list) {
        this.list = list;
    }

    public void printName()
    {
        for (int i = 0; i < list.length; i++)
        {
            System.out.println(list[i].getName());
        }
    }

    public void lectureF()
    {
        int newLength = 0;
        int[] filtered = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++)
        {
            if ((list[i].isTeaches() ^ list[i].isStudies()) && (list[i].isTeaches()))
            {
                newLength++;
                filtered[counter++] = i;
            }
        }

        person[] newList = new person[newLength];
        for (int i = 0; i < newLength; i++)
        {
            newList[i] = list[filtered[i]];
        }

        setList(newList);
    }

    public void studentF()
    {
        int newLength = 0;
        int[] filtered = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++)
        {
            if ((list[i].isTeaches() ^ list[i].isStudies()) && (list[i].isStudies()))
            {
                newLength++;
                filtered[counter++] = i;
            }
        }

        person[] newList = new person[newLength];
        for (int i = 0; i < newLength; i++)
        {
            newList[i] = list[filtered[i]];
        }

        setList(newList);
    }

    public void taF()
    {
        int newLength = 0;
        int[] filtered = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++)
        {
            if (list[i].isStudies())
            {
                newLength++;
                filtered[counter++] = i;
            }
        }

        person[] newList = new person[newLength];
        for (int i = 0; i < newLength; i++)
        {
            newList[i] = list[filtered[i]];
        }

        setList(newList);


        int newnewLength = 0;
        int[] refiltered = new int[list.length];
        int counter2 = 0;
        for (int i = 0; i < list.length; i++)
        {
            if (list[i].isTeaches())
            {
                newnewLength++;
                refiltered[counter2++] = i;
            }
        }

        person[] newnewList = new person[newnewLength];
        for (int i = 0; i < newnewLength; i++)
        {
            newnewList[i] = list[refiltered[i]];
        }

        setList(newnewList);
    }
    
    public void juniorF()
    {
        int newLength = 0;
        int[] filtered = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++)
        {
            if ((list[i].getAge() >= 18) && (list[i].getAge() < 28))
            {
                newLength++;
                filtered[counter++] = i;
            }
        }

        person[] newList = new person[newLength];
        for (int i = 0; i < newLength; i++)
        {
            newList[i] = list[filtered[i]];
        }

        setList(newList);
    }

    public void middleF()
    {
        int newLength = 0;
        int[] filtered = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++)
        {
            if ((list[i].getAge() >= 28) && (list[i].getAge() < 55))
            {
                newLength++;
                filtered[counter++] = i;
            }
        }

        person[] newList = new person[newLength];
        for (int i = 0; i < newLength; i++)
        {
            newList[i] = list[filtered[i]];
        }

        setList(newList);
    }

    public void seniorF()
    {
        int newLength = 0;
        int[] filtered = new int[list.length];
        int counter = 0;
        for (int i = 0; i < list.length; i++)
        {
            if (list[i].getAge() >= 55)
            {
                newLength++;
                filtered[counter++] = i;
            }
        }

        person[] newList = new person[newLength];
        for (int i = 0; i < newLength; i++)
        {
            newList[i] = list[filtered[i]];
        }

        setList(newList);
    }
}
