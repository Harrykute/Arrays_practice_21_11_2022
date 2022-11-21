public class Practice2 {
    public static void linears2(String hotel[],  String food ){
        
        

        for(int i=0;i<=hotel.length;i++){


            if(hotel[i]==food){

              System.out.println("this is on : " + i);
              break;

               
            }
            else{
                System.out.println(" not found");
                break;
            }
        }
        
        
        

        


    }
    







    public static void main(String[] args) {
        String hotel[] = { "Apple", "Samosa", " Papad", "Juice","Dosa"};
        
        String food="Samosa";
        linears2(hotel, food);

       // if(index=-1){
          //  System.out.println("this food not found in hotel");
       // }
       // else{
           // System.out.println("food is here please tell Quntity : "+index);
       // }


    }
}
