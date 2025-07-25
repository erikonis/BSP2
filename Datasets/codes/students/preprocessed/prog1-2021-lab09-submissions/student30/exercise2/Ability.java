public class Ability {
    static int randomhealthpoints = (int) (Math.random() * 16);
    static Logs logs = new Logs();

    public static int getRandomhealthpoints() {
        return randomhealthpoints;
    }

    public static int Updatehealthpoints(Character character) {
        int rhealthpoints = character.gethealthpoints() - randomhealthpoints;
        character.sethealthpoints(rhealthpoints);
        logs.differrence(character);
        logs.hp(character);
        return rhealthpoints;
    }

}
