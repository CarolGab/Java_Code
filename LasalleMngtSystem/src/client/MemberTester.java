package client;
import bus.*;

public class MemberTester {

	public static void main(String[] args) 
	{
		Student aStudent1=new Student();
		Student aStudent2= new Student(1001,"lili","bel",12345.75);
		
		Employee aEmployee1=new Employee(2000, "jenn", "kamel", 50000);
		Employee aEmployee2=new Employee(2001, "manny", "moo", 60000);
		
		aStudent1.setId(1000);
		aStudent1.setFeesPerSession(7777.77);
		aStudent1.setFn("lala");
		aStudent1.setLn("delinelle");
		
		
		System.out.println(aStudent1);
		System.out.println(aStudent2);
		System.out.println(aEmployee1);
		System.out.println(aEmployee2);
		System.exit(0);
	}

}
