package dt14112019;

import java.util.Scanner;

public class EmployeeDemo {

   
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		   System.out.println("Enter the id and Name");
		   
		   
		   
		   
		   // Object Creation
		   
		   Employee emp;
	     //   emp = new Constructor();
		   
		   emp = new Employee();
		   
		   
		   
		   System.out.println(emp.getId()+" "+emp.getName());
		   
		   
		   
		   
		   
		   
		   
		   
		   Employee e = new Employee(1020,"nandeesh");// default constructor
		   
		   int id = scan.nextInt();
		   String name = scan.next();
		   
		   System.out.println(e.getId()+"  "+e.getName());
		     e.setId(id);
		     e.setName(name);
		   
		   System.out.println(e.getId()+"  "+e.getName());
		  
		/*
		 * double sal = scan.nextDouble(); e.calCuateSalary(sal); // call
		 * 
		 * double x = e.calCuateSalary(678); System.out.println(x);
		 */
	}

}
