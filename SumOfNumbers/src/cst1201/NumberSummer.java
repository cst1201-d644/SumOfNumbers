package cst1201;
import java.util.Scanner;
public class NumberSummer {

    public static void main(String[] args) {
        /*
        Write a program that asks the user for a positive nonzero integer value. 
        The program should use a loop to get the sum of all the integers from 1 
        up to the number entered. For example, if the user enters 50, the loop 
        will find the sum of 1, 2, 3, 4, ... 50.
         */
        Scanner keyboard=new Scanner(System.in);
        int userinput=50;
        int sum=0;
      
       if (userinput>=0)
            while ( userinput>=0 ){
                sum += userinput;
                System.out.println(userinput--);}
       System.out.println(sum);
                
        
                        
                
        
    }
        
}
