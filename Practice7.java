
// Find the largest no from given array
import java.util.*;
public class Practice7 {

    public static int getLargest(int arr[]){
        int largest=Integer.MIN_VALUE; // here I take -ve  infinity value 

        for(int i=0;i<arr.length;i++){
           
            if(arr[i]>largest){ // here chech condition arr element arr compare each other

            

            largest = arr[i]; // store the big no in largest veriable(largest)

            }



        }
        return largest; // return largest no value
        

    }
    public static void main(String[] args) {
         
        int arr[]= { 48,56,12,9,5,6}; // given array 

        System.out.println(getLargest(arr)+" "); //printing the largest no of given array

    }
   
}
