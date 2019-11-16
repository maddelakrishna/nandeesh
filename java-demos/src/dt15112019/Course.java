package dt15112019;

public class Course {
	
	private int cid;
	private String courseName;
	private double fees;
	private static final int x=90;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
	//constructor
	
	
	public Course()
	{
		
	}
	
	public Course(int cid, String courseName)
	{
		this.cid = cid;
		this.courseName = courseName;
	}
	public Course(int cid, double fees)
	{
		this.cid = cid;
		this.fees = fees;
	}
	
	public Course(int cid,String courseName,double fees)
	{
		
		this(cid,courseName);
		/*
		 * this.cid = cid; this.courseName = courseName;
		 */
		
		this.fees = fees;
		
	}
	
	// getter and setter
	
	
	
	

}
