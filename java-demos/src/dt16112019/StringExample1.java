package dt16112019;

public class StringExample1 {

	public static void main(String[] args) {

// double- Double.parseDouble()

  String s1 ="123";
  String s2 = "234";
  
  
  System.out.println(s1.compareTo(s2));
  System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));
		  
		

  String s4=new String("krishna");
  
  System.out.println(s4.concat("kumar"));
  System.out.println("s4 :"+s4);
  StringBuffer sb = new StringBuffer();
  
  sb.append("Krishna").append(" ").append("kumar");
  
  System.out.println(sb);
  
  
  
  StringBuilder sb1 = new StringBuilder();
 
	}

}
