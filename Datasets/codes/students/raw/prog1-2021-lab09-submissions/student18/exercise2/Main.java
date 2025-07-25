package lab9.exercise2;

public class Main {
    public static void main(String[] args){
        Logs logs = new Logs();
        Character protagonist = new Character("Obama", 1000, 890);
        Character antagonist = new Character("Dio", 3000, 2340);
        Character richard = new Character("Richard", 100, 100);

        logs.saveLog(new Jump(protagonist));
        logs.saveLog(new TargetableAbility(antagonist, protagonist, -250, "knife throw"));
        logs.saveLog(new TargetableAbility(protagonist, protagonist, 500, "Weekend"));
        logs.saveLog(new Ability(richard, "nothing"));
        logs.saveLog(new TargetableAbility(antagonist, richard, -1000, "The World"));

        logs.printLog();
    }
}
