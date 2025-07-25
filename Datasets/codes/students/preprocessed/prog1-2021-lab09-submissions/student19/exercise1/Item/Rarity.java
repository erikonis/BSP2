public enum Rarity{
    WHITE("White"),PINK("Pink"),GREEN("Green"),BLUE("Blue"),PURPLE("Purple");

    private String str;
    private Rarity(String str) {this.str = str;}
    public String getString() {return this.str;}
}