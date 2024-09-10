// BrianFlores 20240907
// ECE 373 Assignment #1

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ElectricalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare Variables
		String customerName;
		int item1Quant, item2Quant, item3Quant;
		double item1Cost = 144.82;
		double item2Cost = 667.83;
		double item3Cost = 1871.88;
		double totalAmount, totalTax, totalWithTax;
		
		// Gets customer name 
		System.out.print("Enter customer name:");
		// System.in to read user input
		Scanner input = new Scanner(System.in);
		customerName = input.nextLine(); 
		
		// Dialog boxes to read quantity of each item from the order form
		item1Quant = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity for 120V 500 Watts (5A) Motor & Equipment Outlets for $144.82 each:"));
		item2Quant = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity for 50 Amp 1 Phase 208V A.C. 60 Cycle for $667.83 each:"));
		item3Quant = Integer.parseInt(JOptionPane.showInputDialog("Enter the quantity for 100 Amp 3 Phase 208V A.C. 60 Cycle for $1,871.88 each:"));
		
		// Display data using dialog boxes
		JOptionPane.showMessageDialog(null, String.format("The quantity for 120V 500 Watts (5A) Motor & Equipment Outlets is: %d", item1Quant));
		JOptionPane.showMessageDialog(null, String.format("The quantity for 50 Amp 1 Phase 208V A.C. 60 Cycle is: %d", item2Quant));
		JOptionPane.showMessageDialog(null, String.format("The quantity for 100 Amp 3 Phase 208V A.C. 60 Cycle is: %d", item3Quant));
		
		// Calculate the total amount w/ and without tax using one combined operation and tax itself
		totalAmount = (item1Quant * item1Cost) + (item2Quant * item2Cost) + (item3Quant * item3Cost);
		totalTax = totalAmount * 0.086;
		totalWithTax = totalAmount + totalTax;
		// Find the hundreds digit using the modulus operator
		int hundredDigit = (int) totalWithTax/ 100 % 10;
		
		// Formatted output data using System.out.printf
	      System.out.printf("Customer Name: %s\n", customerName);
	      System.out.printf("Total Amount Before Tax: $%.2f\n", totalAmount);
	      System.out.printf("Tax: $%.2f\n", totalTax);
	      System.out.printf("Total with Tax: $%.2f\n", totalWithTax);
	      System.out.printf("Hundreds Digit of the Total: %d\n", hundredDigit);
	
	    input.close();
	    System.exit(0);
		
	}

}
