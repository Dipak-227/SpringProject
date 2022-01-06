package springmain;

public class School {
	
	private int schoolRegNo;
	private String schoolName;
	private int schoolStud;
	private int schoolTeacher;
	private String schoolGrant;
	
	
	public int getSchoolRegNo() {
		return schoolRegNo;
	}
	public void setSchoolRegNo(int schoolRegNo) {
		this.schoolRegNo = schoolRegNo;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public int getSchoolStud() {
		return schoolStud;
	}
	public void setSchoolStud(int schoolStud) {
		this.schoolStud = schoolStud;
	}
	public int getSchoolTeacher() {
		return schoolTeacher;
	}
	public void setSchoolTeacher(int schoolTeacher) {
		this.schoolTeacher = schoolTeacher;
	}
	public String getSchoolGrant() {
		return schoolGrant;
	}
	public void setSchoolGrant(String schoolGrant) {
		this.schoolGrant = schoolGrant;
	}
	
	@Override
	public String toString() {
		return "School [schoolRegNo=" + schoolRegNo + ", schoolName=" + schoolName + ", schoolStud=" + schoolStud
				+ ", schoolTeacher=" + schoolTeacher + ", schoolGrant=" + schoolGrant + "]";
	}
	
}
