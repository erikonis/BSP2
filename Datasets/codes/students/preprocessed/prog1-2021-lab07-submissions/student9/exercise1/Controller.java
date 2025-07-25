public class Controller {
    private Prototype ptp ;

    Controller(Prototype prototype){
        this.ptp = prototype;

    }
    public void execute(Actions[] Indications){
        for (Actions act : Indications){
            String report = this.ptp.execute(act);
            System.out.println(report);
        }
        System.out.println(this.ptp.FinalReport());
    }
}