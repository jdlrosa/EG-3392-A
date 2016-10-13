/*
 * Julian De La Rosa
 * EG 3392
 * Assignment 7 Payroll
 */
public class Payroll {

	private String name;
	private int id;
	private int workHours;
	private int payRate;

	public Payroll() {
		name = "unknown";
		id = 0;
		workHours = 0;
		payRate = 0;
	}

	public Payroll(String name, int id, int workHours, int payRate)
			throws InvalidName, InvalidID, InvalidWorkHours, InvalidRate {
		if (name.equals(""))
			throw new InvalidName();
		if (id <= 0)
			throw new InvalidID(id);
		if (workHours > 84 || workHours < 0)
			throw new InvalidWorkHours(workHours);
		if (payRate > 25 || payRate < 0)
			throw new InvalidRate(payRate);
		this.name = name;
		this.id = id;
		this.workHours = workHours;
		this.payRate = payRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getWorkHours() {
		return workHours;
	}

	public void setWorkHours(int workHours) {
		this.workHours = workHours;
	}

	public int getPayRate() {
		return payRate;
	}

	public void setPayRate(int payRate) {
		this.payRate = payRate;
	}

	public int grossPay() {
		return workHours * payRate;
	}

}
