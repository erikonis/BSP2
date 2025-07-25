public class Filter {
    private Person[] persons;

    public Filter(Person[] persons)
    {
        this.persons = persons;
    }

    public Person[] filterOccupation(Person[] personsToFilter,boolean teaches, boolean studies)
    {
        int count=0;
        for(Person x: personsToFilter) 
        {
            if(x.getTeaches()==teaches&&x.getStudies()==studies) count++;

        }

        Person[] filtered = new Person[count];

        int filteredCounter=0;
        for(Person x:personsToFilter)
        {
            if(x.getTeaches()==teaches&&x.getStudies()==studies)
            {
                filtered[filteredCounter]=x;
                filteredCounter++;
            }
        }
        return filtered;
    }

    public Person[] filterAgeGroup(Person[] personsToFilter,Filters filter)
    {
        int count=0;
        for(Person x: personsToFilter) 
        {
            if(x.getAgeGroup()==filter) count++; 

        }

        Person[] filtered = new Person[count];

        int filteredCounter=0;
        for(Person x:personsToFilter)
        {
            if(x.getAgeGroup()==filter)
            {
                filtered[filteredCounter]=x;
                filteredCounter++;
            }
        }
        return filtered;
    }

    public Person[] filter(Filters[] filters)
    {
        Person[] personsToFilter = persons;
        for(Filters f: filters)
        {
            switch(f)
            {
                case Lecturer:
                    personsToFilter = filterOccupation(personsToFilter,true,false);
                    break;
                case Student:
                    personsToFilter = filterOccupation(personsToFilter,false,true);
                    break;
                case TA:
                    personsToFilter = filterOccupation(personsToFilter,true,true);
                    break;
                case Junior:
                    personsToFilter = filterAgeGroup(personsToFilter,Filters.Junior);
                    break;
                case Middle:
                    personsToFilter = filterAgeGroup(personsToFilter,Filters.Middle);
                    break;
                case Senior :
                    personsToFilter = filterAgeGroup(personsToFilter,Filters.Senior);
                    break;
                default : return null;
            }
        }
        return personsToFilter;
    }

    public String toString(Person[] persons)
    {   
        String output="\n";
        for(Person x: persons)
        {
            output += "\n"+x.getName();
        }
        return output;
    }

}
