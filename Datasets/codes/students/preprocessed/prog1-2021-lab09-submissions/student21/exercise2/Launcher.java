public class Launcher {
    public static void main(String[] args) {
        Character player1 = new Character("Mathieu");
        Character player2 = new Character("Felix");

        Controller mathieu = new Controller(player1);
        Controller felix = new Controller(player2);

        mathieu.jump();

        felix.jump();

        mathieu.ability("move");

        felix.ability("turn");

        mathieu.target(player2, 30);

        felix.target(player1, 40);

        mathieu.target(player2, 80);
        mathieu.target(player2, 80);

        mathieu.jump();

        felix.jump();

        felix.ability("test");

    }
}
