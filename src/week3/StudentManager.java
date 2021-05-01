package week3;

public class StudentManager {
	public void getRegisteredCourses(Student student) {
		String[] registeredCourses = student.getRegisteredCourses();
		for (String courseName : registeredCourses) {
			System.out.println("name: " +student.getFirstName()+" - course"+courseName);
		}
		}	
}
