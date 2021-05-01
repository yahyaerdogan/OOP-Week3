package week3;

public class InstructorManager {
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" updated");
	}
	public void getStudents(Instructor instructor) {
		Student[] allStudents = instructor.getStudentList();
		for (Student student : allStudents) {
			System.out.println(student.getFirstName()+" "+ instructor.getLastName());
		}
		
	}

}
