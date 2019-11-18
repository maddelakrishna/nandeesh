package dt16112019;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {


		int[] a= { 100,50,60,90};
		
		Arrays.parallelSort(a);
		
		for(int i=0;i<a.length;++i)
		{
			System.out.print(a[i]);
		}
	
		System.out.println();
		System.out.println(Arrays.binarySearch(a, 160));
		
	}

}
