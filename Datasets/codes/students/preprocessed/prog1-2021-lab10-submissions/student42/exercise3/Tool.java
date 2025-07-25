public class Tool extends Software {

    public Tool(String name, int size) {
        super(name, size);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void install(Disk disk) throws WrongOperatingSystemException, Exception {
        if(disk.getOperatingSystem().equals(OperatingSystem.MACOS)){
            throw new WrongOperatingSystemException();
        }else{
            super.install(disk);
        }
    }

}
