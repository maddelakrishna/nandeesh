package dt15112019;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.ToDoubleBiFunction;
public class MathDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		
 int a =90;
 int b = 80;
		System.out.println(Math.max(a, b));
		
		System.out.println(Math.pow(2, 3));
		

		LocalDate toady = LocalDate.now();
		System.out.println(toady);
		System.out.println(toady.plusWeeks(2));
	}

}
