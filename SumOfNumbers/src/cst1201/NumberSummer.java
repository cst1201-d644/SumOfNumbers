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
        System.out.print("Enter A Positive Integer [Not Zero]: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 0) {
            int sum = 0;
            int addnumber = 1;
            while (addnumber <= number) {
                sum += addnumber++;
            }
            System.out.println(); //prints an extra line.
            System.out.println("The sum is: " + sum);
        }
    }
}
