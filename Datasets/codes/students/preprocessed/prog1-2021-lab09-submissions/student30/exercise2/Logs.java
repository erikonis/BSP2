public class Logs {
    public void hp(Character character) {
        System.out.println(
                character.getName() + "'s HP : " + character.gethealthpoints() + "|" + character.getMaxhealthpoints());
    }

    public static void differrence(Character character) {
        System.out.println(character.getName() + " lost " + Ability.getRandomhealthpoints() + " health.");
    }

    public static void jump(Character character) {
        System.out.println(character.getName() + " has jumped");
    }

    public static void ability(Character character) {
        System.out.println(character.getName() + " used his ability");
    }

    public static void target(Character character) {
        System.out.println(character.getName() + "  is now targetable");
    }
}
