package lu.uni.programming1.lab7.exercise1;

public class Prototype {
    private int batteryLife , Distance, Actions;
    private String name;

    Prototype(String name){
        this.batteryLife = 3000;
        this.Distance = 0;
        this.Actions = 0;
        this.name = name;
    }

    public String execute(Actions act){
        this.batteryLife -= act.getBattery();
        this.Distance +=  act.getDistance();
        this.Actions += 1;
        String report = "";
        report += "This is the action number: " + this.Actions + ".";
        report += "\n\t" + act.getDescription() + "\n\tConsumed" + act.getBattery() + "seconds from the battery." + "\n\tMoved" + act.getDistance() + "from the start.";
        report += "\nReport done";
        
        return report;

    }
    public String FinalReport(){
        return "Report from the prototype " + this.name + "\n\tBattery consumed: " +(3000 - this.batteryLife) + "\n\tDistance traveled: " +(this.Distance) + "\n\tActions done: " + this.Actions;

    }
}
