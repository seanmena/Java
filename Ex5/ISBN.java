/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex5;

import javax.swing.JOptionPane;

/**
 *
 * @author sean
 */
public class ISBN {

    /**
     * @param args the command line arguments
     */
    static void askDialogue() {

        int reply = JOptionPane.showConfirmDialog(null, "Enter another Number?", "Hello", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            insertNum();
        } else {
            JOptionPane.showMessageDialog(null, "GOODBYE");
            System.exit(0);
        }

    }

    static void insertNum() {
        String numberString = JOptionPane.showInputDialog("Enter the first 9 digits of your ISBN");

        int realNum = Integer.parseInt(numberString);
        int checkDigit = findNum(realNum);
        JOptionPane.showMessageDialog(null, "The complete ISBN is: " + realNum + checkDigit);
        askDialogue();

    }

    static int findNum(int input) {
        String inputString = Integer.toString(input);
        int sum = 0;
        int multiplier = 1;

        for (int i = 0; i < inputString.length(); i++) {
            int digit = Character.getNumericValue(inputString.charAt(i));
            sum = digit * multiplier;
            multiplier++;
        }

        int checkDigit = sum % 11;
        return checkDigit;
    }

    public static void main(String[] args) {
        insertNum();
    }

}
