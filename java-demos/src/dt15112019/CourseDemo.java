package dt15112019;

public class CourseDemo {

	public static void main(String[] args) {

          Course c = new Course(123,"Java",57000.00);
         System.out.println(c.getCid()+" "+c.getCourseName()+" "+c.getFees());
		
          Course c1 = new Course(124,"Java script",5700.00);
          System.out.println(c1.getCid()+" "+c1.getCourseName()+" "+c1.getFees());
          

	}

}
