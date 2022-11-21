

//Arrays Object 

class Student{
    public int roll_no;
    public String name;


    Student(int roll_no , String name){  // Counstructor to call direct argumnets

        this.roll_no=roll_no;
        this.name=name;


    }

}



public class Practice5 {
    

public static void main(String[] args) {
    
    Student [] arr; // here we create arr of student class 

    arr = new Student[3]; // initialise the and allocating memory

    // after that i store value to each index 

    arr[0]=new Student(1,"aman");
    arr[1]=new Student(2,"Vaubhav");
    arr[2]=new Student(3,"Shikhar");

    // after I print he value using for loop 

    for(int i=0;i<arr.length;i++){

        System.out.println(arr[i].roll_no+" : " + arr[i].name);
        

    }





}



}
