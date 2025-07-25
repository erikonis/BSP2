public class ActionMove extends Action {

    String direction;

    public ActionMove(String direction) {
        this.direction = direction;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void execute() {
        String output = switch (direction) {
            case "up" -> "Move up by 20 cm.";
            case "down" -> "Move down by 20 cm.";
            case "left" -> "Move left by 20 cm.";
            case "right" -> "Move right by 20 cm.";
        default -> throw new IllegalArgumentException("Unexpected value: " + direction);
        };
        System.out.println(output);
        
        
    }
    
}
