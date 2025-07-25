package lu.uni.programming1.lab10.exercise3;

public class Launcher {
  public static void main(String[] args) {
    User me = new User("Sara");
    Disk saraslife = new Disk(512, me, OperatingSystem.LINUX);
    Disk mac = new Disk(512, new User("notSara"), OperatingSystem.MACOS);
    Disk oldsara = new Disk(1024, me, OperatingSystem.WINDOWS);
    Game LOL = new Game("League of Legends", 10);
    Game g2 = new Game("God of War 5", 770);
    Game gta = new Game("Grand Theft Auto V", 86);
    Game cs = new Game("CSGO", 20);
    Tool ps = new Tool("Photoshop CS6", 5);
    Tool rtfm = new Tool("Read The F&$*!^% Manual", 10);
    saraslife.getUser().addGameLicense(LOL.getLicense());
    saraslife.getUser().addGameLicense(g2.getLicense());
    me.addGameLicense(cs.getLicense());
    tryToInstallGame(LOL, saraslife);
    tryToInstallGame(gta, saraslife);
    tryToInstallGame(g2, saraslife);
    tryToInstallGame(cs, oldsara);
    tryToInstallTool(ps, saraslife);
    tryToInstallTool(ps, mac);
    tryToInstallTool(rtfm, oldsara);

  }

  static public void tryToInstallGame(Game g, Disk d) {
    try {
      g.install(d);
    } catch (Exception e) {
      System.err.println("Can't install " + g + ": license not owned by " + d.getUser());
    }
  }

  static public void tryToInstallTool(Tool t, Disk d) {
    try {
      t.install(d);
    } catch (Exception e) {
      System.err.println("Can't install " + t + ": " + d.getUser() + " uses MACOS so no tools for them :(");
    }
  }
}
