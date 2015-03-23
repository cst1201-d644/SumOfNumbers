/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sumofnumbers;

import javax.swing.JOptionPane;

/**
 *
 * @author class
 */
public class SumOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 

int num;

String input = JOptionPane.showInputDialog("Enter a positive nonzero integer");
num = Integer.parseInt(input);
int sum = 0;

while(num >= 1){
sum += num;
num--;
}
JOptionPane.showMessageDialog(null, "Sum: " + sum);

}
}
   

