package src.lu.uni.programming1.lab7.Exercise4;

public class listOfPeople {
    private person[] arrayOfPeople;

    public listOfPeople(person[] arrayOfPeople) {
        this.arrayOfPeople = arrayOfPeople;
    }

    public listOfPeople getFilteredPeople(String filter) {
        person[] arrayOfFilteredPeople;
        int numberOfMatches = 0;
        for (int i = 0; i < arrayOfPeople.length; i++) {
            if (arrayOfPeople[i].matchFilter(filter)) {
                numberOfMatches++;
            }
        }
        arrayOfFilteredPeople = new person[numberOfMatches];
        int j = 0;
        for (int i = 0; i < arrayOfPeople.length; i++) {
            if (arrayOfPeople[i].matchFilter(filter)) {
                arrayOfFilteredPeople[j] = arrayOfPeople[i];
                j++;
            }
        }
        listOfPeople returnValue = new listOfPeople(arrayOfFilteredPeople);
        return returnValue;
    }

    public void display() {
        for (int i = 0; i < arrayOfPeople.length; i++) {
            arrayOfPeople[i].display();
        }
    }
}
