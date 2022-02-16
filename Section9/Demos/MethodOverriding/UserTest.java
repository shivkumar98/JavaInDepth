package Section9.Demos.MethodOverriding;

public class UserTest {

	// part 1
	public static void main(String[] args) {
		User user = new User();
		User staff = new Staff();
		staff.postAReview("no review");
		
		// what if we wanted the base class's implementation?
		// then we need to call the super class method
		
		staff.postAReview("my review");
		// result: Staff: postAReview
		// User: postAReview

		
	}
	
}
