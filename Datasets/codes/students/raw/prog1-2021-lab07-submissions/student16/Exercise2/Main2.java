public class Main2 {

    public static void main(String[] args) {

        Person Cierra = new Person("Cierra",false,true,34);
        Person Alden = new Person("Alden",true,true,23);
        Person Thomas = new Person("Thomas",false,true,55);
        Person Miranda = new Person("Miranda",false,true,47);
        Person Brandy = new Person("Brandy",true,false,22);
        Person Alvaro = new Person("Alvaro",false,true,58);
        Person Maggie = new Person("Maggie",true,false,20);

        


        Person[] names = {Cierra,Alden,Thomas,Miranda,Brandy,Alvaro,Maggie};

        for (int i =0 ; i<names.length;i++){

        
        System.out.println("For "+names[i].getName()+":");
        names[i].Test();
        
        System.out.println("-----------------------");
        
        }
        
       

        




        
    }

    
}
