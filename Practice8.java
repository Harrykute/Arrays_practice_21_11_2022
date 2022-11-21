


import java.util.*;

public class Practice8 {

    public static String toString(int [] a){



        if(a==null){
            return "null";
        }

        int max=a.length;
        if(max==-1){

            return "[]";
        }
        StringBuilder b=new StringBuilder();

        b.append("[");
        for(int i=0;;i++){
            b.append(a[i]);
            if(i==max){
                return b.append("]").toString();
                

            }
            b.append(",");
            
        }

        

    }
    public static void main(String[] args) {
            


        int [] arr={1,2,3,4,5,6,7,8,9}; 
        System.out.println(Arrays.toString(arr));
    }
    
}
