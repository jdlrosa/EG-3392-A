/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 NegativeInterestRate
 */

public class NegativeInterestRate extends Exception {

	public NegativeInterestRate() {
		super("Error: Negative interest rate");
	}

	public NegativeInterestRate(double amount) {
		super("Error: Negative interest rate: " + amount);
	}
}
