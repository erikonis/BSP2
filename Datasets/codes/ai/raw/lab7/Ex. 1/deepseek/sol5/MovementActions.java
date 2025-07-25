public class MovementActions {
    public static class Forward implements Action {
        public void execute(Robot r) { r.move(0, 1); }
        public String getDescription() { return "Moved Forward"; }
    }
    
    public static class Back implements Action {
        public void execute(Robot r) { r.move(0, -1); }
        public String getDescription() { return "Moved Back"; }
    }
    
    public static class Left implements Action {
        public void execute(Robot r) { r.move(-1, 0); }
        public String getDescription() { return "Moved Left"; }
    }
    
    public static class Right implements Action {
        public void execute(Robot r) { r.move(1, 0); }
        public String getDescription() { return "Moved Right"; }
    }
}