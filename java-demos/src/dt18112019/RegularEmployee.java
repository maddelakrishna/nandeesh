package dt18112019;

public class  RegularEmployee  extends Employee{
	
	private double bonus;

	public RegularEmployee(int eid, String name, double salary, double bonus) {
		super(eid, name, salary);
		this.bonus = bonus;
	}

	
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	
	@Override
	public void displayEmployee()
	{
		System.out.println(eid +" "+name+" "+salary+" "+bonus);
	}



	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	

}
