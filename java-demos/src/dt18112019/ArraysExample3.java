package dt18112019;

import java.util.Scanner;

public class ArraysExample3 {

	public static void main(String[] args) {


		// Declare
		int a[] = new int[5];
		
		// intialize
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Array Elements");
		
		for (int i = 0; i < a.length; i++) {
			
			a[i]= sc.nextInt();
			
		}
		
		
		System.out.println("The Array Elemennts are\n ");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" , ");
			
		}
		
		
		// search for an element
		
		System.out.println("Enter key Search");
		
		int key =sc.nextInt();
		
		int count =0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(key == a[i])
			{
			count++;
			
			}
			
			
		}
		
		
		
		
		if(count!=0)
		{
			System.out.println(key +" Found"+" "+count+" times");
		}
		else
		{
			System.out.println(key+" Not Found");
		}
		
		
		
		
		//  
		// Sorting  2 1 4 5 3 , 1) 1 2 4 3 5,1 2 3 4 5 => 1 2 3 4 5
		
		
		
		for(int i =0;i<a.length;i++)
		{
		for(int j =1;j<a.length;j++)
		{
			int temp ;
			
			if(a[j]<a[j-1])
			{
				temp = a[j-1];
				a[j-1]= a[j];
				a[j] = temp;
			}
		}
		}
		
		
System.out.println("The Array Elemennts After soting are\n ");
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]+" , ");
			
		}
		
		

	}

}
