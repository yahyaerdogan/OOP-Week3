package week3;

public class Instructor extends User {
	private Student[] studentList;
	private String courseName;
	
	public Instructor() {
		
	}
	public Instructor(int id,String firstName,String lastName,String courseName,String email) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setCourseName(courseName);
		this.setEmail(email);

		
	}
	

	
	
	public Student[] getStudentList() {
		return studentList;
	}
	public void setStudentList(Student[] studentList) {
		this.studentList = studentList;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
