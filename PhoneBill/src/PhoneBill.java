/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 PhoneBill
 */
public abstract class PhoneBill {

	private double monthlyRate;

	public PhoneBill(double monthlyRate) {
		this.monthlyRate = monthlyRate;
	}

	public double getMonthlyRate() {
		return monthlyRate;
	}

	public abstract double calculateBill(int time);
}