package dt18112019;

public abstract class Employee {

	
	protected int eid;
	protected String name;
	protected double salary;
	
	// constructor
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	
	// getters and setters
	
	
	
	
	
	// methods
	
	public void displayEmployee()
	{
		System.out.println(eid +" "+name+" "+salary);
	}
	
	

public abstract void add(int a,int b);


}
