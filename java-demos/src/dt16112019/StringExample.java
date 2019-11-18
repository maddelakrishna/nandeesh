package dt16112019;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
	
		
		String aName ="krishna"; // Literal
		
		String anotherName;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter Name");
		anotherName = sc.nextLine();
		if(aName.equals(anotherName))
		{
			System.out.println(aName+" "+anotherName+" are Equal");
		}
		else
		{
			System.out.println(aName+" "+anotherName+"  not are Equal");
			
		}



	}

}
