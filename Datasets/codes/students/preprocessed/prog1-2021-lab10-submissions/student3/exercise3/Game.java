import java.util.UUID;

public class Game extends Software{
    private UUID license;

    public Game(String name, int size) {
        super(name, size);
        this.license = UUID.randomUUID();
    }

    public UUID getLicense() {
        return license;
    }

    public void install(Disk disk) throws Exception {
        if (disk.getUser().ownsGameLicense(license)){
            super.install(disk);
        } else {
            throw new IllegalDownloadException();
        }
    }
}

class IllegalDownloadException extends Exception{
	public IllegalDownloadException(){
	}
}