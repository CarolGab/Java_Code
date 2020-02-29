package bus;

public class Member 
{
	private long id;
	private String fn;
	private String ln;
	
	public long getId()
	{
		return this.id;
	}
	public void setId(long value) 
	{
		this.id=value;
	}
	public String getFn()
	{
		return this.fn;
	}
	public void setFn(String value)
	{
		this.fn=value;
	}
	public String getLn()
	{
		return this.ln;
	}
	public void setLn(String value)

	{
		this.fn=value;
	}

	public Member()
	{
		this.id=0;
		this.fn="Undefined";
		this.ln="Undefined";
		
	}
	
	public Member(long id, String fn, String ln)
	{
		this.id=id;
		this.fn=fn;
		this.ln=ln;
		
	}
	public String toString() 
	{
		return this.id + " - " + this.fn + " - " + this.ln;
	}
}
