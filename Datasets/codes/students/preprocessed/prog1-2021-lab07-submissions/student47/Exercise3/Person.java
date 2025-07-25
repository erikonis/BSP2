public class Person {
    private String id, name;
    protected double currentMoney;
    protected Card card;

    Person(String id, String name, double currentMoney, Card card) {
        this.id = id;
        this.name = name;
        this.currentMoney = currentMoney;
        this.card = card;

    }

    Person(String id, String name, double currentMoney) {
        this.id = id;
        this.name = name;
        this.currentMoney = currentMoney;

    }

    public String getName() {
        return name;
    }

    public Card getCard() {
        return card;
    }

    public String getId() {
        return id;
    }

    public double getMoney() {
        return currentMoney;
    }

}
