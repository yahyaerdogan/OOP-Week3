package week3;

public class Student extends User {
	private String[] registeredCourses;
	private String currentCourse;
	
	public Student() {
		
	}
	public Student(int id,String firstName,String lastName,String email) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setEmail(email);

		
	}
	public String[] getRegisteredCourses() {
		return registeredCourses;
	}
	public void setRegisteredCourses(String[] registeredCourses) {
		this.registeredCourses = registeredCourses;
	}
	public String getCurrentCourse() {
		return currentCourse;
	}
	public void setCurrentCourse(String currentCourse) {
		this.currentCourse = currentCourse;
	}
}
