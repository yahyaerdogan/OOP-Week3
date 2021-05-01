package week3;

public class UserManager {
	public void registerStudent(User user) {
		System.out.println("added: "+ user.getFirstName()+" "+user.getLastName());
		
	}
	public void deleteStudent(User user) {
		System.out.println("deleted: "+user.getFirstName()+" "+user.getLastName() );
		
	}
}

