/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ex2;

import javax.swing.JOptionPane;

/**
 *
 * @author sean
 */
public class Interest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {

            /*
             * theres $100 each month
             * annual interest rate is 5% monthly is .05/12 = .00417
             * after first month the value math is 100 * (1+ 0.00416) = 100.417
             * after the second month the math is (100 + 100.417) * (1 + 0.00417) = 201.252
             * after the third month the math is (100 + 200.252) * (1 + 0.00417) = 302.507
             * etc. etc.
             */

            // Prompt the user for a monthly savings amount
            String saveAmountString = JOptionPane.showInputDialog("Please enter your monthly savings amount");
            double saveAmount = Double.parseDouble(saveAmountString);

            // Prompt the user for an annual percentage rate (use a double)
            String annualRateString = JOptionPane.showInputDialog("Please enter your annual savings rate");
            double annualRate = Double.parseDouble(annualRateString);

            double newRate = annualRate / 100 / 12;

            double newAmount = 0;
            double totalSavings = 0;

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < 6; i++) {
                if (i == 0) {
                    newAmount = saveAmount * (1 + newRate);
                } else {
                    newAmount = (newAmount + saveAmount) * (1 + newRate);
                }

                totalSavings += newAmount;

                output.append("Month ").append(i + 1).append(": ").append(String.format("%.2f", newAmount))
                        .append("\n");
            }

            output.append("\nTotal Savings for the first 6 months: ").append(String.format("%.2f", totalSavings));

            // Display the results using a dialogue box
            JOptionPane.showMessageDialog(null, output.toString(), "Savings Calculator Results",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
