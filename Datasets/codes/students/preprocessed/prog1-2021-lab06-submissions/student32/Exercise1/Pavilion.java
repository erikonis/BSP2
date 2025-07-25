
public class Pavilion {
    
    //attibues

    private String name;
    private double price;

    private int min = 5;
    private int max = 100;

    //methodes
    public Pavilion() {
        nameGeneration();
        price = Math.random()*(max-min+1)+min;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void nameGeneration(){
        
        name = "pav"+ String.valueOf((int)(Math.random()*20-1+1)+1);
        
    }

}
