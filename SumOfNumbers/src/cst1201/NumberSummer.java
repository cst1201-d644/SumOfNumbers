      package cst1201;
       // author  Anu Alli 
        // date 3/23/2015

     import javax.swing.JOptionPane;

      public class NumberSummer {

      public static void main(String[] args) {
        // assign a variable to hold user input
        int num1;

        // Ask user only positive nonzero  valueand store.
        // store users value user value in varible
        String userinput = JOptionPane.showInputDialog("please input a positive nonzero integer");
        // change userinput to a data-type int

        num1 = Integer.parseInt(userinput);
        // Assign a variable to retain the sum
        int addup = 0;
        // constructing a loop to acquire the sum of integers  counting from ( 1 - user input ) 
        while (num1 >= 1) {

            addup += num1;
            num1--;
        }
        JOptionPane.showMessageDialog(null, "Sum of integer = " +addup);

        /*
         Write a program that asks the user for a positive nonzero integer value. 
         The program should use a loop to get the sum of all the integers from 1 
         up to the number entered. For example, if the user enters 50, the loop 
         will find the sum of 1, 2, 3, 4, ... 50.
         */
    }

}
