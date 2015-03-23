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
        int number;
        int number2=0;
        int sum=0;
        System.out.print("Input a positive nonzero integer value: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        
        while (number>=number2)
        {
            sum = sum + number2;
            number2++;
        }
        System.out.println("The sum is "+ sum+".");
    

    }
}
