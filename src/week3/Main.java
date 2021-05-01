package week3;

public class Main {

	public static void main(String[] args) {
		
		Student yahya = new Student(1,"yahya", "erdogan", "yahyaerdogan1199@gmail.com");
		
		Instructor engin = new Instructor(1,"engin", "demirog", "java-react", "test@mail.com");
		
		engin.setStudentList(new Student[] {yahya});
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.registerStudent(yahya);
		userManager.registerStudent(engin);
		studentManager.getRegisteredCourses(yahya);
		instructorManager.getStudents(engin);
	}

}
