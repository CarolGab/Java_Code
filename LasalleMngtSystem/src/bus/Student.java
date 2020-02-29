package bus;

public class Student extends Member
{
	private double feesPerSession;
	
	public double getFeesPerSession()
	{
		return this.feesPerSession;
	}
	public void setFeesPerSession(double value)
	{
		this.feesPerSession=value;
	}
	public Student()
	{
		super();
		this.feesPerSession=0.00;
	}
	public Student(long id, String fn, String ln, double feesPerSession)
	{
		super(id, fn, ln);
		this.feesPerSession=feesPerSession;		
	}
	public String toString()
	{
		return super.toString() + " - " + this.feesPerSession;
	}
}
