package dt16112019;

import java.util.Scanner;

public class ArrayExample5 {

	public static void main(String[] args) {


		int a[][] = new int[2][2];
		
		System.out.println("Enter array Elements");
Scanner sc = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= sc.nextInt();
			}
		}

		
		System.out.println("The Array Elements are");
		
		
for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
