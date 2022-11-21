import java.util.*;


public class Practice3 {
    public static int getLargest(int number[]){
        
        
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){

            if(number[i]>largest){

                largest=number[i];
            }
        }

        return largest;






    }


    public static void main(String[] args) {
        int number[]={1,2,3,5,666};
        

        System.out.println("the largest no of given array : "+getLargest(number));
        


    }
}
