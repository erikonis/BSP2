package lu.uni.programming1.lab7.exercise1;

public class launcher {
    public static void main(String[] args) {
        Action[] Act;
        Act = null;
        Controller controller = new Controller(Act, 10, 0, 3000);

        controller.gofordward();
        controller.goleft();
        controller.goleft();
        controller.goleft();
        controller.gofordward();
        controller.pickrock();
        controller.gofordward();
        controller.takephoto(true);
        controller.goright();
        controller.goback();
        controller.goright();
        System.out.println(controller);

        Action[] Act2;
        Act2 = null;
        int distance = controller.getdistance();
        int battery = controller.getbattery();

        Controller controller2 = new Controller(Act2, 100, distance, battery);
        controller2.goright();
        controller2.gofordward();
        controller2.goleft();
        controller2.gofordward();
        System.out.println(controller2);

    
    }
    
}
