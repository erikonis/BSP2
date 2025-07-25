public class Main {
    static Logs log = new Logs();
    static Character me = new Character("Eldar", 100, 100);
    static Character someone = new Character("Chuck Norris", 100, 100);

    public static void main(String[] args) {
        log.hp(me);
        log.hp(someone);
        log.target(someone);
        log.ability(someone);
        Ability.getRandomhealthpoints();
        Ability.Updatehealthpoints(someone);
        log.differrence(someone);

        log.jump(someone);
        log.target(me);
        log.ability(me);
        Ability.Updatehealthpoints(me);
        log.differrence(me);

    }
}
