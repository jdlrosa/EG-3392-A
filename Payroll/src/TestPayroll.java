/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 TestPayroll
 */
public class TestPayroll {

	public static void main(String[] args) {
		// Force an InvalidName Exception
		try {
			Payroll WorkerA = new Payroll("", 123, 25, 10);
			System.out.println(WorkerA);
		} catch (InvalidName e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidID e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidWorkHours e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidRate e) {
			System.out.println("Error - " + e.getMessage());
		}

		// Force an InvalidID Exception
		try {
			Payroll WorkerB = new Payroll("Allen Walker", -456, 50, 15);
			System.out.println(WorkerB);
		} catch (InvalidName e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidID e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidWorkHours e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidRate e) {
			System.out.println("Error - " + e.getMessage());
		}

		// Force an InvalidWorkHours Exception
		try {
			Payroll WorkerC = new Payroll("Robbie Reyes", 789, 100, 20);
			System.out.println(WorkerC);
		} catch (InvalidName e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidID e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidWorkHours e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidRate e) {
			System.out.println("Error - " + e.getMessage());
		}

		// Force an InvalidRate Exception
		try {
			Payroll WorkerD = new Payroll("Barry Allen", 201, 75, 50);
			System.out.println(WorkerD);
		} catch (InvalidName e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidID e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidWorkHours e) {
			System.out.println("Error - " + e.getMessage());
		} catch (InvalidRate e) {
			System.out.println("Error - " + e.getMessage());
		}

	}

}
