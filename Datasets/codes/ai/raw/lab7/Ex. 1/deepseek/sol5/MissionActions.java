public class MissionActions {
    public static class TakePhoto implements Action {
        private boolean highRes;
        
        public TakePhoto(boolean highRes) {
            this.highRes = highRes;
        }
        
        public void execute(Robot r) { r.takePhoto(highRes); }
        public String getDescription() { 
            return "Taken " + (highRes ? "High" : "Low") + " Res Photo"; 
        }
    }
    
    public static class PickRock implements Action {
        public void execute(Robot r) { r.pickRock(); }
        public String getDescription() { return "Picked Rock"; }
    }
}