//Omar AlSaud - AlSaudAssignment5 - Purchase expense calculator
// (10/18/2016) 9PM
import java.util.Scanner;

public class AlSaudAssignment5 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input the following with a blank space in between: Cash on hand, Number of Purchase Items, Price Per Item, Sales tax as a percent.");
		
		double COH = input.nextDouble();                        //stores Cash on Hand input
		int IP = input.nextInt();								//stores Number of items to be purchased
		double PPI = input.nextDouble();						//stores Price per item
		double ST = input.nextDouble()/100;						//stores sales tax and converts it from percentage
		
		
		double total = IP * PPI;								//calculates total before tax
		double tax = ST * total;								//calculates tax amount
		double TCOP = total + tax;								//calculates total plus the tax. It is done in a manner that allows 0% sales tax without affecting the other calculations
		double RCAP = COH - TCOP;								//calculates remaining cash on hand after purchase
		char percent = '%';										//stores '%' sign for use in output
		
		
		
		System.out.printf("Cash on hand: %.2f %n", COH);					//prints out cash on hand
		System.out.printf("Number of items: %d %n", IP);					//prints out number of items to be purchased
		System.out.printf("Price per item: %.2f %n", PPI);					//prints out price per item
		System.out.printf("Sales tax: %.1f%c  %n%n", ST*100, percent);		//converts sales tax back to percentage and prints it out with the stored percentage sign
		
		System.out.printf("Total cost of purchase: %.2f %n%n", TCOP);       //prints out total cost of purchase
		
		if (RCAP >= 0) {														//evaluates remaining cash and outputs it unless amount is below zero. in that case it outputs a message
			
			System.out.printf("Remaining cash after purchase: %.2f", RCAP);
		}
		else {
			System.out.println("Unable to make purchase");
		}
		
		
		
		
		

	}

}
