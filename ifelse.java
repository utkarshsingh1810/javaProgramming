import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scn.nextInt();
        if(age>=18){
            System.out.println("Adult : Drive , Drink , Vote");
        }
        if(age<18 && age>11){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Not adult : Not drive , Not vote , Not drink");
        }
        scn.close();
        
    }
    
}
