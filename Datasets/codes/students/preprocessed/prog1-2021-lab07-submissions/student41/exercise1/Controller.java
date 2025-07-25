public class Controller{

    private Action actions[];
    private int nextAction;
    private int NoOfActions;
    private int distance;
    private int battery;


    public Controller(Action actions[], int NoOfActions_, int distance_, int battery_) {
        this.actions = new Action[NoOfActions_];
        this.nextAction = 0;
        this.distance = distance_;
        this.battery = battery_;
        this.NoOfActions =NoOfActions_;
        
    }

    public int gofordward() {
        move move = new move("Fordward");
        if (battery>10){

            if (nextAction < NoOfActions){
                actions[nextAction] = move;
                nextAction++;
                battery =battery - 10;
                distance = distance + 20;
                move.print();
                System.out.println( "\nBattery: " + battery);
            }
            else{
                System.err.println("\nno more actions allowed.");
            }
        }
		else{
            System.err.println("\nno enough battery.");
        }
        return battery;
			
	}

    public int goleft() {
        move move = new move("left");
        if (battery>10){

            if (nextAction < NoOfActions){
                actions[nextAction] = move;
                nextAction++;
                battery =battery - 10;
                distance = distance + 20;
                move.print();
                System.out.println( "\nBattery: " + battery);
            }
            else{
                System.err.println("\nno more actions allowed.");
            }
        }
		else{
            System.err.println("\nno enough battery.");
        }
        return battery;
			
	}

    public int goright() {
        move move = new move("right");
        if (battery>10){

            if (nextAction < NoOfActions){
                actions[nextAction] = move;
                nextAction++;
                battery =battery - 10;
                distance = distance + 20;
                move.print();
                System.out.println( "\nBattery: " + battery);
            }
            else{
                System.err.println("\nno more actions allowed.");
            }
        }
		else{
            System.err.println("\nno enough battery.");
        }
        return battery;
			
	}

    public int goback() {
        move move = new move("back");
        if (battery>10){

            if (nextAction < NoOfActions){
                actions[nextAction] = move;
                nextAction++;
                battery =battery - 10;
                distance = distance + 20;
                move.print();
                System.out.println( "\nBattery: " + battery);
            }
            else{
                System.err.println("\nno more actions allowed.");
            }
        }
		else{
            System.err.println("\nno enough battery.");
        }
        return battery;
			
	}

    public int pickrock() {
        pickrock rock = new pickrock("Picked a rock");
        if (battery>150){

            if (nextAction < NoOfActions){
                actions[nextAction] = rock;
                nextAction++;
                battery =battery - 150;
                distance = distance + 0;
                rock.print();
                System.out.println( "\nBattery: " + battery);
            }
            else{
                System.err.println("\nno more actions allowed.");
            }
        }
		else{
            System.err.println("\nno enough battery.");
        }

        return battery;
			
	}

    public int takephoto(boolean HR) {
        if (HR){
            takephoto photo = new takephoto("Picked a rock", true);
            if (battery>60){
                if (nextAction < NoOfActions){
                    actions[nextAction] = photo;
                    nextAction++;
                    battery =battery - 60;
                    distance = distance + 0;
                    photo.print();
                    System.out.println( "\nBattery: " + battery);
                }
                else{
                    System.err.println("\nno more actions allowed.");
                }
            }
            else{
                System.err.println("\nno enough battery.");
            }

        }
        else{
            takephoto photo = new takephoto("Picked a rock", false);
            if (battery>40){
                if (nextAction < NoOfActions){
                    actions[nextAction] = photo;
                    nextAction++;
                    battery =battery - 40;
                    distance = distance + 0;
                    photo.print();
                    System.out.println( "\nBattery: " + battery);
                }
                else{
                    System.err.println("\nno more actions allowed.");
                }
            }
            else{
                System.err.println("\nno enough battery.");
            }


        }

        return battery;
        
			
	}

    public int getdistance() {
        return distance;
    }
    
    public int getbattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Number of actions: " + nextAction+ " Total Distance: " + distance + " Total Battery: " + battery;
    }

    




    
}
