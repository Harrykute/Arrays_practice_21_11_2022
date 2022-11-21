public class Practice10 {

    // pairs of array 

    public static void printPairs(int number[]){

        for(int i=0;i<number.length;i++){

            int curr=number[i]; //2,4,6,8,10

            for(int j=i+1;j<number.length;j++){ // here we take j=i+1; because take number after first 

                System.out.print("("+curr+","+number[j]+")");


            }
            System.out.println();// new line new pairs
        }



    }

    public static void main(String[] args) {
        
        int number[]={2,4,6,8,10}; // here we declare an array to make pairs

        printPairs(number);
    }
    



}
