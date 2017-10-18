/**
 * Write a description of class Interest here.
 *
 * Altbaum, Lane
 * Version 1)
 */
import java.util.Scanner;
import java.text.NumberFormat;
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;
           double charges;
           double newBalance;
           double minimumPayment; 
           double interest;
           
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter your previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the amount of charges to your account: ");
           charges = scan.nextDouble();
 
           newBalance = charges + previousBalance;
           if(newBalance == 0) {
               interest = 0;
           }
           else {
               interest = 0.02;
           }
           newBalance = newBalance + (interest * newBalance);
           
           if(newBalance < 50) {
               minimumPayment = newBalance; 
           }
           else if(newBalance >= 50 && newBalance <= 300) {
               minimumPayment = 50.00;
           }
           else {
               minimumPayment = 0.2 * newBalance;
           }
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println();
           System.out.println("Previous Balance:           " + money.format(previousBalance));
           System.out.println("Additional Charges:         " + money.format(charges));
           System.out.println("Interest:                   " + interest);
           System.out.println();
           System.out.println("New Balance:                " + money.format(newBalance));
           System.out.println();
           System.out.println("Minimum Payment:            " + money.format(minimumPayment));
   }
}

