/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 InvalidID
 */
public class InvalidID extends Exception {
	
	public InvalidID() {
		super("The ID cannot be a negative number");
	}
	
	public InvalidID(int id) {
		super("The ID cannot be a negative number: " + id);
	}

}
