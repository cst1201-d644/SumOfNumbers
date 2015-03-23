package cst1201;

import java.util.Scanner;

/**
 *
 * Devya Gurung
 */

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
        System.out.print("Please enter a positive non zero integer: ");
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        
               
        int sum = 0;
        for (int num = 1; num <= maxNumber; num++) {
            sum += num;
        }

        System.out.println("The sum is : " + sum);

    }

}
