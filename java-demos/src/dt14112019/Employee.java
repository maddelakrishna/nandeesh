package dt14112019;
import java.util.Scanner;
public class Employee {
	
  private int id;
 private String name;
 
private Address address;
 
 
 
 
 
 public Employee()
 {
	 id = 23;
	 name ="abc";
 }
 
 
 
 public Employee(int i, String n)
 {
	 id = i;
	 name = n;
 }
 
 public int getId()
 {
	 return id;
 }
 
 
 public String getName()
 {
	 return name;
 }
	
public void setId(int i)	
{
	id = i;
}
	
public void setName(String n)
{
	name = n;
}
	
	
	
	public void calCuateSalary(double salary)
	{
		
		double newsal ;
		
		newsal = salary * 2.3;
		
		System.out.println("new Salary :"+newsal);
	}
	
	
	public double calCuateSalary(int salary)
	{
		
		double newsal ;
		newsal = salary * 2.3;
		return newsal;
		
	}
	
	

}
