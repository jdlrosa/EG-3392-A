/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 NegativeStartingBalance
 */

public class NegativeStartingBalance extends Exception {

	public NegativeStartingBalance() {
		super("Error: Negative starting balance");
	}

	public NegativeStartingBalance(double amount) {
		super("Error: Negative starting balance: " + amount);
	}
}
