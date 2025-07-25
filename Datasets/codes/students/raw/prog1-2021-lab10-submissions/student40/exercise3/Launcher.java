package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Launcher{

    public static void main(String[] args) {
        User adin = new User("Adin");
        User alex = new User("Alex");
        Disk hd = new Disk(516, adin, OperatingSystem.MACOS);
        Disk hd2 = new Disk(256, alex, OperatingSystem.MACOS);
        Tool generator = new Tool("App", 20);
        Game tw = new Game("Tribal Wars", 120, UUID.randomUUID());

        hd.install(tw);
        hd2.install(generator);
    }
}