package lu.uni.programming1.lab9.exercise1;

public class Actions {
    
    int Object;

    int Action;

    public void newAction(){
        Action = (int)(Math.random()*3) + 1;

        switch(Action){
            case 1: Object = (int)(Math.random()*Inventory.inventory.size());
            System.out.println("You dropped " + Inventory.inventory.get(Object).getName());
            Inventory.Drop(Object);

            break;

            case 2: Object = (int)(Math.random()*Inventory.inventory.size());
            Inventory.Use(Object);

            break;

            case 3: Object = (int)(Math.random()*Inventory.inventory.size());
            Inventory.Sell(Object);

            break;
        }
    }
}
