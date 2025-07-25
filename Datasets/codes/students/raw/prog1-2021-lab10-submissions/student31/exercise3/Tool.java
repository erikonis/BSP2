package lu.uni.programming1.lab10.exercise3;

public class Tool extends Software {





    public Tool(String name, int size) {
        super(name, size);
    }

    @Override
    public void install(Disk disk) throws Exception {
        super.install(disk);

        if (System.getProperty("os.name")=="macOS") {System.out.println("Incompatible OS for Tools... ");}
    }
    
}
