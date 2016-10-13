/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 AccountTest
 */

public class AccountTest {
	public static void main(String[] args) {
		// Force a NegativeStartingBalance exception.
		try {
			BankAccount account1 = new BankAccount(-100.0, 0.05);
			System.out.println(account1);
		} catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		} catch (NegativeInterestRate e) {
			System.out.println(e.getMessage());
		}
		// Force a NegativeInterestRate exception
		try {
			BankAccount account2 = new BankAccount(100.0, -0.05);
			System.out.println(account2);
		} catch (NegativeStartingBalance e) {
			System.out.println(e.getMessage());
		} catch (NegativeInterestRate e) {
			System.out.println(e.getMessage());
		}
	}
}