public abstract class action {
    private String prev, act;
    private int use;
    
    // public void setPrev(String prev) {
    //     this.prev = prev;}
    public String getPrev(){
        return prev;}
        public String getAct(){
            return act;}
    

        public void doact(robot rob,String act){
            this.act = act;
            prev = "none";
            use = 0;
            if (rob.getBattery()<=0){
                act = "none";
            }
            switch (act) {
                case "left":
                    use = 10;
                    rob.modBattery(use);
                    prev = "Moved Left";
                    rob.modNumact();
                    break;
                case "right":
                    use = 10;
                    rob.modBattery(use);
                    prev = "Moved Right";
                    rob.modNumact();
                    break;
                case "up":
                    use = 10;
                    rob.modBattery(use);
                    prev = "Moved Up";
                    rob.modNumact();
                    break;
                case "down":
                    use = 10;
                    rob.modBattery(use);
                    prev = "Moved Down";
                    rob.modNumact();
                    break;
                case "lift":
                    use = 150;
                    rob.modBattery(use);
                    prev = "Lifted a rock";
                    rob.modNumact();
                    break;
                case "pic":
                    use = 40;
                    rob.modBattery(use);
                    prev = "Low resolution picture taken";
                    rob.modNumact();
                    break;
                case "hdpic":
                    use = 60;
                    rob.modBattery(use);
                    prev = "High resolution picture taken";
                    rob.modNumact();
                    break;
                default:
                    break;}

                System.out.println(prev+", Battery: -"+use);}
    abstract void Report(robot rob);
    
}
