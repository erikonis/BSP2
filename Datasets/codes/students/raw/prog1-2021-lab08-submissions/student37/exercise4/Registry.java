package lu.uni.programming1.lab8.exercise4;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<LocalDate, List> Registry;

    public Registry() {
        Registry = new HashMap<>();
    }

    // Uses today's date. If the date has no list yet, creates a new list and adds.
    // If there is already a list for that date : adds.
    // Add method only adds if it is not a duplicate.

    public void AddCard(Card customer) {
        LocalDate today = LocalDate.now();
        if (Registry.get(today)==null) {
            Registry.put(today, new List());
        }
        Registry.get(today).Add(customer);
    }

    // Can use a different date for testing purposes.

    public void testAdd(Card customer, LocalDate Date) {
        if (Registry.get(Date)==null) {
            Registry.put(Date, new List());
        }
        Registry.get(Date).Add(customer);
    }

    // If Date has a list which contains the card : return true.
    // If the list does not contain the card or the list doesn't exist : return false.

    public boolean check(Card customer, LocalDate Date) {
        if (Registry.get(Date)==null) {
            return false;
        }
        else {
        return Registry.get(Date).Contains(customer);
        }
    }

    public boolean checkExist(LocalDate Date) {
        return (Registry.get(Date)!=null);
    }

    // Gets the list of a Date and prints it (check print in list class for details).
    // Gets the list of a Date if it exists.
    public void Print(LocalDate Date) {
        if (checkExist(Date)) {
        Registry.get(Date).Print(); }
    }
    
}
