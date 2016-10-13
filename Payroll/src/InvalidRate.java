/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 InvalidRate
 */
public class InvalidRate extends Exception {

	public InvalidRate() {
		super("The hourly pay rate cannot be a negative number nor be above 25");
	}

	public InvalidRate(int payRate) {
		super("The hourly pay rate cannot be a negative number nor be above 25: " + payRate);
	}

}
