public class Actions {
    
    private int Distance , Battery;

    private String Description;

    Actions(String Description,int Distance, int Battery){
        this.Description = Description;
        this.Distance = Distance;
        this.Battery = Battery;
    }

    
    public int getDistance() {
        return Distance;
    }

    public int getBattery() {
        return Battery;
    }

    public String getDescription() {
        return Description;
    }
    public static Actions[] test(){
        Actions[] set = { Actions.forward(),
                         Actions.left(),
                         Actions.right(),
                         Actions.HDpicture(),
                         Actions.Lowpicture(),
                         Actions.backward(),
                         Actions.pick()
        };
        return set;
    }
    

    static Actions pick() {
        return pick();
    }


    private static Actions backward() {
        return backward();
    }

    static Actions HDpicture() {
        return HDpicture();
    }


    private static Actions Lowpicture() {
        return Lowpicture();
    }


    static Actions right() {
        return right();
    }


    static Actions left() {
        return left();
    }


    static Actions forward() {
        return forward();
    }

    public class Actions2 {
        static public Actions forward() {return new Actions("Moving forward", 10, 20);}
        static public Actions right() {return new Actions("Moving right", 10, 20);}
        static public Actions left() {return new Actions("Moving left", 10, 20);}
        static public Actions backward() {return new Actions("Moving backward", 10, 20);}
        static public Actions HDpicture() {return new Actions("Moving forward", 60, 0);}
        static public Actions Lowpicture() {return new Actions("Moving forward", 40, 0);}
        static public Actions pick() {return new Actions("Picking a rock ", 150, 0);}
        
    }
    

    
}
