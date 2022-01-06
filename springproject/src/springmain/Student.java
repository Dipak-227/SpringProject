package springmain;

public class Student {
 
	  private int  studId;
	  private String studName;
	  private String studAddress;
	  
	  
	  //Setter Method
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	
	//Constructor...
	
	public Student(int studId, String studName, String studAddress) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	// toString Method
	@Override
	public String toString() {
		return "Student [studId= " + studId + ", studName= " + studName + ", studAddress= " + studAddress + "]";
	}
	
	
		 
	

}
