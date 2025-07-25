package lu.uni.programming1.lab8.exercise4;

import java.util.HashSet;

public class List {

    private HashSet<Card> List;

    public List() {
        List = new HashSet<Card>();
    }

    // "Add" method is for List class, calls "add" method for HashSet.
    public void Add(Card customer) {
        List.add(customer);
    }

    // "Contains" method is for List class, calls "contains" method for HashSet.
    public boolean Contains(Card customer) {
        return List.contains(customer);
    }


    // For testing purposes, to check that we have no duplicates. 
    public void Print() {

        //Prints every ID in List.
        
        for (Card a:List) {
            System.out.println(a.GetID());
        }
        System.out.println("\n");
    }
    
}
