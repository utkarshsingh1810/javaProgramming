import java.util.*;

public class javaInp{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("What is you name");
        String input = scn.nextLine();
        System.out.println(input);
      
      //  int number = scn.nextInt(); for number input 
       // float num = scn.float();


        scn.close();
        //It is necesary to use scn.close to prevet error  
        //we can use next  ifvwe use one word without space


 


    }

}    
