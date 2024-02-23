/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex6;

import javax.swing.JOptionPane;

/**
 *
 * @author sean
 */
public class Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String numberString = JOptionPane.showInputDialog("How many addition problems would you like to attempt?");
        int asNum = Integer.parseInt(numberString);
        int score = 0;

        for (int i = 0; i < asNum; i++) {

            int num1 = (int) (Math.random() * 50) + 1;
            int num2 = (int) (Math.random() * 50) + 1;

            int sum = num1 + num2;

            String answerQuestion = JOptionPane.showInputDialog("What is " + num1 + " + " + num2 + "?");

            int asInt = Integer.parseInt(answerQuestion);

            if (asInt == sum) {
                JOptionPane.showMessageDialog(null, "Correct!");
                score++;
                JOptionPane.showMessageDialog(null, "You have " + score + " right out of " + asNum + " so far");

            } else {
                JOptionPane.showMessageDialog(null, "Incorrect! The correct answer is " + sum);
                JOptionPane.showMessageDialog(null, "You have " + score + " right out of " + asNum + " so far");
            }
        }

        JOptionPane.showMessageDialog(null, "You got " + score + " Correct out of " + asNum);

    }

}
