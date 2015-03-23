

package sum.of.numbers;

import javax.swing.JOptionPane;

/**
 *
 * @author class
 */
public class Sumofnumbers {

   
   
    
public static void main(String[] args) {

int num;
String input1;
    input1 = JOptionPane.showInputDialog("Enter a nonzero integer");
num = Integer.parseInt(input1);
int sum = 0;
while(num >= 1){
sum += num;
num--;
}
    JOptionPane.showMessageDialog(null, "Sum: " + sum);
    }
    
    
}
