package myaddressbookv2;

public class Teacher extends Person {
	// 필드
	private String teacherNo;

	// getter/setter
	public String getTeacherNo() {
		return teacherNo;
	}
	public void setTeacherNo(String teacherNo) {
		this.teacherNo = teacherNo;
	}

	public void print() {
		System.out.printf("%s\t%s\t%s\n", 
				// getName(), getPhoneNo(), getStudentNo());
				super.getName(), super.getPhoneNo(), this.getTeacherNo());
	}
	
}
