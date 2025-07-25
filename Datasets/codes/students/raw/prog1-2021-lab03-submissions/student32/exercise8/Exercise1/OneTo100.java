package lu.uni.programming1.lab3.exercise8.Exercise1;

public class OneTo100 {

    public static void main(String[] args){
        int arr[] = new int [100];
        for (int i=0; i< arr.length; i++){
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }
    
}