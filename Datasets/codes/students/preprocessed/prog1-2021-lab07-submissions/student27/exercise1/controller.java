public class controller extends action{
    // private String[] multiin;
    private int c;
    public void multiact(robot rob, String... multiin){
        // this.multiin =multiin;
        c = 0;
        while ((c<10)&&(c<multiin.length)&&(rob.getBattery()>0)){
            super.doact(rob, multiin[c]);
            c++;}
        Report(rob);
    }
    void Report(robot rob){
        System.out.println("Total Actions taken: "+rob.getnumact()+"\t Final Battery: "+rob.getBattery());
    }
    
}
