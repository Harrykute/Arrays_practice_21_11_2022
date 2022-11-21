
public class Practice1{

    public static int linearS(int number[], int key){

        for(int i=0;i<=number.length;i++){

            if(number[i]==key){


                return i;
            }
            



            
        }
        return -1;


    }







  public static void main(String[] args) {
    int number[]={10,4,5,6,7,8,9,12,16};
    int key=7;
    

    int index = linearS(number, key);

    if(index==-1){
        System.out.println("not found in given array");

    }
    else{
        System.out.println("the no. is fond on index : "+index);
    }





  }


}