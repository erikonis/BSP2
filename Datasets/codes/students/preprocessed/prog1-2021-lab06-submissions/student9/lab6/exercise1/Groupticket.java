
public class Groupticket extends Ticket
{
    int n;
    Ticket[] ticArray;

    public Groupticket(int n, Pavilion[] pavArray){
        super(pavArray);
        this.n=n;
        ticArray= new Ticket[n]; 
        for (int i=0; i<n; i++){
            ticArray[i]= new Ticket(pavArray);
        }
    }

    public double costOfGrp (){
        double total=0;
        for(int i=0;i<n;i++)
            total += ticArray[i].cost();
        if(n>=6&&n<12)
            return 0.7*total;
        else if(n>=12) 
            return 0.6*total;
        else   
            return total;
        
    }

    @Override
    public String toString(){
        String taux="";
        String s0="\t\t\t\t–** Group Ticket **–";
        String s1="\n---------------------— Welcome to Luxemobourg History Museum —-----------------------\n";
        String s11="Ticket ID: "+ticketID+"\n";
        String s15="Date :"+emissionDate+"\n";
        String s2="\nThe price for the group ticket is : "+(int)(Math.round(costOfGrp() * 100))/100.0+"$\n";
        String s3="\nYou have access to the following pavilion : \n";
        String s4="";

        int index=-1;
        int j=-1;
        while(index==-1){
            j++;
            if(ticArray[j]!=null)
            index=j;
        }

        int counter3=0;
        for(int i=0;i<pavArray.length;i++){
            if(pavArray[i]!=null){
                counter3++;                     //counter3 is there to skip the first 3 elements of the array
            if(ticArray[index].counter>3 && counter3>3)
                taux="(-30%)";
            s4 = s4+"-"+pavArray[i].getName()+" "+taux+"\n";
            }
        }

        String s5="";
        if(n>=6&&n<12)
            s5="(-30% on total cost)\n";
        else if(n>=12)
            s5="(-40% on total cost)\n";
        
        return s0+s1+s11+s15+s3+s4+s5+s2;
    }

    public static void main(String[] args) {
        Pavilion pav1 =  new Pavilion("Pavilion Culture", 14.5);
        Pavilion pav2 =  new Pavilion("Pavilion Astronomie", 9.5);
        Pavilion pav3 =  new Pavilion("Pavilion Atristique", 20);
        Pavilion pav4 =  new Pavilion("Pavilion Aquatique", 10);
        Pavilion pav5 =  new Pavilion("Pavilion Galactique", 20);
        Pavilion[] pavArray = new Pavilion[10];
        pavArray[0]=pav1;
        pavArray[1]=pav2;
        pavArray[2]=pav3;
        pavArray[3]=pav4;
        pavArray[4]=pav5;
        int n=6;
        Groupticket gt = new Groupticket(n, pavArray);
        System.out.println(gt.toString());
    }

    
}
