public class Tool extends Software{
    
    public Tool(String name, int size) {
        super(name, size);
    }

    public void install(Disk disk) throws Exception {
        if (disk.getOperatingSystem().equals(OperatingSystem.MACOS)){
            throw new WrongOSException();
        } else {
            super.install(disk);
        }
    }
}
class WrongOSException extends Exception{
	public WrongOSException(){
	}
}