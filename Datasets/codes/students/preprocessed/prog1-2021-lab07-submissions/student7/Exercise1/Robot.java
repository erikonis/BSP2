public class Robot {

    private int battery;

    public Robot() {
        battery = 3000;
    }

    public void executeInstructions(action[] whatToDo) {
        int numberOfExecutedActions = 0;
        for (int i = 0; i < whatToDo.length; i++) {
            if (battery >= whatToDo[i].getTime()) { 
                numberOfExecutedActions++; 
                whatToDo[i].display();
                battery -= whatToDo[i].getTime(); 
            } else {
                System.out.println("battery died");
            }
        }
        System.out.println("We run " + numberOfExecutedActions + " actions");
        System.out.println("Remaining battery life time is : " + battery);
    }
}