/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 BankAccount
 */
public class BankAccount {
	private double balance; // Account balance
	private double interestRate; // Account interest rate added
	private double interest; // Account interest added

	public BankAccount() {
		balance = 0.0;
		interestRate = 0.0;
		interest = 0.0;
	}

	public BankAccount(double startBalance, double intRate) throws NegativeStartingBalance, NegativeInterestRate {
		if (startBalance < 0)
			throw new NegativeStartingBalance(startBalance);
		if (intRate < 0)
			throw new NegativeInterestRate(intRate);
		balance = startBalance;
		interestRate = intRate;
		interest = 0.0;
	}

	public BankAccount(String str) {
		balance = Double.parseDouble(str);
		interestRate = Double.parseDouble(str);
		interest = Double.parseDouble(str);
	}

	public void deposit(double amount) throws NegativeStartingBalance {
		balance += amount;
	}

	public void deposit(String str) {
		balance += Double.parseDouble(str);
	}

	public void withdraw(double amount) throws NegativeStartingBalance {
		balance -= amount;
	}

	public void withdraw(String str) {
		balance -= Double.parseDouble(str);
	}

	public void rate() {
		interest = balance * interestRate;
		balance += interest;
	}

	public void rate(String str) {
		balance += Double.parseDouble(str);
	}

	public void setBalance(double b) {
		balance = b;
	}

	public void setBalance(String str) {
		balance = Double.parseDouble(str);
	}

	public double getBalance() {
		return balance;
	}
}
