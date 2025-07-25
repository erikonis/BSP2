public class Groupticket {
    private int n;
    double cost;
    pavilion[] pavArray; 

    public Double groupcost() {
        if (n>=6 && n<12){
            for(int l=0;l<=2;l++){
                cost +=pavArray[l].getPrice();
                cost *=0.70;
            }
        }
        else{
            for(int l=0;l<=2;l++){
                cost +=pavArray[l].getPrice();
                cost *=0.60;
            }
        }
        return cost;
 
    }
}
