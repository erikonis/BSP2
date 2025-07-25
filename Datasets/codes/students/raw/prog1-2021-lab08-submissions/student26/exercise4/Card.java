package exercise4;

public class Card {
    int id,points,INSTANCE;

    public Card(int id,int INSTANCE) {
        this.id = id;
        this.points = 0;
        this.INSTANCE = INSTANCE;
    }

    public int getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int point){
        points+=point;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card){
            Card card = (Card) obj;
            return (card.id==((Card) obj).id);
        }else {
            return false;
        }
    }

    public int redeemPoints(int points){
        this.points -= points;
        return this.points;
    }
}
