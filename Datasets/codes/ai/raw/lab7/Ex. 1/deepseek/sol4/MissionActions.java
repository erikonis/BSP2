public class MissionActions {
    public static class TakePhoto implements Action {
        private final boolean highRes;
        
        public TakePhoto(boolean highRes) {
            this.highRes = highRes;
        }
        
        @Override
        public void execute(RobotState state) {
            if (state.getX() == 5 && state.getY() == 5) {
                state.setHasAlienPhoto(true);
            }
        }
        
        @Override
        public int getBatteryCost() {
            return highRes ? 60 : 40;
        }
        
        @Override
        public String getActionName() {
            return highRes ? "Take High-Res Photo" : "Take Low-Res Photo";
        }
    }
    
    public static class PickRock implements Action {
        @Override
        public void execute(RobotState state) {
            if (state.getX() == 3 && state.getY() == 2) {
                state.setHasRock(true);
            }
        }
        
        @Override
        public int getBatteryCost() {
            return 150;
        }
        
        @Override
        public String getActionName() {
            return "Pick Up Rock";
        }
    }
}