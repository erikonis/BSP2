package lu.uni.programming1.lab10.exercise3;

import java.util.UUID;

public class Game extends Software{

    public Game(String name, int size, UUID licence) {
        super(name, size);
        licence = UUID.randomUUID();
    }


}
