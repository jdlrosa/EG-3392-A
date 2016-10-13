/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 InvalidWorkHours
 */
public class InvalidWorkHours extends Exception {

	public InvalidWorkHours() {
		super("The number of hours worked cannot be negative nor be above 84");
	}

	public InvalidWorkHours(int workHours) {
		super("The number of hours worked cannot be negative nor be above 84: " + workHours);
	}

}
