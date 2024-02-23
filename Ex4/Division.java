/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex4;

import javax.swing.JOptionPane;

/**
 *
 * @author sean
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numberString = JOptionPane.showInputDialog("Enter a number to see if it is divisible by 5 and 6");
        int realNum = Integer.parseInt(numberString);
        System.out.print(realNum);

        boolean divisibleFive = (realNum % 5 == 0);
        boolean divisibleSix = (realNum % 6 == 0);

        if (divisibleFive && divisibleSix) {
            JOptionPane.showMessageDialog(null, realNum + " is divisible by 5 and 6");
        } else if (divisibleFive || divisibleSix) {
            JOptionPane.showMessageDialog(null, realNum + " is evenly divisible by 5 or 6, but not both");
        } else if (divisibleFive ^ divisibleSix) {
            JOptionPane.showMessageDialog(null, realNum + " is evenly divisible by 5 or 6");
        } else {
            JOptionPane.showMessageDialog(null, realNum + " is not evenly divisible by 5 or 6");
        }

        // To check if it is divisible by just one (not in the assignemnt instructions)
        // } else if (!divisibleFive && divisibleSix) {
        // JOptionPane.showMessageDialog(null, realNum + " is evenly divisible by 6 but
        // not by 5");
        // } else if (divisibleFive && !divisibleSix) {
        // JOptionPane.showMessageDialog(null, realNum + " is evenly divisible by 5 but
        // not by 6");
        // }

    }

}
