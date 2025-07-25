public class Trash extends Item {

    Trash(String name, int value, Rarity rarity) {
        super(name, value, rarity);
        //TODO Auto-generated constructor stub
    }
    void use(){
        System.out.println("It is trash");
    }

    @Override
    public String toString() {
        return String.format("[%s]", getRarity())
        + String.format(" %s ", getName())
        + String.format(" (%s) Gold ", getValue());
    }
}

