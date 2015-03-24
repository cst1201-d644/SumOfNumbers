package cst1201;

import java.util.Scanner;

public class NumberSummer {

    public static void main(String[] args) {
        System.out.print("Please enter a positive non-zero integer: ");
        Scanner scan = new Scanner(System.in);
        int maxNumber = scan.nextInt();
        
        if (maxNumber > 0) {
            int sum = 0;
            int numberToAdd = 1;
            
            while (numberToAdd <= maxNumber) {                
                System.out.print(numberToAdd + ", ");
                sum += numberToAdd;
                numberToAdd++;
            }
            System.out.println("The sum is: " + sum);
        }
        else {
            System.out.println("Failure, please try again.");
    }}}


