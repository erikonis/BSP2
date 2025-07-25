public class InvalidLicense extends Exception{
    Game game;
    Disk disk;

    public InvalidLicense(Game game, Disk disk)
    {
        this.game = game;
        this.disk = disk;
    }

    public Game getGame(){return game;}
    public Disk getDisk(){return disk;}
}
