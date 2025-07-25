package lu.uni.programming1.lab7.Exercise4;

public class listOfPeople {
    private person[] People;

    public listOfPeople(person[] People) {
        this.People = People;
    }

    public listOfPeople getFilteredPeople(String filter) {
        person[] filteredPeople;
        int numberOfMatches = 0;
        for (int i = 0; i < People.length; i++) {
            if (People[i].matchFilter(filter)) {
                numberOfMatches++;
            }
        }
        filteredPeople = new person[numberOfMatches];
        int j = 0;
        for (int i = 0; i < People.length; i++) {
            if (People[i].matchFilter(filter)) {
                filteredPeople[j] = People[i];
                j++;
            }
        }
        listOfPeople returnValue = new listOfPeople(filteredPeople);
        return returnValue;
    }

    public void display() {
        for (int i = 0; i < People.length; i++) {
            People[i].display();
        }
    }
}