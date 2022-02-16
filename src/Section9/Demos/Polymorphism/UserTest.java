package Section9.Demos.Polymorphism;

public class UserTest {
	
	public void printUserType(User u) {
		u.printUserType();
	}
	
	public void approveReview(Staff s) {
		// s.approveReview(); -- this does not work, there is no approve review in staff
		// ((Editor)s).approveReview(); // this is explicit casting
		if (s instanceof Editor) {
			((Editor) s).approveReview();
		} else {
			System.out.println("Invalid object passed!");
		}
	}
	
	public static void main(String[] args) {
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();
		
		UserTest ut = new UserTest();
		ut.printUserType(user); // User
		ut.printUserType(staff); // Staff
		ut.printUserType(editor); // Editor
		
		/////////////////////
		// editor.approveWebLink(); -- this does not work
		editor.postAReview(); // Staff: postAReview
		editor.saveWebLink(); // User: saveWebLink
							  // Staff: postAReview
		
		///////////////////////////////////////
		UserTest usert = new UserTest();
		// usert.approveReview(new Staff()); we can not use staff here, only editor and subtypes
		usert.approveReview(new Staff()); // Invalid object passed!
		usert.approveReview(new Editor());

	}

}
