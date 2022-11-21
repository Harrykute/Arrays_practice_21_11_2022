import java.util.*;


public class Practice4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);

        int[] marks={ 100,70,80,71,98};
        
        // using for loop

       // for(int i=0;i<marks.length;i++){

           // System.out.print(marks[i]+" ");
       // }

        //using for each loop

        //for(int element:marks){

          //  System.out.print(element+" ");
        //}




        //input array 
        int [] arr=new int[6];

        for(int i=0;i<arr.length;i++){


            arr[i]=sc.nextInt();
        }

        // printing input array using for_each

        for(int element1 : arr){

            System.out.print(element1+" ");
        }








    }
}
