package dt18112019;

import java.util.ArrayList;

public class ArrayListExample {
	enum Month {Jan,Feb};
	public static void main(String[] args) {


		 ArrayList<Integer> list = new ArrayList<Integer>();
		 list.add(12);
		 list.add(45);
		 
		 list.add(0, 10);
		 System.out.println(list);
		 
		Month b ;
		b =Month.Feb;
		System.out.println(b);
		
		

	}

}
