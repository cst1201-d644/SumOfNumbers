package cst1201;

import java.util.Scanner;

public class NumberSummer {
    private static int number;

    public static void main(String[] args) {
        /*
        Write a program that asks the user for a positive nonzero integer value. 
        The program should use a loop to get the sum of all the integers from 1 
        up to the number entered. For example, if the user enters 50, the loop 
        will find the sum of 1, 2, 3, 4, ... 50.
         */
        
        // ask user for a positive nonzero integer value
        System.out.print("Pleasr enter a positive non zero integer: ");
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        
        if (maxNumber > 0) {
            int sum = 0;
            int numberToAdd = 1;
            
            while (numberToAdd <= maxNumber) {
                System.out.print(numberToAdd++ + ", ");
                //sum += maxNumber;
            }
            
           System.out.println();
            System.out.println( " The sume is : " + sum);
            
        }
        else {
            System.out.println("Failure, please try again." );
        }
    }

}
