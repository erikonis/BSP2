package lu.uni.programming1.lab10.exercise3;

public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);

    }

    @Override
    public void install(Disk disk) throws Exception {
        try {
            if (disk.getOperatingSystem().equals(OperatingSystem.MACOS)) {
                throw new YouHaveMacException();
            } else {
                super.install(disk);
            }
        } catch (YouHaveMacException e) {
            System.out.println("It doesn't work ? It's because you have MAC !!!");
        }

    }

}
