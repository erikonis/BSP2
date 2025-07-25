package Exercise4;

import java.time.LocalDate;

public class JuniorFilter extends FilterTemplate{
    
    LocalDate today = LocalDate.now();

    public JuniorFilter(Person person[]) {
        super(person);
    }

    @Override
    public void check(){
        int count = 0;
        int index[] = new int[per.length];
        for(int i = 0; i<per.length;i++)
        {
            
            if(today.compareTo(per[i].getBirthday())>= 18 &&today.compareTo(per[i].getBirthday())<= 28){
                index[count] = i;
                count++;
                
            }
        }
        result = new Person[count];
        for(int i = 0;i<result.length;i++){
            result[i] = per[index[i]];
        }
        if(result.length>=0)
        {
            System.out.println("Juniors: \n");
            for(int i = 0;i<result.length;i++){
                System.out.println(result[i].getName());
                
            }
            System.out.println("\n");
        }
    }
}
