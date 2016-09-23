/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 TestBill
 */

import java.util.Scanner; 

public class TestBill {

	public static void main(String[] args) {
		
		double cr;
		double mr;
		int t;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("This program will calculate your"
				+ "phone bill for you \nWhat is your call rate?");
		  cr = kb.nextDouble();
		  
		  System.out.println("What is your monthly rate?");
		  mr = kb.nextDouble();
		  
		  System.out.println("How many minutes did you talk?");
		  t = kb.nextInt();
		  LongDistanceBill Bill = new LongDistanceBill(mr, cr);
		  
		  System.out.println("Your monthly bill is $" + Bill.calculateBill(t));
		  
		  kb.close();

	}

}
