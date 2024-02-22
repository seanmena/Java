/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.pkg2.tip.sean.mena;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author sean
 */
public class Ex2TipSeanMena
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//      Set up my imports
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        Scanner s = new Scanner(System.in);
        
//      Declare values
        double cost;
        double gratuity;
        int tipPercent;
        double totalPrice;

        
//      Scanner to get values
        System.out.println("How much was your meal?");
        cost = s.nextDouble();
        
        System.out.println("What percentage would you like to tip?");
        tipPercent = s.nextInt();

        
//      Math time
        gratuity = cost * ((double)tipPercent / 100);
        totalPrice = cost + gratuity;    
        
        
        
//      Here goes my outputs
        System.out.println("Your tip should be $" + numberFormat.format(gratuity));          
        System.out.println("Which would make your total price $" + numberFormat.format(totalPrice));
        
    }
    
}
