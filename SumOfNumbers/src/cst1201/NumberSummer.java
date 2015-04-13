package cst1201;

import java.util.Scanner;

public class NumberSummer {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive non-zero integer: ");
        int maxNumber = scan.nextInt();
        
        if (maxNumber > 0){
            int sum = 0;
            int numberToAdd = 1;

            while (numberToAdd <= maxNumber){
                sum += numberToAdd;
                numberToAdd++;
            }
            System.out.println("The sum of 1 to "+maxNumber+" is "+sum+".");
        }
        
        else{
            System.out.println("Failure, please try again.");
        }
    }
}