/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 5 LongDistanceBill
 */
public class LongDistanceBill extends PhoneBill {
	
	private double callRate;
	
	public LongDistanceBill(double monthlyRate, double callRate){
		super(monthlyRate);
		this.callRate = callRate;
	}

	public double getCallRate() {
		return callRate;
	}
	
	public double calculateBill(int time){
		return (callRate * time) + getMonthlyRate();
	}

}
