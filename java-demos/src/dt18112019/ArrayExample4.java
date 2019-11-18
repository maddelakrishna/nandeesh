package dt18112019;

public class ArrayExample4 {

	public static void main(String[] args) {


		
		/*  Matrix
		 *  1(0,0) 2 (0,1) 3(0,2)
		 *  2(1,0) 3(1,1) 4(1,2)
		 *  3(2,0) 4(2,1) 5(2,2)
		 *         2 X 3
		 *         
		 *         1 2 3
		 *         2 3 4
		 *         
		 */
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
