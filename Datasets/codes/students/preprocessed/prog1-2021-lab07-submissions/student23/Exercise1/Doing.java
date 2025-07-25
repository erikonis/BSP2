public class Doing extends Action{

    public Doing() {
        
    }

    @Override
    public void Do(String Name, String action){
        String name = Name;
        switch(action){
            case "pickUp" -> {
                System.out.println(name +" picks up the rock");
                super.setNeededTime(150);
            }
            case "photoH" -> {
                System.out.println(name +" took a high resolution picture");
                super.setNeededTime(60);
            }
            case "photoL" -> {
                System.out.println(name +" took a low resoltution picture");
                super.setNeededTime(40);
            }
            default -> System.out.println("No vaild action");
        }
    }
}
