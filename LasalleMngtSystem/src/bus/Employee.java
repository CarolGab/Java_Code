package bus;

public class Employee extends Member
{
	private double salary;
	
	public double getSalary()
	{
		return this.salary;
	}
	public void setSalary(double value)
	{
		this.salary=value;
	}
	public Employee()
	{
		super();
		this.salary=0.00;
	}
	public Employee(long id, String fn, String ln, double salary)
	{
		super(id, fn, ln);
		this.salary=salary;		
	}
	public String toString()
	{
		return super.toString() + " - " + this.salary;
	}

}
